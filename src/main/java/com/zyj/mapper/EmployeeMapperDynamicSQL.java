package com.zyj.mapper;

import com.zyj.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName EmployeeMapperDynamicSQL
 * @Auther: YaJun
 * @Date: 2021 - 05 - 24 - 22:14
 * @Description: com.zyj.mapper
 * @version: 1.0
 */
public interface EmployeeMapperDynamicSQL {

    public List<Employee> getEmployeesByConditionIfWhere(Employee employee);

    public List<Employee> getEmployeesByConditionIfTrim(Employee condition);

    public boolean updateEmpByConditionSet(Employee condition);

    public List<Employee> getEmployeesByConditionChoose(Employee condition);

    public List<Employee> getEmployeesByIds(@Param("ids") List<Integer> ids);


}
