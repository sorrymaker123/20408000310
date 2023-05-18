package pojo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
@Controller
public class Usercontroller {
    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    @RequestMapping("/tologin")
    public String tologin(){
        return "login";
    }
    @RequestMapping("/info")
    public String info(){
        return "info";
    }
    @RequestMapping("/login")
    public String login(user user, Model model, HttpSession session){
        //
        String username=user.getUsername();
        String password=user.getPassword();
        if(username!=null&&username.equals("123456")&password!=null&password.equals("12345678")){
            session.setAttribute("user",user);
            return "main";
        }

           model.addAttribute("msg","登陆失败");
           return "login";


    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }


}
