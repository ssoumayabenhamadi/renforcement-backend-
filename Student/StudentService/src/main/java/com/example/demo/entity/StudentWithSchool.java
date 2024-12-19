package com.example.demo.entity;

import java.util.Map;

public class StudentWithSchool {

    private Student student;
    private Map<String, Object> schoolData;

    public StudentWithSchool(Student student, Map<String, Object> schoolData) {
        this.student = student;
        this.schoolData = schoolData;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Map<String, Object> getSchoolData() {
        return schoolData;
    }

    public void setSchoolData(Map<String, Object> schoolData) {
        this.schoolData = schoolData;
    }
}
