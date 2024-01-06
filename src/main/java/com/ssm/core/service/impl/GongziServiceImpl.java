package com.ssm.core.service.impl;

import com.ssm.core.dao.GongziDao;
import com.ssm.core.po.Gongzi;
import com.ssm.core.service.GongziService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service("gongziService")
@Transactional
public class GongziServiceImpl implements GongziService {

    @Autowired
    private GongziDao gongziDao;

    public GongziDao getGongziDao() {
        return gongziDao;
    }

    public void setGongziDao(GongziDao gongziDao) {
        this.gongziDao = gongziDao;
    }

    @Override
    public Gongzi getGongzi(int id) {
        Gongzi gongzi = gongziDao.getGongzi(id);
        return gongzi;
    }
    public List<Gongzi> getGongziList(Gongzi gongzi){

       return gongziDao.getGongziList(  gongzi);

    }
    public int add(Gongzi  gongzi){

        return gongziDao.add( gongzi);

    }
    public int update(Gongzi gongzi){

        return gongziDao.update(gongzi);

    }
public int delete(int id){

        return gongziDao.delete(id);

    }
}
