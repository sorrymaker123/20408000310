package pojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Controller
public class except {
    @RequestMapping("/null")
    public void shownull()
    {
        ArrayList<String> list=null;
        list.get(1);
    }

}
