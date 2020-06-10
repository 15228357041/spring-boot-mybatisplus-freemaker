package cn.chinau8.base;

import cn.chinau8.util.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


public class BaseController {
    public  static Logger logger= LoggerFactory.getLogger(BaseController.class);

    /**
     * 得到request对象
     */
    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    public String getCurUrl(){
        HttpServletRequest request = this.getRequest();
		/*获取当前url 用于分享配置*/
        String url=request.getRequestURL().toString();
        if(request.getQueryString()!=null){
            url+="?"+request.getQueryString();
        }
        return url;
    }
    public void setCurUrl(){
        HttpServletRequest request = this.getRequest();
		/*获取当前url 用于分享配置*/
        String url=request.getRequestURL().toString();
        if(request.getQueryString()!=null){
            url+="?"+request.getQueryString();
        }
        request.getSession().setAttribute(Const.SESSION_URL,url);
    }

    /**
     * 用户跳转页面
     *
     * 此方法进行权限控制
     *
     * @param folder
     *            路径
     * @param htmlName
     *            html名称(不加后缀)
     * @return 指定html页面
     */
    @RequestMapping("/common/{folder}/{jspName}")
    public String redirectJsp(Model model, @PathVariable String folder, @PathVariable String htmlName) {
        String url = folder + "/" + htmlName;
        return url;
    }


}
