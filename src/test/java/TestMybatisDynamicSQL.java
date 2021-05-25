import com.zyj.bean.Employee;
import com.zyj.mapper.DepartmentMapperResultMap;
import com.zyj.mapper.EmployeeMapperDynamicSQL;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestMybatisDynamicSQL
 * @Auther: YaJun
 * @Date: 2021 - 05 - 24 - 22:25
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestMybatisDynamicSQL {

    SqlSession sqlSession = null;
    EmployeeMapperDynamicSQL mapper = null;

    @Before
    public void before() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession(true);
            mapper = sqlSession.getMapper(EmployeeMapperDynamicSQL.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        sqlSession.close();
    }

    @Test
    public void testWhereAndIf() {
        Employee employee = new Employee();
        employee.setDid(2);
        employee.setGender(1);
        List<Employee> employees = mapper.getEmployeesByConditionIfWhere(employee);
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Test
    public void testEmployeesByConditionIfTrim() {
        Employee employee = new Employee();
        employee.setGender(1);
//        employee.setDid(2);
        List<Employee> employees = mapper.getEmployeesByConditionIfTrim(employee);
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Test
    public void testUpdateEmpByConditionSet() {
        Employee employee = new Employee();
        employee.setId(9);
        employee.setGender(1);
        employee.setEmail("ccc@xxx.com");
        employee.setLastName("修改1");
        boolean b = mapper.updateEmpByConditionSet(employee);
        System.out.println("动态修改测试：" + b);
    }

    @Test
    public void testEmployeesByConditionChoose() {
        Employee employee = new Employee();
        employee.setGender(1);
        employee.setDid(2);
        List<Employee> employees = mapper.getEmployeesByConditionChoose(employee);
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Test
    public void testGetEmployeesByIds() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        List<Employee> employees = mapper.getEmployeesByIds(list);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
