package pojo;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logininterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requesturi=request.getRequestURI();
        if(requesturi.indexOf("/login")>0||requesturi.indexOf("/tologin")>0){
            return true;
        }

            HttpSession session=request.getSession();
            Object user=session.getAttribute("user");
            if(user!=null){
                return true;
            }
            request.setAttribute("msg","请先登录");
            request.getRequestDispatcher("/login").forward(request,response);
            System.out.println(1);
            return false;

    }
}
