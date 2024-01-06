package com.ssm.core.web.controller;

import com.ssm.core.po.Yonghu;
import com.ssm.core.service.YonghuService;
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
public class YonghuController {
    // 依赖注入
    @Autowired
    private YonghuService yonghuService;

    /**
     * 列表
     */
    @RequestMapping(value = "/Yonghu/list.action")
    public String list(Model model,Yonghu yonghu) {
        // 条件查询所有客户
        List<Yonghu> yonghuList = yonghuService.getYonghuList(yonghu);
       
        model.addAttribute("list", yonghuList);

        return "Yonghu/Yonghulist";
    }

    @RequestMapping(value = "/Yonghu/toEdit.action")
    public String toEdit(Model model, Integer id) {
        Yonghu yonghu = new Yonghu();
        if (id > 0) {
            yonghu = yonghuService.getYonghu(id);
        }
        model.addAttribute("entity", yonghu);
        return "Yonghu/YonghuEdit";
    }

    /**
     * 创建客户
     */
    @RequestMapping(value ="/Yonghu/Edit.action")
    @ResponseBody
    public String Edit(Yonghu yonghu, Model model) {
        // 获取Session中的当前用户信息
        int rows = 0;
        // 执行Service层中的创建方法，返回的是受影响的行数
        if (yonghu.getId() > 0) {
            rows = yonghuService.update(yonghu);
        } else {
            rows = yonghuService.add(yonghu);
        }
        if (rows > 0) {
            return "<script>alert('操作成功');window.location.href='list.action'</script>";
        } else {
            model.addAttribute("entity", yonghu);
            return "<script>alert('操作失败');window.location.href='toEdit.action'toEdit.action";
        }
    }


    /**
     * 删除客户
     */
    @RequestMapping("/Yonghu/delete.action")
    @ResponseBody
    public String Delete(String ids) {
        for (String id : ids.split(",")) {
           
            yonghuService.delete(Integer.parseInt(id) );
        }
       return "1";
    }
}