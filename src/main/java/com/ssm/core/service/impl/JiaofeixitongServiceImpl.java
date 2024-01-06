package com.ssm.core.service.impl;

import com.ssm.core.dao.JiaofeixitongDao;
import com.ssm.core.po.Jiaofeixitong;
import com.ssm.core.service.JiaofeixitongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service("jiaofeixitongService")
@Transactional
public class JiaofeixitongServiceImpl implements JiaofeixitongService {

    @Autowired
    private JiaofeixitongDao jiaofeixitongDao;

    public JiaofeixitongDao getJiaofeixitongDao() {
        return jiaofeixitongDao;
    }

    public void setJiaofeixitongDao(JiaofeixitongDao jiaofeixitongDao) {
        this.jiaofeixitongDao = jiaofeixitongDao;
    }

    @Override
    public Jiaofeixitong getJiaofeixitong(int id) {
        Jiaofeixitong jiaofeixitong = jiaofeixitongDao.getJiaofeixitong(id);
        return jiaofeixitong;
    }
    public List<Jiaofeixitong> getJiaofeixitongList(Jiaofeixitong jiaofeixitong){

       return jiaofeixitongDao.getJiaofeixitongList(  jiaofeixitong);

    }
    public int add(Jiaofeixitong  jiaofeixitong){

        return jiaofeixitongDao.add( jiaofeixitong);

    }
    public int update(Jiaofeixitong jiaofeixitong){

        return jiaofeixitongDao.update(jiaofeixitong);

    }
public int delete(int id){

        return jiaofeixitongDao.delete(id);

    }
}
