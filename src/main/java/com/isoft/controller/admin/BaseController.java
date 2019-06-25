package com.isoft.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.exception.AdminLoginNoException;

@Controller
public class BaseController {
    //在每次一处理方法前执行该方法
    @ModelAttribute
    public void idLogin(HttpSession session,HttpServletRequest request) throws AdminLoginNoException{
        if(session.getAttribute("tbuser")==null) {
            throw new AdminLoginNoException("您还没有登录!");
        }
    }
}



