package runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: shuyue@cn.ibm.com
 * Date: 12-6-6
 * Time: 下午3:39
 * To change this template use File | Settings | File Templates.
 */
public class AppSpring {
    ApplicationContext context = new ClassPathXmlApplicationContext("database.xml");

}
