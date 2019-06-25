package com.isoft.controller.admin;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.isoft.entity.TbSysuser;
import com.isoft.service.admin.AdminService;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/admin")
    public String toLogin(@ModelAttribute TbSysuser tbSysuser) {
        return "admin/login";
    }

    @RequestMapping("/admin/login")
    public String login(@ModelAttribute TbSysuser tbSysuser,Model model,HttpSession session) {
        return adminService.login(tbSysuser, model, session);
    }

    @RequestMapping("/exit")
    public String exit(@ModelAttribute TbSysuser tbSysuser ,HttpSession session) {
        session.invalidate();
        return "admin/login";
    }
}
