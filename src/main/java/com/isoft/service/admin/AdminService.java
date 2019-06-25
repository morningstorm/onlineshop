package com.isoft.service.admin;

import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import com.isoft.entity.TbSysuser;



public interface AdminService {

    public String login(TbSysuser tbSysuser, Model model, HttpSession session);

}
