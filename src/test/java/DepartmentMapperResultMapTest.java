import com.zyj.bean.Department;
import com.zyj.mapper.DepartmentMapperResultMap;
import com.zyj.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * @ClassName DepartmentMapperResultMapTest
 * @Auther: YaJun
 * @Date: 2021 - 05 - 24 - 21:25
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class DepartmentMapperResultMapTest {

    SqlSession sqlSession = null;
    DepartmentMapperResultMap mapper = null;
    @Before
    public void before() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession(true);
            mapper = sqlSession.getMapper(DepartmentMapperResultMap.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        sqlSession.close();
    }

    /**
     * 测试resultMap查询
     */
    @Test
    public void testDepartmentResultMap() {
        Department deptAndEmp = mapper.getDeptAndEmp(3);
        System.out.println(deptAndEmp);
        System.out.println("---------------");
        System.out.println(deptAndEmp.getEmployees());
    }

    /**
     * 测试分步查询
     */
    @Test
    public void testDeptAndEmployeesStep() {
        Department deptAndEmployeesStep = mapper.getDeptAndEmployeesStep(2);
        System.out.println(deptAndEmployeesStep);
        System.out.println("----------------");
        System.out.println(deptAndEmployeesStep.getEmployees());
    }

}
