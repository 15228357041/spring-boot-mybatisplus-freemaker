package cn.chinau8.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author zhuxufeng
 * @since 2018-08-03
 */
@TableName("upms_user")
public class UpmsUser extends Model<UpmsUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 订车用户id
     */
	private String id;
    /**
     * 登录名
     */
	@TableField("user_username")
	private String userUsername;
    /**
     * 密码
     */
	@TableField("user_password")
	private String userPassword;
    /**
     * 真实姓名
     */
	@TableField("user_realname")
	private String userRealname;
    /**
     * 昵称
     */
	@TableField("user_nickname")
	private String userNickname;
    /**
     * 手机号
     */
	@TableField("user_mobile")
	private String userMobile;
    /**
     * 邮箱
     */
	@TableField("user_email")
	private String userEmail;
    /**
     * appid
     */
	@TableField("user_appid")
	private String userAppid;
    /**
     * 类型  1-低频  2-高频 3-游客
     */
	@TableField("user_type")
	private Integer userType;
    /**
     * 状态 -10-删除 0-禁用 3-审核不通过 5-待审核 10-正常
     */
	@TableField("user_status")
	private Integer userStatus;
    /**
     * 用户城市
     */
	@TableField("user_city")
	private String userCity;
    /**
     * 用户省份
     */
	@TableField("user_province")
	private String userProvince;
    /**
     * 头像路径
     */
	@TableField("user_head")
	private String userHead;
    /**
     * 用户标识（审核时记录意见）
     */
	@TableField("user_remark")
	private String userRemark;
    /**
     * 用户余额 - VIP用户钱包
     */
	@TableField("user_wallet")
	private BigDecimal userWallet;
    /**
     * 用户虚拟财产支付密码
     */
	@TableField("user_pay_password")
	private String userPayPassword;
    /**
     * 代理平台客户编号
     */
	@TableField("ag_customer_id")
	private String agCustomerId;
    /**
     * 来源:10-交易平台;20-代理平台;30-客服平台;40-ERP系统
     */
	@TableField("user_from")
	private Integer userFrom;
	@TableField("create_date")
	private Date createDate;
	@TableField("create_by")
	private String createBy;
	@TableField("update_date")
	private Date updateDate;
	@TableField("update_by")
	private String updateBy;
    /**
     * 最后登陆时间
     */
	@TableField("login_date")
	private Date loginDate;
    /**
     * 登陆IP
     */
	@TableField("login_ip")
	private String loginIp;
    /**
     * 性别:0-女;1-男;null-未知;
     */
	private Integer gender;
    /**
     * 生日
     */
	private Date birthday;
    /**
     * 是否认证
     */
	@TableField("is_auth")
	private Integer isAuth;
    /**
     * user_from是40 车队ERP时的车队编号
     */
	@TableField("mtc_id")
	private String mtcId;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserUsername() {
		return userUsername;
	}

	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRealname() {
		return userRealname;
	}

	public void setUserRealname(String userRealname) {
		this.userRealname = userRealname;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAppid() {
		return userAppid;
	}

	public void setUserAppid(String userAppid) {
		this.userAppid = userAppid;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserProvince() {
		return userProvince;
	}

	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}

	public String getUserHead() {
		return userHead;
	}

	public void setUserHead(String userHead) {
		this.userHead = userHead;
	}

	public String getUserRemark() {
		return userRemark;
	}

	public void setUserRemark(String userRemark) {
		this.userRemark = userRemark;
	}

	public BigDecimal getUserWallet() {
		return userWallet;
	}

	public void setUserWallet(BigDecimal userWallet) {
		this.userWallet = userWallet;
	}

	public String getUserPayPassword() {
		return userPayPassword;
	}

	public void setUserPayPassword(String userPayPassword) {
		this.userPayPassword = userPayPassword;
	}

	public String getAgCustomerId() {
		return agCustomerId;
	}

	public void setAgCustomerId(String agCustomerId) {
		this.agCustomerId = agCustomerId;
	}

	public Integer getUserFrom() {
		return userFrom;
	}

	public void setUserFrom(Integer userFrom) {
		this.userFrom = userFrom;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getIsAuth() {
		return isAuth;
	}

	public void setIsAuth(Integer isAuth) {
		this.isAuth = isAuth;
	}

	public String getMtcId() {
		return mtcId;
	}

	public void setMtcId(String mtcId) {
		this.mtcId = mtcId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
