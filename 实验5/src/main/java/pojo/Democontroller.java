package pojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Democontroller {
    @RequestMapping("/demo1")
    public String demo(){
        System.out.println("demo1");
        return "success";
    }
    @RequestMapping("/demo2")
    public String demo2(){
        System.out.println("demo2");
        return "success";
    }
}
