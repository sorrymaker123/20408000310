package pojo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class controller {
    @RequestMapping("/a")
    public String hello(){
        return "success";
    }
    @RequestMapping("/find")
    public String find(HttpServletRequest request){
        String id=request.getParameter("id");
        System.out.println(id);
        return "success";

    }
    @RequestMapping("getidandname")
    public String getidandname(String id,String name){
        System.out.println("id="+id+"name="+name);
        return "success";
    }
    @RequestMapping("/register")
    public String register(user user){
        String username=user.getUsername();
        String password=user.getPassword();
        System.out.println(user);
        return "register";

    }
    @RequestMapping("/birthday")
    public String getbirthday(@DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday){
        System.out.println(birthday);
        return "success";
    }
    @RequestMapping("/product")
    public String product(@RequestParam("proIds") List<String> proIds){
        for(String proid:proIds){
            System.out.println(proid);
        }


        return "product";
    }
    @RequestMapping("/order")
    public String order(user user){
        String username=user.getUsername();

  String orderid=user.getOrder().getOrderid();
                System.out.println(username+orderid);
return "order";

    }
    @RequestMapping("/response")
    public void showresponse(HttpServletResponse response) throws IOException {
        response.getWriter().println("ok");
    }

}
