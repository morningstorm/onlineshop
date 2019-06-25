package com.isoft.controller.before;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.exception.UserLoginNoException;

@Controller
public class BaseController {
    //前台执行任何方法之前都先执行此方法
    @ModelAttribute
    public void isLogin(HttpSession session,HttpServletRequest request) throws UserLoginNoException{
        if(session.getAttribute("tbsysuser")==null) {
            throw new UserLoginNoException("您还没有登录");
        }
    }
}


