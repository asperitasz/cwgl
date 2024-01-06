package com.ssm.core.service;

import com.ssm.core.po.Jiaofeixitong;

import java.util.List;

public interface JiaofeixitongService {
    public Jiaofeixitong getJiaofeixitong(int id);
    public List<Jiaofeixitong> getJiaofeixitongList(Jiaofeixitong jiaofeixitong);
    public int add(Jiaofeixitong jiaofeixitong);
    public int update(Jiaofeixitong jiaofeixitong);
    public int delete(int id);

}
