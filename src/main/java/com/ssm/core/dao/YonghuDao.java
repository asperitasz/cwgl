package com.ssm.core.dao;


import com.ssm.core.po.Yonghu;

import java.util.List;

public interface YonghuDao  {

    public Yonghu getYonghu(int id);
    public List<Yonghu> getYonghuList(Yonghu yonghu);
    public int add(Yonghu yonghu);
    public int update(Yonghu yonghu);
    public int delete(int id);
}
