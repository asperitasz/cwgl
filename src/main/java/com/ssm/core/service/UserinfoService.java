package com.ssm.core.service;

import com.ssm.core.po.Userinfo;

import java.util.List;

public interface UserinfoService {
    public Userinfo getUserinfo(int id);
    public List<Userinfo> getUserinfoList(Userinfo userinfo);
    public int add(Userinfo userinfo);
    public int update(Userinfo userinfo);
    public int delete(int id);

}
