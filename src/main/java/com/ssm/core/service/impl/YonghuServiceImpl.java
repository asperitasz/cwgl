package com.ssm.core.service.impl;

import com.ssm.core.dao.YonghuDao;
import com.ssm.core.po.Yonghu;
import com.ssm.core.service.YonghuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service("yonghuService")
@Transactional
public class YonghuServiceImpl implements YonghuService {

    @Autowired
    private YonghuDao yonghuDao;

    public YonghuDao getYonghuDao() {
        return yonghuDao;
    }

    public void setYonghuDao(YonghuDao yonghuDao) {
        this.yonghuDao = yonghuDao;
    }

    @Override
    public Yonghu getYonghu(int id) {
        Yonghu yonghu = yonghuDao.getYonghu(id);
        return yonghu;
    }
    public List<Yonghu> getYonghuList(Yonghu yonghu){

       return yonghuDao.getYonghuList(  yonghu);

    }
    public int add(Yonghu  yonghu){

        return yonghuDao.add( yonghu);

    }
    public int update(Yonghu yonghu){

        return yonghuDao.update(yonghu);

    }
public int delete(int id){

        return yonghuDao.delete(id);

    }
}
