import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.HelloSpring;

class HelloSpringTest {

    public static void main(String[] args) {
    ApplicationContext ac=new ClassPathXmlApplicationContext("aaa.xml");
    HelloSpring helloSpring= (HelloSpring) ac.getBean("3");
    helloSpring.show();

    }
}