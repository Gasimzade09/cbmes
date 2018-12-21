package com.employe.cbmes.model;

import javax.persistence.*;

@Entity
@Table (name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    private String home_city;
    private int age;
    private String job_title;
    private int experience;
    private String photo;


    public Employee(String name, String surname, int age, String homeCity, int experince, String photo, String job_title) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.home_city = homeCity;
        this.experience = experince;
        this.photo = photo;
        this.job_title = job_title;
    }

    public Employee() { }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHome_City(String home_city) {
        this.home_city = home_city;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getHomeCity() {
        return home_city;
    }

    public int getExperience() {
        return experience;
    }

    public String getPhoto() {
        return photo;
    }

    public String getJob_title() {
        return job_title;
    }
}
