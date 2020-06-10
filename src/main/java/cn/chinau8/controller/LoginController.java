package cn.chinau8.controller;

import cn.chinau8.base.BaseController;
import cn.chinau8.entity.Users;
import cn.chinau8.service.IUsersService;
import cn.chinau8.util.*;
import com.baomidou.mybatisplus.mapper.Condition;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.shiro.mgt.SecurityManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/4/6.
 */
@Controller
@RequestMapping("")
public class LoginController extends BaseController {

    @Value("${config.systemName}")
    private String systemName;

    @Autowired
    private IUsersService usersService;

    @GetMapping(value="/login.html")
    public String toLogin(ModelMap model) {
        model.addAttribute("systemName",systemName);
        Users user=(Users)this.getRequest().getSession().getAttribute(Const.SESSION_USER);
        String url=(String)this.getRequest().getSession().getAttribute(Const.SESSION_URL);
        System.out.println("url======="+url);
        if(user!=null){
            if(StringUtils.isNotBlank(url)){
                return "redirect:"+url;
            }else{
                return "redirect:/index.html";
            }
            //return "redirect:/index.html";
        }else{
            return "common/login";
        }
    }


    @ResponseBody
    @RequestMapping(value="/doLogin.json")
    public Result<PageData> doLogin(HttpSession session, HttpServletRequest request, ModelMap model, String loginName, String password) {
        PageData result=new PageData();
        if(StringUtils.isBlank(loginName)){
            return ResultUtil.error(-1,"用户名不能为空");
        }
        if(StringUtils.isBlank(password)){
            return ResultUtil.error(-1,"密码不能为空");
        }
        Users user = usersService.selectOne(Condition.instance().eq("username", loginName));
        if(user == null){
            return ResultUtil.error(-1,"帐号不存在");
        }
        //password = new SimpleHash("SHA-1", loginName, password).toString();	//密码加密
        password = MD5Util.encryptToMD5(password);
        if(!password.equals(user.getPassword())){
            return ResultUtil.error(-1,"用户名或密码错误");
        }
        Factory<SecurityManager> factory = new IniSecurityManagerFactory();
        //得到SecurityManager实例并绑定给SecurityUtils
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(loginName,password);
        try{
            //登录，即身份验证
            subject.login(token);
            session.setAttribute(Const.SESSION_USER,user);
        }catch (AuthenticationException e){
            token.clear();
        }
        return ResultUtil.success(result);
    }

    @RequestMapping(value="/logout.html")
    public String toLogout(HttpSession session,ModelMap model) {
        session.setAttribute(Const.SESSION_MENUS,null);
        session.setAttribute(Const.SESSION_USER,null);
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login.html";
    }

    @GetMapping(value="/403.html")
    public String toError(ModelMap model) {
        return "common/403";
    }
}
