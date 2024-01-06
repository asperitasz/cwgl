package com.ssm.core.web.controller;

import com.ssm.core.po.Gongjijintiqujilu;
import com.ssm.core.po.Yonghu;
import com.ssm.core.service.GongjijintiqujiluService;
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
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

@Controller
public class GongjijintiqujiluController {
    // 依赖注入
    @Autowired
    private GongjijintiqujiluService gongjijintiqujiluService;

    /**
     * 列表
     */
    @RequestMapping(value = "/Gongjijintiqujilu/list.action")
    public String list(Model model, Gongjijintiqujilu gongjijintiqujilu, HttpSession session) {
        Yonghu user = (Yonghu) session.getAttribute("login_user");
        if (user == null) {
            return "redirect:../login.jsp";
        }
        gongjijintiqujilu.setYonghuid(user.getId());
        // 条件查询所有客户
        List<Gongjijintiqujilu> gongjijintiqujiluList = gongjijintiqujiluService.getGongjijintiqujiluList(gongjijintiqujilu);

        model.addAttribute("list", gongjijintiqujiluList);

        return "Gongjijintiqujilu/Gongjijintiqujilulist";
    }

    @RequestMapping(value = "/Gongjijintiqujilu/toEdit.action")
    public String toEdit(Model model, Integer id) {
        Gongjijintiqujilu gongjijintiqujilu = new Gongjijintiqujilu();
        if (id > 0) {
            gongjijintiqujilu = gongjijintiqujiluService.getGongjijintiqujilu(id);
        }
        model.addAttribute("entity", gongjijintiqujilu);
        return "Gongjijintiqujilu/GongjijintiqujiluEdit";
    }

    /**
     * 创建客户
     */
    @RequestMapping(value = "/Gongjijintiqujilu/Edit.action")
    @ResponseBody
    public String Edit(Gongjijintiqujilu gongjijintiqujilu, Model model, HttpSession session) {
        Yonghu user = (Yonghu) session.getAttribute("login_user");
        if (user == null) {
            return "<script>alert('请登录');window.parent.location.href='../login.jsp'</script>";
        }
        // 获取Session中的当前用户信息
        int rows = 0;
        // 执行Service层中的创建方法，返回的是受影响的行数
        gongjijintiqujilu.setYonghuid(user.getId());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        gongjijintiqujilu.setTiqushijian(sdf.format(new Date()));
        rows = gongjijintiqujiluService.add(gongjijintiqujilu);

        if (rows > 0) {
            return "<script>alert('操作成功');window.location.href='list.action'</script>";
        } else {
            model.addAttribute("entity", gongjijintiqujilu);
            return "<script>alert('操作失败');window.location.href='toEdit.action'</script>";
        }
    }


    /**
     * 删除客户
     */
    @RequestMapping("/Gongjijintiqujilu/delete.action")
    @ResponseBody
    public String Delete(String ids) {
        for (String id : ids.split(",")) {

            gongjijintiqujiluService.delete(Integer.parseInt(id));
        }
        return "1";
    }
}