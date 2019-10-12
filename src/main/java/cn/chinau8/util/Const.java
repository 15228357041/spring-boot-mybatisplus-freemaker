package cn.chinau8.util;

/**
 * Created by Administrator on 2017/4/19.
 */
public class Const {
    /*Session数据*/
    public static final String SESSION_ID = "id";//登录的会员
    public static final String SESSION_MEMBER = "curMember";//登录的会员
    public static final String SESSION_MEMBER_ID = "curMemberId";//登录的会员编号
    public static final String SESSION_OPEN_ID = "curOpenId";//当前openId
    public static final String SESSION_CITY = "curCity";//当前城市
    public static final String SESSION_PROVINCE = "curProvince";//当前省份
    public static final String SESSION_MENUS = "curMenus";//当前菜单
    public static final String SESSION_USER="curUser";
    public static final String SESSION_URL="curUrl";//当前请求路径
    public static final String SESSION_SHOPID="shopId";//当前店铺

    /*订单数据*/
    /*订单状态*/
    public static final Integer WAIT_FOR_PAY=0;//待付款
    public static final Integer WAIT_FOR_DELIVE=1;//待发货
    public static final Integer WAIT_FOR_CONFIRM=2;//待确认收货
    public static final Integer ORDER_COMPLETE=3;//完成

    /*订单类型*/
    public static final Integer ROUTINE_ORDER=1;//常规订单

    /*支付状态*/
    public static final Integer NO_PAY=0;//未支付
    public static final Integer HAS_PAY=1;//已支付

    /*商户类型*/
    public static final Integer MB_STATION=1; //加油站
    public static final Integer MB_MT=2; //商户
}
