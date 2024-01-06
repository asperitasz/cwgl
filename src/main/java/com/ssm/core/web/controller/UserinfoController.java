package com.ssm.core.web.controller;

import com.ssm.core.po.Userinfo;
import com.ssm.core.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;
import java.util.Date;

@Controller
public class UserinfoController {
    // 依赖注入
    @Autowired
    private UserinfoService userinfoService;

    /**
     * 列表
     */
    @RequestMapping(value = "/Userinfo/list.action")
    public String list(Model model,Userinfo userinfo) {
        // 条件查询所有客户
        List<Userinfo> userinfoList = userinfoService.getUserinfoList(userinfo);
       
        model.addAttribute("list", userinfoList);

        return "Userinfo/Userinfolist";
    }

    @RequestMapping(value = "/Userinfo/toEdit.action")
    public String toEdit(Model model, Integer id) {
        Userinfo userinfo = new Userinfo();
        if (id > 0) {
            userinfo = userinfoService.getUserinfo(id);
        }
        model.addAttribute("entity", userinfo);
        return "Userinfo/UserinfoEdit";
    }

    /**
     * 创建客户
     */
    @RequestMapping(value ="/Userinfo/Edit.action")
    @ResponseBody
    public String Edit(Userinfo userinfo, Model model) {
        // 获取Session中的当前用户信息
        int rows = 0;
        // 执行Service层中的创建方法，返回的是受影响的行数
        if (userinfo.getId() > 0) {
            rows = userinfoService.update(userinfo);
        } else {
            rows = userinfoService.add(userinfo);
        }
        if (rows > 0) {
            return "<script>alert('操作成功');window.location.href='list.action'</script>";
        } else {
            model.addAttribute("entity", userinfo);
            return "<script>alert('操作失败');window.location.href='toEdit.action'toEdit.action";
        }
    }


    /**
     * 删除客户
     */
    @RequestMapping("/Userinfo/delete.action")
    @ResponseBody
    public String Delete(String ids) {
        for (String id : ids.split(",")) {
           
            userinfoService.delete(Integer.parseInt(id) );
        }
       return "1";
    }
}