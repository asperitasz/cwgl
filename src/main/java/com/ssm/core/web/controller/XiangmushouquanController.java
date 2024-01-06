package com.ssm.core.web.controller;

import com.ssm.core.po.Userinfo;
import com.ssm.core.po.Xiangmushouquan;
import com.ssm.core.po.Yonghu;
import com.ssm.core.service.XiangmushouquanService;
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
public class XiangmushouquanController {
    // 依赖注入
    @Autowired
    private XiangmushouquanService xiangmushouquanService;
    @Autowired
    private YonghuService yonghuService;
    /**
     * 列表
     */
    @RequestMapping(value = "/Xiangmushouquan/list.action")
    public String list(Model model, Xiangmushouquan xiangmushouquan) {
        // 条件查询所有客户
        List<Xiangmushouquan> xiangmushouquanList = xiangmushouquanService.getXiangmushouquanList(xiangmushouquan);

        model.addAttribute("list", xiangmushouquanList);

        return "Xiangmushouquan/Xiangmushouquanlist";
    }

    @RequestMapping(value = "/Xiangmushouquan/search.action")
    public String search(Model model,String kahao) {
        Xiangmushouquan xiangmushouquan = new Xiangmushouquan();
        xiangmushouquan.setKahao(kahao);
        // 条件查询所有客户
        List<Xiangmushouquan> xiangmushouquanList
                = xiangmushouquanService.getXiangmushouquanList(xiangmushouquan);
        model.addAttribute("entity", xiangmushouquanList.get(0));
        return "Xiangmushouquan/Xiangmushouquansearch";
    }
    @RequestMapping(value = "/Xiangmushouquan/searchresult.action")
    public String  searchresult(Model model,Xiangmushouquan xiangmushouquan) {
        xiangmushouquan.setZhuangtai("已认领");
        xiangmushouquanService.update(xiangmushouquan);
        // 条件查询所有客户
        List<Xiangmushouquan> xiangmushouquanList
                = xiangmushouquanService.getXiangmushouquanList(xiangmushouquan);
        model.addAttribute("entity", xiangmushouquanList.get(0));
        return "redirect:search.action";
    }

    @RequestMapping(value = "/Xiangmushouquan/toEdit.action")
    public String toEdit(Model model, Integer id) {
        Xiangmushouquan xiangmushouquan = new Xiangmushouquan();
        if (id > 0) {
            xiangmushouquan = xiangmushouquanService.getXiangmushouquan(id);
        } else {
            xiangmushouquan.setZhuangtai("待认领");
        }
        model.addAttribute("entity", xiangmushouquan);
        List<Yonghu> yonghuList = yonghuService.getYonghuList(null);
        model.addAttribute("list", yonghuList);
        return "Xiangmushouquan/XiangmushouquanEdit";
    }

    /**
     * 创建客户
     */
    @RequestMapping(value = "/Xiangmushouquan/Edit.action")
    @ResponseBody
    public String Edit(Xiangmushouquan xiangmushouquan, Model model) {
        // 获取Session中的当前用户信息
        int rows = 0;
        // 执行Service层中的创建方法，返回的是受影响的行数
        if (xiangmushouquan.getId() > 0) {
            rows = xiangmushouquanService.update(xiangmushouquan);
        } else {
            rows = xiangmushouquanService.add(xiangmushouquan);
        }
        if (rows > 0) {
            return "<script>alert('操作成功');window.location.href='list.action'</script>";
        } else {
            model.addAttribute("entity", xiangmushouquan);
            return "<script>alert('操作失败');window.location.href='toEdit.action'toEdit.action";
        }
    }


    /**
     * 删除客户
     */
    @RequestMapping("/Xiangmushouquan/delete.action")
    @ResponseBody
    public String Delete(String ids) {
        for (String id : ids.split(",")) {

            xiangmushouquanService.delete(Integer.parseInt(id));
        }
        return "1";
    }

    @RequestMapping("/Xiangmushouquan/check.action")
    @ResponseBody
    public String check(String username, String password, String role, Model model, HttpSession session) {
        Xiangmushouquan entity = new Xiangmushouquan();
        entity.setKahao(username);
        entity.setMima(password);
        List<Xiangmushouquan> Managers = xiangmushouquanService.getXiangmushouquanList(entity);
        if (Managers != null && Managers.size() > 0) {
            session.setAttribute("login_user", Managers.get(0));
            return "<script>window.location.href='search.action?kahao="+username+"'</script>";
        } else {
            return "<script>alert('卡号或密码错误');window.location.href='../check.jsp'</script>";
        }
    }

}