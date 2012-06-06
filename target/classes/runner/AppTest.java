package runner;


import jscon.com.service.UserService;
import jscon.com.vo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shuyue@cn.ibm.com
 * Date: 12-6-6
 * Time: 下午1:36
 * To change this template use File | Settings | File Templates.
 */
public class AppTest {
    private static SqlSessionFactory sessionFactory = null;
        private static Reader reader;
        private static String CONF_FILE = "configuration.xml";

        static{
            try{
                reader = Resources.getResourceAsReader(CONF_FILE);
                sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        public static void main(String[] args)
        {
            SqlSession session = sessionFactory.openSession();
            try {
                UserService userServiceObj = session.getMapper(UserService.class);
/*                User user = new User();
                user.setUser_id("007");
                user.setUsernick("James Bond");
                user.setDate(null);
                user.setEmail("bond@gmail.com");
                user.setTags("smart,handsome");*/
                List<User> users = userServiceObj.getAllUser();
                session.commit();
                for(User u:users)
                {
                    System.out.println(u);
                }

            } finally {
                session.close();
            }
        }
}
