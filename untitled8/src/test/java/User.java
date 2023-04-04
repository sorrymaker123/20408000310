import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.User1;

public class User {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("aaa.xml");
        User1 user1= (User1) ac.getBean("4",User1.class);
        System.out.print(user1);

    }
}
