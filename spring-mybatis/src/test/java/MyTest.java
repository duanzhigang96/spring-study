import com.duan.mapper.UserMapper;
import com.duan.pojo.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    static Logger logger = Logger.getLogger(MyTest.class);

    @Test
    public void test() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        User user1 = new User(9, "baowendong9");

        userMapper.addUser(user1);
        userMapper.deleteUser(2);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        User user1 = new User(10, "baowendong10");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 10);
        map.put("userName", "213123");
        userMapper.addUser2(map);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }

    //模糊查询
    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        //java 模糊查询需要使用通配符 会有sql注入分析
        List<User> users = userMapper.getUserLike("%bao%");
        for (User user : users) {
            System.out.println(user);
        }
    }

    //分页查询
    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        map.put("startIndex", 1);
        map.put("pageSize", 2);
        List<User> users = userMapper.selectAll(map);
        for (User user : users) {
            System.out.println(user);
        }

        //方式二
        //RowBounds
    }
}
