package com.ssm.core.service.impl;

import com.ssm.core.dao.UserinfoDao;
import com.ssm.core.po.Userinfo;
import com.ssm.core.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service("userinfoService")
@Transactional
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoDao userinfoDao;

    public UserinfoDao getUserinfoDao() {
        return userinfoDao;
    }

    public void setUserinfoDao(UserinfoDao userinfoDao) {
        this.userinfoDao = userinfoDao;
    }

    @Override
    public Userinfo getUserinfo(int id) {
        Userinfo userinfo = userinfoDao.getUserinfo(id);
        return userinfo;
    }
    public List<Userinfo> getUserinfoList(Userinfo userinfo){

       return userinfoDao.getUserinfoList(  userinfo);

    }
    public int add(Userinfo  userinfo){

        return userinfoDao.add( userinfo);

    }
    public int update(Userinfo userinfo){

        return userinfoDao.update(userinfo);

    }
public int delete(int id){

        return userinfoDao.delete(id);

    }
}
