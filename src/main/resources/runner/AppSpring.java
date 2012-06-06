package runner;

import jscon.com.service.UserService;
import jscon.com.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shuyue@cn.ibm.com
 * Date: 12-6-6
 * Time: 下午3:39
 * To change this template use File | Settings | File Templates.
 */
public class AppSpring {
    public static void main(String[] args)
    {
        ApplicationContext aContext = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/database.xml");
        UserService userService = aContext.getBean(UserService.class);
        List<User> users = userService.getAllUser();
        for(User u:users)
        {
            System.out.println(u);
        }
    }

}
