package pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

import static org.junit.Assert.*;

public class HelloSpringTest {
    public static void main(String[] args) {
       ApplicationContext appletContext=new ClassPathXmlApplicationContext("app.xml");
        HelloSpring helloSpring=  appletContext.getBean("Hello",HelloSpring.class);
        System.out.println(helloSpring);
    }

}