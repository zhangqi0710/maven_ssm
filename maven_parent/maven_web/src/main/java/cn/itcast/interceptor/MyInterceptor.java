package cn.itcast.interceptor;

import cn.itcast.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //从session中获取user
        User user = (User) request.getSession().getAttribute("user");
        if(user == null){
            //域中没有用户信息,用户尚未登录
            response.sendRedirect(request.getContextPath() + "/login.jsp");
            return false;
        }else {
            return true;
        }
    }
}
