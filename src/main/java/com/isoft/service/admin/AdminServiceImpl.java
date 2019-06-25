package com.isoft.service.admin;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.isoft.dao.admin.AdminDao;
import com.isoft.entity.TbSysuser;

public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Autowired
   // private AdminTypeDao adminTypeDao;
    @Override
    public String login(TbSysuser tbSysuser, Model model, HttpSession session) {
        if(adminDao.login(tbSysuser) != null && adminDao.login(tbSysuser).size()>0) {
            session.setAttribute("tbSysuser", tbSysuser);
            //添加商品与修改商品页面使用
            //session.setAttribute("goodsType", adminTypeDao.selectGoodsType());
            return "admin.main";
        }
        model.addAttribute("msg","用户名或密码错误！");
        return "admin/login";
    }
}
