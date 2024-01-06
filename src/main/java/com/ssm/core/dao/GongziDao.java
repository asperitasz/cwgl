package com.ssm.core.dao;


import com.ssm.core.po.Gongzi;

import java.util.List;

public interface GongziDao  {

    public Gongzi getGongzi(int id);
    public List<Gongzi> getGongziList(Gongzi gongzi);
    public int add(Gongzi gongzi);
    public int update(Gongzi gongzi);
    public int delete(int id);
}
