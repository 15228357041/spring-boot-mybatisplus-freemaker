package cn.chinau8.controller;


import cn.chinau8.entity.Users;
import cn.chinau8.mybatisplus.ConditionMybatis;
import cn.chinau8.service.IUsersService;
import cn.chinau8.util.*;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
@Api(value = "用户",description = "用户操作 API", position = 100, protocols = "http")
public class UsersController {
    @Autowired
    IUsersService usersService;

    @ApiOperation(value = "用户列表", notes = "无需登录", httpMethod = "GET")
    @RequestMapping("/ctse.html")
    public String test(Model model, @ApiParam(value="用户id", required = true) Integer id){
        Users users = usersService.selectById(1);
        List<Users> list = usersService.selectList(
                Condition.instance().setSqlSelect("id,userkey,username").orderBy("id")
        );
        model.addAttribute("users", list);
        return "user/user";
    }

    @ApiOperation(value = "用户列表", notes = "无需登录", httpMethod = "POST")
    @RequestMapping("/ctse.json")
    @ResponseBody
    public Result getUsers(Integer pageSize, Integer pageNum, Users users){
        Result result = null;
        EntityWrapper<Users> wrapper = new EntityWrapper<Users>();
        List<Users> list = usersService.selectList(Condition.instance().setSqlSelect("id,userkey,username").orderBy("id"));
        PageBean<PageData> userPage = usersService.getUserByPage(pageNum,pageSize ,
                ConditionMybatis.instance()
                        .setSqlSelect("id,userkey,username")
                        .orderBy("id")
                        .eq("tombstone", users.getTombstone()));
        Page<Users> a = usersService.selectPage(new Page<>(1,10));
        result = ResultUtil.success(list);
        return result;
    }
}
