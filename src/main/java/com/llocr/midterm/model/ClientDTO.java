package com.llocr.midterm.model;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;

public class ClientDTO {
    private String name;
    private int age;
    private String gender;
    private String birth;
    private String type;
    private String description;
    private MultipartFile consentFile;

    public ClientDTO() {
    }

    public ClientDTO(String name, int age, String gender, String birth, String type, String description, MultipartFile counsetFile) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birth = birth;
        this.type = type;
        this.description = description;
        this.consentFile = counsetFile;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birth=" + birth +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", consentFile=" + consentFile +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setConsentFile(MultipartFile consentFile) {
        this.consentFile = consentFile;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBirth() {
        return birth;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public MultipartFile getConsentFile() {
        return consentFile;
    }
}
