package cn.chinau8.controller;


import cn.chinau8.entity.Users;
import cn.chinau8.service.IUsersService;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhuxufeng
 * @since 2019-01-18
 */
@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    IUsersService usersService;

    @RequestMapping("/ctse")
    public String test(Model model){
        Users users = usersService.selectById(1);
        List<Users> list = usersService.selectList(
                Condition.instance().setSqlSelect("id").orderBy("id")
        );
        model.addAttribute("users", users);
        return "user/user";
    }

    public static void main(String[] args) {
        EntityWrapper<Users> ew = new EntityWrapper<Users>();
        ew.setEntity(new Users());
        ew.where("user_name={0}", "'zhangsan'").and("id=1")
                .orNew("user_status={0}", "0").or("status=1")
                .notLike("user_nickname", "notvalue")
                .andNew("new=xx").like("hhh", "ddd")
                .andNew("pwd=11").isNotNull("n1,n2").isNull("n3")
                .groupBy("x1").groupBy("x2,x3")
                .having("x1=11").having("x3=433")
                .orderBy("dd").orderBy("d1,d2");
        System.out.println(ew.getSqlSegment());
    }
}
