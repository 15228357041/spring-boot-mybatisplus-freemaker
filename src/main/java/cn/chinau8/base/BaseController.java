package cn.chinau8.base;

import cn.chinau8.util.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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



}
