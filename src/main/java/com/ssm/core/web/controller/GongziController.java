package com.ssm.core.web.controller;

import com.ssm.core.po.Gongzi;
import com.ssm.core.po.Yonghu;
import com.ssm.core.service.GongziService;
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
public class GongziController {
    // 依赖注入
    @Autowired
    private GongziService gongziService;
    @Autowired
    private YonghuService yonghuService;

    /**
     * 列表
     */
    @RequestMapping(value = "/Gongzi/list.action")
    public String list(Model model, Gongzi gongzi) {
        // 条件查询所有客户
        List<Gongzi> gongziList = gongziService.getGongziList(gongzi);

        model.addAttribute("list", gongziList);

        return "Gongzi/Gongzilist";
    }
    @RequestMapping(value = "/Gongzi/searchlist.action")
    public String searchlist(Model model, Gongzi gongzi,HttpSession session) {
        Yonghu user = (Yonghu) session.getAttribute("login_user");
        if(user==null) {
            return "redirect:../login.jsp";
        }
        gongzi.setGonghao(user.getUsername());
        // 条件查询所有客户
        List<Gongzi> gongziList = gongziService.getGongziList(gongzi);

        model.addAttribute("list", gongziList);

        return "Gongzi/Gongzisearchlist";
    }
    @RequestMapping(value = "/Gongzi/toEdit.action")
    public String toEdit(Model model, Integer id) {
        Gongzi gongzi = new Gongzi();
        if (id > 0) {
            gongzi = gongziService.getGongzi(id);
        }
        model.addAttribute("entity", gongzi);
        return "Gongzi/GongziEdit";
    }

    /**
     * 创建客户
     */
    @RequestMapping(value = "/Gongzi/Edit.action")
    @ResponseBody
    public String Edit(Gongzi gongzi, Model model) {
        // 获取Session中的当前用户信息
        int rows = 0;
        List<Yonghu> yonghuList = yonghuService.getYonghuList(null);
        for (Yonghu yonghu : yonghuList) {
            gongzi.setGonghao(yonghu.getUsername());
            gongzi.setXingming(yonghu.getName());
            gongzi.setGongjijingerenjine(yonghu.getGongjijingerenjine());
            gongzi.setJibengongzi(yonghu.getJibengongzi());
            gongzi.setGongjijinzongjine(yonghu.getGongjijinzongjine());
            gongzi.setShifagongzi(yonghu.getJibengongzi() - yonghu.getGongjijingerenjine());
            gongziService.add(gongzi);
        }
        return "1";
    }


    /**
     * 删除客户
     */
    @RequestMapping("/Gongzi/delete.action")
    @ResponseBody
    public String Delete(String ids) {
        for (String id : ids.split(",")) {

            gongziService.delete(Integer.parseInt(id));
        }
        return "1";
    }
}