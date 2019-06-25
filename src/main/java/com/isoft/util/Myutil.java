package com.isoft.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpSession;
import com.isoft.entity.TbUser;
import com.isoft.entity.TbUser;


public class Myutil {
    //获得时间字符串
    public static String getStringID() {
        String id=null;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        id=simpleDateFormat.format(date);
        return id;
    }
    //获得用户id
    public static long getUserId(HttpSession session) {
        TbUser tbuser = (TbUser) session.getAttribute("tbuser");
        return tbuser.getId();
    }
}
