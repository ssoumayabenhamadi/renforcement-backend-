package com.example.demo.Service;

import com.example.demo.Entity.School;
import com.example.demo.Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    public School saveSchool(School school) {
        return schoolRepository.save(school);
    }

    public Iterable<School> findAllSchool() {
        return schoolRepository.findAll();
    }

    public Optional<School> findById(Long id) {
        return schoolRepository.findById(id);
    }

    public Optional<School> updateSchool(Long id, School updatedSchool) {
        return schoolRepository.findById(id)
                .map(existingSchool -> {
                    existingSchool.setName(updatedSchool.getName());
                    existingSchool.setAddress(updatedSchool.getAddress());
                    return schoolRepository.save(existingSchool);
                });
    }

    public boolean deleteSchool(Long id) {
        if (schoolRepository.existsById(id)) {
            schoolRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
