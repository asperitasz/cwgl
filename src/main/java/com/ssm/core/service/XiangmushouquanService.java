package com.ssm.core.service;

import com.ssm.core.po.Xiangmushouquan;

import java.util.List;

public interface XiangmushouquanService {
    public Xiangmushouquan getXiangmushouquan(int id);
    public List<Xiangmushouquan> getXiangmushouquanList(Xiangmushouquan xiangmushouquan);
    public int add(Xiangmushouquan xiangmushouquan);
    public int update(Xiangmushouquan xiangmushouquan);
    public int delete(int id);

}
