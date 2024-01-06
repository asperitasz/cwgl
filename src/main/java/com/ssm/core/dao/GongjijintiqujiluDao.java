package com.ssm.core.dao;


import com.ssm.core.po.Gongjijintiqujilu;

import java.util.List;

public interface GongjijintiqujiluDao  {

    public Gongjijintiqujilu getGongjijintiqujilu(int id);
    public List<Gongjijintiqujilu> getGongjijintiqujiluList(Gongjijintiqujilu gongjijintiqujilu);
    public int add(Gongjijintiqujilu gongjijintiqujilu);
    public int update(Gongjijintiqujilu gongjijintiqujilu);
    public int delete(int id);
}
