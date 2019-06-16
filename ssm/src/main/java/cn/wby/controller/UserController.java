package cn.wby.controller;

import cn.wby.pojo.User;
import cn.wby.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户的控制层
 *Created by abc on 2019/6/13.
 */
@Controller
@RequestMapping(value ="/user")
public class UserController {
    //注入service层
    @Autowired
    private UserService userService;

    //用户登录
    @RequestMapping(value = "/login")
    public String login(@RequestParam String username,@RequestParam String password,Model model){
       User user=userService.login(username);
        if(user!= null){
            if(user.getPassword().equals(password)){
                //登录成功
                return "page/page";
            }
            else{
                model.addAttribute("message","登录失败");
                return "page/loginInfo";
            }
        }
        else{
            model.addAttribute("message","用户名或密码有错");
            return "page/loginInfo";
        }
    }
    //跳回登录页面
    @RequestMapping(value = "index")
    public String index(){
        return "index";
    }
}
