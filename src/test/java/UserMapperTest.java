import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyj.bean.User;
import com.zyj.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName UserMapperTest
 * @Auther: YaJun
 * @Date: 2021 - 05 - 24 - 19:25
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class UserMapperTest {

    SqlSession sqlSession = null;
    UserMapper mapper = null;
    @Before
    public void before() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession(true);
            mapper = sqlSession.getMapper(UserMapper.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void queryAllUser() {
        List<User> allUser = mapper.getAllUser();
        System.out.println(allUser);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setName("hu");
        user.setPassword("111");
        boolean b = mapper.addUser(user);
        System.out.println("测试添加：" + b);
    }

    @Test
    public void deleteUser() {
        boolean b = mapper.deleteUserById(1);
        System.out.println("测试删除：" + b);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(2);
        user.setName("tom");
        user.setPassword("123456");
        boolean b = mapper.updateUser(user);
        System.out.println("测试修改：" + b);
    }

    @Test
    public void queryAllUserByPage() {

        PageHelper.startPage(4, 2);

        List<User> users = mapper.getAllUser();

        PageInfo<User> userPageInfo = new PageInfo<>(users);

        System.out.println(userPageInfo);
    }

    @After
    public void after() {
        sqlSession.close();
    }

}
