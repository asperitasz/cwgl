package com.ssm.core.web.controller;

import com.ssm.core.po.*;
import com.ssm.core.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {

    // 依赖注入
    @Autowired
    private UserinfoService userinfoService;
    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private XiangmushouquanService xiangmushouquanService;

    /**
     * 创建客户
     */
    @RequestMapping("/WebLogin.action")
    @ResponseBody
    public String WebLogin(String username, String password, String role, Model model, HttpSession session) {
        if (role.equals("管理员")) {
            Userinfo entity = new Userinfo();
            entity.setUsername(username);
            entity.setPassword(password);

            List<Userinfo> Managers = userinfoService.getUserinfoList(entity);
            if (Managers != null && Managers.size() > 0) {
                session.setAttribute("login_account", Managers.get(0));
                return "<script>window.location.href='Home.jsp'</script>";
            } else {
                return "<script>alert('用户名或密码错误');window.location.href='login.jsp'</script>";
            }
        } else {
            Yonghu entity = new Yonghu();
            entity.setUsername(username);
            entity.setPassword(password);
            List<Yonghu> yonghus = yonghuService.getYonghuList(entity);
            if (yonghus != null && yonghus.size() > 0) {
                session.setAttribute("login_user", yonghus.get(0));
                return "<script>window.location.href='index.action'</script>";
            } else {
                return "<script>alert('用户名或密码错误');window.location.href='login.jsp'</script>";
            }
        }
    }

    @RequestMapping(value = "/index.action")
    public String index(Model model,HttpSession session) {
        Yonghu user = (Yonghu) session.getAttribute("login_user");
        if(user==null) {
            return "redirect:login.jsp";
        }
        Xiangmushouquan xiangmushouquan = new Xiangmushouquan();
        xiangmushouquan.setBeizhu(user.getId()+"");
        xiangmushouquan.setZhuangtai("待认领");
        // 条件查询所有客户
        List<Xiangmushouquan> List = xiangmushouquanService.getXiangmushouquanList(xiangmushouquan);

        model.addAttribute("list", List);

        return "index";
    }
}
