package com.ssm.core.service;

import com.ssm.core.po.Gongjijintiqujilu;

import java.util.List;

public interface GongjijintiqujiluService {
    public Gongjijintiqujilu getGongjijintiqujilu(int id);
    public List<Gongjijintiqujilu> getGongjijintiqujiluList(Gongjijintiqujilu gongjijintiqujilu);
    public int add(Gongjijintiqujilu gongjijintiqujilu);
    public int update(Gongjijintiqujilu gongjijintiqujilu);
    public int delete(int id);

}
