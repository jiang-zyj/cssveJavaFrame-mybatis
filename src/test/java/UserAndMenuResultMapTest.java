import com.zyj.bean.User;
import com.zyj.mapper.EmployeeMapperDynamicSQL;
import com.zyj.mapper.UserMenuMapperResultMap;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @ClassName UserAndMenuResultMapTest
 * @Auther: YaJun
 * @Date: 2021 - 05 - 26 - 11:28
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class UserAndMenuResultMapTest {

    SqlSession sqlSession = null;
    UserMenuMapperResultMap mapper = null;

    @Before
    public void before() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession(true);
            mapper = sqlSession.getMapper(UserMenuMapperResultMap.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        sqlSession.close();
    }


    @Test
    public void testUserAndMenuResultMap() {

        List<User> allUserAndMenu = mapper.getAllUserAndMenu();
        for (User u : allUserAndMenu) {
            System.out.println(u);
        }
    }
}
