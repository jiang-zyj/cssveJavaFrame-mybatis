package com.zyj.mapper;

import com.zyj.bean.Department;

/**
 * @ClassName DepartmentMapperResultMap
 * @Auther: YaJun
 * @Date: 2021 - 05 - 24 - 21:14
 * @Description: com.zyj.mapper
 * @version: 1.0
 */
public interface DepartmentMapperResultMap {

    public Department getDeptAndEmp(Integer id);

    public Department getDeptAndEmployeesStep(Integer id);


}
