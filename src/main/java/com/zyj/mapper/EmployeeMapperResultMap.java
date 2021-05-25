package com.zyj.mapper;

import com.zyj.bean.Employee;

import java.util.List;

/**
 * @ClassName EmployeeMapperResultMap
 * @Auther: YaJun
 * @Date: 2021 - 05 - 24 - 21:43
 * @Description: com.zyj.mapper
 * @version: 1.0
 */
public interface EmployeeMapperResultMap {

    public List<Employee> getEmployeesByDid(Integer id);

}
