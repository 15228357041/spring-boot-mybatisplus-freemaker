package cn.chinau8.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author zhuxufeng
 * @since 2019-01-18
 */
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String userkey;
	private String username;
	private String password;
	private Integer usergroupid;
	private String email;
	private String address;
	private String telephone;
	private Date startdate;
	private Date createdate;
	private Integer createuserid;
	private Date modificationdate;
	private Integer modificationuserid;
	private String memo;
	private String picpath;
	private String barcode;
    /**
     * 1 在职 2 离职
     */
	private Integer status;
	private Date enddate;
	private String mobilephone;
	private Integer humanid;
	private Integer orgid;
    /**
     * 1= 复用 2 =不复用
     */
	private Integer ismulti;
	private Integer tombstone;
	private Integer logintype;
	private String extravarchar1;
	private String extravarchar2;
	private String extravarchar3;
	private String extravarchar4;
	private String extravarchar5;
	private String extravarchar6;
	private String extravarchar7;
	private String extravarchar8;
	private String extravarchar9;
    /**
     * 用户公司字段
     */
	private String extravarchar10;
	private BigDecimal extradecimal1;
	private BigDecimal extradecimal2;
	private BigDecimal extradecimal3;
	private BigDecimal extradecimal4;
	private BigDecimal extradecimal5;
	private Integer extraint1;
	private Integer extraint2;
	private Integer extraint3;
	private Integer extraint4;
	private Integer extraint5;
	private Integer extraid1;
	private Integer extraid2;
	private Integer extraid3;
	private Integer extraid4;
	private Integer extraid5;
	private Date extradatetime1;
	private Date extradatetime2;
	private Date extradatetime3;
	private Date extradatetime4;
	private Date extradatetime5;
	private Integer customerid;
	private Integer wechatuserid;
	private Integer departmentid;
	private Integer ishuman;
	private Integer rootuserid;
	private Integer shareid;
	private Integer saleid;
	private String officalwechatkey;
    /**
     * 和职位关联id
     */
	private Integer postid;
    /**
     * 出生日期
     */
	private Date birthdatetime;
    /**
     * 身份证
     */
	private String idcard;
    /**
     * 婚否
     */
	private String ismarried;
    /**
     * 是否生育
     */
	private String isbirthed;
    /**
     * 学历
     */
	private String education;
    /**
     * 专业
     */
	private String major;
	private Integer forgetstate;
    /**
     * 是否有管理员权限 1：有
     */
	private Integer isadmin;
    /**
     * 申请状态
     */
	private Integer registrationstatus;
    /**
     * 人员岗位
     */
	private String workstation;
    /**
     * 人员部门名称
     */
	private String departmentname;
    /**
     * 巡检人员id
     */
	private Integer inspectionhumanid;
    /**
     * 所属基地（工厂）
     */
	private String factorycode;
    /**
     * 是否已修改密码
     */
	private Integer changepassword;
	private Integer shiroroleid;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserkey() {
		return userkey;
	}

	public void setUserkey(String userkey) {
		this.userkey = userkey;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUsergroupid() {
		return usergroupid;
	}

	public void setUsergroupid(Integer usergroupid) {
		this.usergroupid = usergroupid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Integer getCreateuserid() {
		return createuserid;
	}

	public void setCreateuserid(Integer createuserid) {
		this.createuserid = createuserid;
	}

	public Date getModificationdate() {
		return modificationdate;
	}

	public void setModificationdate(Date modificationdate) {
		this.modificationdate = modificationdate;
	}

	public Integer getModificationuserid() {
		return modificationuserid;
	}

	public void setModificationuserid(Integer modificationuserid) {
		this.modificationuserid = modificationuserid;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPicpath() {
		return picpath;
	}

	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public Integer getHumanid() {
		return humanid;
	}

	public void setHumanid(Integer humanid) {
		this.humanid = humanid;
	}

	public Integer getOrgid() {
		return orgid;
	}

	public void setOrgid(Integer orgid) {
		this.orgid = orgid;
	}

	public Integer getIsmulti() {
		return ismulti;
	}

	public void setIsmulti(Integer ismulti) {
		this.ismulti = ismulti;
	}

	public Integer getTombstone() {
		return tombstone;
	}

	public void setTombstone(Integer tombstone) {
		this.tombstone = tombstone;
	}

	public Integer getLogintype() {
		return logintype;
	}

	public void setLogintype(Integer logintype) {
		this.logintype = logintype;
	}

	public String getExtravarchar1() {
		return extravarchar1;
	}

	public void setExtravarchar1(String extravarchar1) {
		this.extravarchar1 = extravarchar1;
	}

	public String getExtravarchar2() {
		return extravarchar2;
	}

	public void setExtravarchar2(String extravarchar2) {
		this.extravarchar2 = extravarchar2;
	}

	public String getExtravarchar3() {
		return extravarchar3;
	}

	public void setExtravarchar3(String extravarchar3) {
		this.extravarchar3 = extravarchar3;
	}

	public String getExtravarchar4() {
		return extravarchar4;
	}

	public void setExtravarchar4(String extravarchar4) {
		this.extravarchar4 = extravarchar4;
	}

	public String getExtravarchar5() {
		return extravarchar5;
	}

	public void setExtravarchar5(String extravarchar5) {
		this.extravarchar5 = extravarchar5;
	}

	public String getExtravarchar6() {
		return extravarchar6;
	}

	public void setExtravarchar6(String extravarchar6) {
		this.extravarchar6 = extravarchar6;
	}

	public String getExtravarchar7() {
		return extravarchar7;
	}

	public void setExtravarchar7(String extravarchar7) {
		this.extravarchar7 = extravarchar7;
	}

	public String getExtravarchar8() {
		return extravarchar8;
	}

	public void setExtravarchar8(String extravarchar8) {
		this.extravarchar8 = extravarchar8;
	}

	public String getExtravarchar9() {
		return extravarchar9;
	}

	public void setExtravarchar9(String extravarchar9) {
		this.extravarchar9 = extravarchar9;
	}

	public String getExtravarchar10() {
		return extravarchar10;
	}

	public void setExtravarchar10(String extravarchar10) {
		this.extravarchar10 = extravarchar10;
	}

	public BigDecimal getExtradecimal1() {
		return extradecimal1;
	}

	public void setExtradecimal1(BigDecimal extradecimal1) {
		this.extradecimal1 = extradecimal1;
	}

	public BigDecimal getExtradecimal2() {
		return extradecimal2;
	}

	public void setExtradecimal2(BigDecimal extradecimal2) {
		this.extradecimal2 = extradecimal2;
	}

	public BigDecimal getExtradecimal3() {
		return extradecimal3;
	}

	public void setExtradecimal3(BigDecimal extradecimal3) {
		this.extradecimal3 = extradecimal3;
	}

	public BigDecimal getExtradecimal4() {
		return extradecimal4;
	}

	public void setExtradecimal4(BigDecimal extradecimal4) {
		this.extradecimal4 = extradecimal4;
	}

	public BigDecimal getExtradecimal5() {
		return extradecimal5;
	}

	public void setExtradecimal5(BigDecimal extradecimal5) {
		this.extradecimal5 = extradecimal5;
	}

	public Integer getExtraint1() {
		return extraint1;
	}

	public void setExtraint1(Integer extraint1) {
		this.extraint1 = extraint1;
	}

	public Integer getExtraint2() {
		return extraint2;
	}

	public void setExtraint2(Integer extraint2) {
		this.extraint2 = extraint2;
	}

	public Integer getExtraint3() {
		return extraint3;
	}

	public void setExtraint3(Integer extraint3) {
		this.extraint3 = extraint3;
	}

	public Integer getExtraint4() {
		return extraint4;
	}

	public void setExtraint4(Integer extraint4) {
		this.extraint4 = extraint4;
	}

	public Integer getExtraint5() {
		return extraint5;
	}

	public void setExtraint5(Integer extraint5) {
		this.extraint5 = extraint5;
	}

	public Integer getExtraid1() {
		return extraid1;
	}

	public void setExtraid1(Integer extraid1) {
		this.extraid1 = extraid1;
	}

	public Integer getExtraid2() {
		return extraid2;
	}

	public void setExtraid2(Integer extraid2) {
		this.extraid2 = extraid2;
	}

	public Integer getExtraid3() {
		return extraid3;
	}

	public void setExtraid3(Integer extraid3) {
		this.extraid3 = extraid3;
	}

	public Integer getExtraid4() {
		return extraid4;
	}

	public void setExtraid4(Integer extraid4) {
		this.extraid4 = extraid4;
	}

	public Integer getExtraid5() {
		return extraid5;
	}

	public void setExtraid5(Integer extraid5) {
		this.extraid5 = extraid5;
	}

	public Date getExtradatetime1() {
		return extradatetime1;
	}

	public void setExtradatetime1(Date extradatetime1) {
		this.extradatetime1 = extradatetime1;
	}

	public Date getExtradatetime2() {
		return extradatetime2;
	}

	public void setExtradatetime2(Date extradatetime2) {
		this.extradatetime2 = extradatetime2;
	}

	public Date getExtradatetime3() {
		return extradatetime3;
	}

	public void setExtradatetime3(Date extradatetime3) {
		this.extradatetime3 = extradatetime3;
	}

	public Date getExtradatetime4() {
		return extradatetime4;
	}

	public void setExtradatetime4(Date extradatetime4) {
		this.extradatetime4 = extradatetime4;
	}

	public Date getExtradatetime5() {
		return extradatetime5;
	}

	public void setExtradatetime5(Date extradatetime5) {
		this.extradatetime5 = extradatetime5;
	}

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public Integer getWechatuserid() {
		return wechatuserid;
	}

	public void setWechatuserid(Integer wechatuserid) {
		this.wechatuserid = wechatuserid;
	}

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public Integer getIshuman() {
		return ishuman;
	}

	public void setIshuman(Integer ishuman) {
		this.ishuman = ishuman;
	}

	public Integer getRootuserid() {
		return rootuserid;
	}

	public void setRootuserid(Integer rootuserid) {
		this.rootuserid = rootuserid;
	}

	public Integer getShareid() {
		return shareid;
	}

	public void setShareid(Integer shareid) {
		this.shareid = shareid;
	}

	public Integer getSaleid() {
		return saleid;
	}

	public void setSaleid(Integer saleid) {
		this.saleid = saleid;
	}

	public String getOfficalwechatkey() {
		return officalwechatkey;
	}

	public void setOfficalwechatkey(String officalwechatkey) {
		this.officalwechatkey = officalwechatkey;
	}

	public Integer getPostid() {
		return postid;
	}

	public void setPostid(Integer postid) {
		this.postid = postid;
	}

	public Date getBirthdatetime() {
		return birthdatetime;
	}

	public void setBirthdatetime(Date birthdatetime) {
		this.birthdatetime = birthdatetime;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getIsmarried() {
		return ismarried;
	}

	public void setIsmarried(String ismarried) {
		this.ismarried = ismarried;
	}

	public String getIsbirthed() {
		return isbirthed;
	}

	public void setIsbirthed(String isbirthed) {
		this.isbirthed = isbirthed;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Integer getForgetstate() {
		return forgetstate;
	}

	public void setForgetstate(Integer forgetstate) {
		this.forgetstate = forgetstate;
	}

	public Integer getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(Integer isadmin) {
		this.isadmin = isadmin;
	}

	public Integer getRegistrationstatus() {
		return registrationstatus;
	}

	public void setRegistrationstatus(Integer registrationstatus) {
		this.registrationstatus = registrationstatus;
	}

	public String getWorkstation() {
		return workstation;
	}

	public void setWorkstation(String workstation) {
		this.workstation = workstation;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public Integer getInspectionhumanid() {
		return inspectionhumanid;
	}

	public void setInspectionhumanid(Integer inspectionhumanid) {
		this.inspectionhumanid = inspectionhumanid;
	}

	public String getFactorycode() {
		return factorycode;
	}

	public void setFactorycode(String factorycode) {
		this.factorycode = factorycode;
	}

	public Integer getChangepassword() {
		return changepassword;
	}

	public void setChangepassword(Integer changepassword) {
		this.changepassword = changepassword;
	}

	public Integer getShiroroleid() {
		return shiroroleid;
	}

	public void setShiroroleid(Integer shiroroleid) {
		this.shiroroleid = shiroroleid;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
