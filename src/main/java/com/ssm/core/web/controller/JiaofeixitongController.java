package com.ssm.core.web.controller;

import com.ssm.core.po.Jiaofeixitong;
import com.ssm.core.po.Userinfo;
import com.ssm.core.po.Yonghu;
import com.ssm.core.service.JiaofeixitongService;
import com.ssm.core.service.UserinfoService;
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
public class JiaofeixitongController {
    // 依赖注入
    @Autowired
    private JiaofeixitongService jiaofeixitongService;
    @Autowired
    private YonghuService yonghuService;

    /**
     * 列表
     */
    @RequestMapping(value = "/Jiaofeixitong/list.action")
    public String list(Model model, Jiaofeixitong jiaofeixitong) {
        // 条件查询所有客户
        List<Jiaofeixitong> jiaofeixitongList = jiaofeixitongService.getJiaofeixitongList(jiaofeixitong);

        model.addAttribute("list", jiaofeixitongList);

        return "Jiaofeixitong/Jiaofeixitonglist";
    }

    @RequestMapping(value = "/Jiaofeixitong/searchlist.action")
    public String searchlist(Model model, Jiaofeixitong jiaofeixitong, HttpSession session) {
        Yonghu user = (Yonghu) session.getAttribute("login_user");
        if(user==null) {
            return "redirect:../login.jsp";
        }
        jiaofeixitong.setYonghuid(user.getId());
        // 条件查询所有客户
        List<Jiaofeixitong> jiaofeixitongList = jiaofeixitongService.getJiaofeixitongList(jiaofeixitong);
        model.addAttribute("list", jiaofeixitongList);
        return "Jiaofeixitong/Jiaofeixitongsearchlist";
    }

    @RequestMapping(value = "/Jiaofeixitong/toEdit.action")
    public String toEdit(Model model, Integer id) {
        Jiaofeixitong jiaofeixitong = new Jiaofeixitong();
        if (id > 0) {
            jiaofeixitong = jiaofeixitongService.getJiaofeixitong(id);
        } else {
            jiaofeixitong.setZhuangtai("待缴费");
        }
        model.addAttribute("entity", jiaofeixitong);
        List<Yonghu> yonghuList = yonghuService.getYonghuList(null);
        model.addAttribute("list", yonghuList);
        return "Jiaofeixitong/JiaofeixitongEdit";
    }

    /**
     * 创建客户
     */
    @RequestMapping(value = "/Jiaofeixitong/Edit.action")
    @ResponseBody
    public String Edit(Jiaofeixitong jiaofeixitong, Model model) {
        // 获取Session中的当前用户信息
        int rows = 0;
        // 执行Service层中的创建方法，返回的是受影响的行数
        if (jiaofeixitong.getId() > 0) {
            rows = jiaofeixitongService.update(jiaofeixitong);
        } else {
            rows = jiaofeixitongService.add(jiaofeixitong);
        }
        if (rows > 0) {
            return "<script>alert('操作成功');window.location.href='list.action'</script>";
        } else {
            model.addAttribute("entity", jiaofeixitong);
            return "<script>alert('操作失败');window.location.href='toEdit.action'toEdit.action";
        }
    }


    /**
     * 删除客户
     */
    @RequestMapping("/Jiaofeixitong/delete.action")
    @ResponseBody
    public String Delete(String ids) {
        for (String id : ids.split(",")) {

            jiaofeixitongService.delete(Integer.parseInt(id));
        }
        return "1";
    }


    @RequestMapping(value = "/Jiaofeixitong/jiaofei.action")
    @ResponseBody
    public String jiaofei(int id, Model model) {
        Jiaofeixitong jiaofeixitong = jiaofeixitongService.getJiaofeixitong(id);
        jiaofeixitong.setZhuangtai("已缴费");
        // 获取Session中的当前用户信息

        int rows = jiaofeixitongService.update(jiaofeixitong);

        return "<script>alert('操作成功');window.location.href='searchlist.action'</script>";

    }


    @RequestMapping(value = "/Jiaofeixitong/kaifaqiao.action")

    public String kaifaqiao(int id, Model model) {
        Jiaofeixitong jiaofeixitong = jiaofeixitongService.getJiaofeixitong(id);
        jiaofeixitong.setZhuangtai("已开发票");
        // 获取Session中的当前用户信息

        int rows = jiaofeixitongService.update(jiaofeixitong);
        model.addAttribute("entity", jiaofeixitong);
        return "Jiaofeixitong/kaifaqiao";

    }

}