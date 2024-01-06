package com.ssm.core.dao;


import com.ssm.core.po.Xiangmushouquan;

import java.util.List;

public interface XiangmushouquanDao  {

    public Xiangmushouquan getXiangmushouquan(int id);
    public List<Xiangmushouquan> getXiangmushouquanList(Xiangmushouquan xiangmushouquan);
    public int add(Xiangmushouquan xiangmushouquan);
    public int update(Xiangmushouquan xiangmushouquan);
    public int delete(int id);
}
