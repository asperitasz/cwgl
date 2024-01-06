package com.ssm.core.service.impl;

import com.ssm.core.dao.GongjijintiqujiluDao;
import com.ssm.core.po.Gongjijintiqujilu;
import com.ssm.core.service.GongjijintiqujiluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service("gongjijintiqujiluService")
@Transactional
public class GongjijintiqujiluServiceImpl implements GongjijintiqujiluService {

    @Autowired
    private GongjijintiqujiluDao gongjijintiqujiluDao;

    public GongjijintiqujiluDao getGongjijintiqujiluDao() {
        return gongjijintiqujiluDao;
    }

    public void setGongjijintiqujiluDao(GongjijintiqujiluDao gongjijintiqujiluDao) {
        this.gongjijintiqujiluDao = gongjijintiqujiluDao;
    }

    @Override
    public Gongjijintiqujilu getGongjijintiqujilu(int id) {
        Gongjijintiqujilu gongjijintiqujilu = gongjijintiqujiluDao.getGongjijintiqujilu(id);
        return gongjijintiqujilu;
    }
    public List<Gongjijintiqujilu> getGongjijintiqujiluList(Gongjijintiqujilu gongjijintiqujilu){

       return gongjijintiqujiluDao.getGongjijintiqujiluList(  gongjijintiqujilu);

    }
    public int add(Gongjijintiqujilu  gongjijintiqujilu){

        return gongjijintiqujiluDao.add( gongjijintiqujilu);

    }
    public int update(Gongjijintiqujilu gongjijintiqujilu){

        return gongjijintiqujiluDao.update(gongjijintiqujilu);

    }
public int delete(int id){

        return gongjijintiqujiluDao.delete(id);

    }
}
