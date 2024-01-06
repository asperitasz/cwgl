package com.ssm.core.service;

import com.ssm.core.po.Gongzi;

import java.util.List;

public interface GongziService {
    public Gongzi getGongzi(int id);
    public List<Gongzi> getGongziList(Gongzi gongzi);
    public int add(Gongzi gongzi);
    public int update(Gongzi gongzi);
    public int delete(int id);

}
