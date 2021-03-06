package com.zyj.bean;

import java.util.List;

/**
 * @ClassName Employee
 * @Auther: YaJun
 * @Date: 2021 - 05 - 24 - 21:03
 * @Description: com.zyj.bean
 * @version: 1.0
 */
public class Employee {

    private Integer id;

    private String lastName;

    private String email;

    private Integer gender;

    private Integer did;


    private Department dept;


    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", did=" + did +
                ", dept=" + dept +
                '}';
    }
}
