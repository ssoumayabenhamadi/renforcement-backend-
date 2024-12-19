package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentWithSchool;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SchoolServiceClient schoolServiceClient;
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    public StudentWithSchool getStudentWithSchool(String studentId) {
        Optional<Student> studentOpt = studentRepository.findById(studentId);

        if (studentOpt.isPresent()) {
            Student student = studentOpt.get();

            Map<String, Object> schoolData = schoolServiceClient.getSchoolById(student.getSchoolId());

            // Retourner les informations combinées
            return new StudentWithSchool(student, schoolData);
        } else {
            throw new RuntimeException("Student not found with id " + studentId);
        }
    }


        public Optional<Student> findStudentById(String id) {
        return studentRepository.findById(id);
    }

    public Iterable<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}
