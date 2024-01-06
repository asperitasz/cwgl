package com.ssm.core.dao;


import com.ssm.core.po.Userinfo;

import java.util.List;

public interface UserinfoDao  {

    public Userinfo getUserinfo(int id);
    public List<Userinfo> getUserinfoList(Userinfo userinfo);
    public int add(Userinfo userinfo);
    public int update(Userinfo userinfo);
    public int delete(int id);
}
