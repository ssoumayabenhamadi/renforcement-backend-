package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schoolId;

    private String name;

    private String address;

    public long getschoolId(){
        return schoolId;
    }
    public void setschoolId(long schoolId){
        this.schoolId = schoolId;
    }

    public String getName() {

        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name=name;
    }
    public void setAddress(String address) {
        this.address=address;
    }

    // Getters et Setters
}
