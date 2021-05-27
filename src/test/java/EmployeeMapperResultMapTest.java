import com.zyj.bean.Employee;
import com.zyj.mapper.DepartmentMapperResultMap;
import com.zyj.mapper.EmployeeMapperResultMap;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * @ClassName EmployeeMapperResultMapTest
 * @Auther: YaJun
 * @Date: 2021 - 05 - 25 - 13:24
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class EmployeeMapperResultMapTest {

    SqlSession sqlSession = null;
    EmployeeMapperResultMap mapper = null;
    @Before
    public void before() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession(true);
            mapper = sqlSession.getMapper(EmployeeMapperResultMap.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        sqlSession.close();
    }


    @Test
    public void testGetEmpAndDept() {
        Employee emp = mapper.getEmpAndDept(8);
        System.out.println(emp);
    }

    @Test
    public void testGetDeptAndEmployeesStep() {
        Employee step = mapper.getEmpAndDeptStep(8);
        System.out.println(step);
        System.out.println("---------------");
//        System.out.println(step.getDept());
    }

}
