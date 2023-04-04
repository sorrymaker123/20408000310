import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.service.Userservice;

public class tttt {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("aaa.xml");
        Userservice userservice= (Userservice) ac.getBean("7");
        boolean flag=userservice.login("张三","123");
        System.out.print("123");
    }
}
