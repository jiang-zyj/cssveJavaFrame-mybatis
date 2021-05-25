package com.zyj.bean;

import java.util.List;

/**
 * @ClassName Department
 * @Auther: YaJun
 * @Date: 2021 - 05 - 24 - 21:03
 * @Description: com.zyj.bean
 * @version: 1.0
 */
public class Department {

    private Integer id;

    private String deptName;

    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
