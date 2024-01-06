package com.ssm.core.service.impl;

import com.ssm.core.dao.XiangmushouquanDao;
import com.ssm.core.po.Xiangmushouquan;
import com.ssm.core.service.XiangmushouquanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service("xiangmushouquanService")
@Transactional
public class XiangmushouquanServiceImpl implements XiangmushouquanService {

    @Autowired
    private XiangmushouquanDao xiangmushouquanDao;

    public XiangmushouquanDao getXiangmushouquanDao() {
        return xiangmushouquanDao;
    }

    public void setXiangmushouquanDao(XiangmushouquanDao xiangmushouquanDao) {
        this.xiangmushouquanDao = xiangmushouquanDao;
    }

    @Override
    public Xiangmushouquan getXiangmushouquan(int id) {
        Xiangmushouquan xiangmushouquan = xiangmushouquanDao.getXiangmushouquan(id);
        return xiangmushouquan;
    }
    public List<Xiangmushouquan> getXiangmushouquanList(Xiangmushouquan xiangmushouquan){

       return xiangmushouquanDao.getXiangmushouquanList(  xiangmushouquan);

    }
    public int add(Xiangmushouquan  xiangmushouquan){

        return xiangmushouquanDao.add( xiangmushouquan);

    }
    public int update(Xiangmushouquan xiangmushouquan){

        return xiangmushouquanDao.update(xiangmushouquan);

    }
public int delete(int id){

        return xiangmushouquanDao.delete(id);

    }
}
