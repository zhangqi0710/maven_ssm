package cn.itcast.controller;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param
     * @param request
     * @return
     */
    @RequestMapping("/login")
    public ModelAndView findOne(User user1, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.login(user1);
        if(user != null){
            //将用户信息存储到session域中
            request.getSession().setAttribute("user",user);
            //登录成功
            modelAndView.setViewName("/WEB-INF/loginSuccess.jsp");
            return modelAndView;
        }else {
            //登录失败
            modelAndView.addObject("info","用户名或密码错误!");
            modelAndView.setViewName("/login.jsp");
            return modelAndView;
        }
    }

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> userList = userService.findAll();
        modelAndView.addObject("userList",userList);
        modelAndView.setViewName("/WEB-INF/userList.jsp");
        return modelAndView;
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public String delete(int id){
        userService.delete(id);
        return "/user/findAll";
    }

    /**
     * 用户注册
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("/regist")
    public String regist(User user, HttpServletRequest request, Model model){
        userService.regist(user);
        model.addAttribute("info","恭喜你,注册成功!请<a href="+request.getContextPath()+"/login.jsp>登录</a>");
        return "/regist.jsp";
    }
}
