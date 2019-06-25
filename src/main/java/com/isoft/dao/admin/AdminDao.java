package com.isoft.dao.admin;

import java.util.List;

import com.isoft.entity.TbSysuser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.isoft.entity.TbSysuser;

@Repository("adminDao")
@Mapper
public interface AdminDao {
    public List<TbSysuser> login(TbSysuser tbSysuser);
}

