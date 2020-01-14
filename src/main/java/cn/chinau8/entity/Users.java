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
 * @since 2020-01-14
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
	private Integer rootuserid;
	private Integer ishuman;
	private Integer shareid;
	private Integer saleid;
	private String qiyewechatkey;
    /**
     * 和职位关联id
     */
	private Integer postid;
	private String officalwechatkey;
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
     * 巡检人员key
     */
	private String inspectionhumankey;
    /**
     * 是否是高管，1-是;0-不是
     */
	private Integer isseniormanagement;
	private Integer externalresource;
	private Integer accountid;
	private Integer costtypeid;
	private Integer costpurposeid;
	private String qq;
	private BigDecimal hourperweek;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String address5;
	private BigDecimal hourrate1;
	private BigDecimal hourrate2;
	private BigDecimal hourrate3;
	private BigDecimal hourrate4;
	private BigDecimal hourrate5;
	private BigDecimal hourrate6;
	private BigDecimal hourrate7;
	private BigDecimal hourrate8;
	private BigDecimal hourrate9;
	private BigDecimal hourrate10;
	private BigDecimal hourrate11;
	private BigDecimal hourrate12;
	private BigDecimal hourrate13;
	private BigDecimal hourrate14;
	private BigDecimal hourrate15;
	private BigDecimal hourrate16;
	private BigDecimal hourrate17;
	private BigDecimal hourrate18;
	private BigDecimal hourrate19;
	private BigDecimal hourrate20;
	private String yearweekfrom1;
	private String yearweekfrom2;
	private String yearweekfrom3;
	private String yearweekfrom4;
	private String yearweekfrom5;
	private String yearweekfrom6;
	private String yearweekfrom7;
	private String yearweekfrom8;
	private String yearweekfrom9;
	private String yearweekfrom10;
	private String yearweekto1;
	private String yearweekto2;
	private String yearweekto3;
	private String yearweekto4;
	private String yearweekto5;
	private String yearweekto6;
	private String yearweekto7;
	private String yearweekto8;
	private String yearweekto9;
	private String yearweekto10;
	private BigDecimal specialhour1;
	private BigDecimal specialhour2;
	private BigDecimal specialhour3;
	private BigDecimal specialhour4;
	private BigDecimal specialhour5;
	private BigDecimal specialhour6;
	private BigDecimal specialhour7;
	private BigDecimal specialhour8;
	private BigDecimal specialhour9;
	private BigDecimal specialhour10;
	private Integer useforworkresource;
	private Integer useforworkresponsible;
	private Integer useforworkorderby;
	private Integer useforpurchaseorderby;
	private Integer useforintpurcorderby;
	private Integer useforprojectresponsible;
	private Integer useforprojectorderby;
	private Integer useforstockremoval;
	private Long humanbarcode;
	private String skills;
    /**
     * 邮箱
     */
	private String emailaddress;
	private Integer supplierid;
	private Date lastchangedate;
	private Integer lastchangetime;
	private Date lastexportdate;
	private Integer lastexporttime;
	private Date lastimportdate;
	private Integer lastimporttime;
	private Integer nonproductiveaccountid;
	private Integer siteid;
	private Integer recordactive;
	private String custombarcode;
	private String extrawsinfo1;
	private String extrawsinfo2;
    /**
     * 工种ID
     */
	private Integer categoryid;
	private String comment1;
	private String comment2;
	private String comment3;
	private String comment4;
	private String comment5;
	private String comment6;
	private String comment7;
	private String comment8;
	private String comment9;
	private String comment10;
	private Integer planningactive;
	private BigDecimal plantopct;
	private Integer wsgroupid;
	private BigDecimal numbermen;
	private BigDecimal hourspersonweek;
	private Integer locationid;
	private String extrawsinfo3;
	private String extrawsinfo4;
	private String extrawsinfo5;
	private Integer contactpersonid;
	private Integer shiftplanid;
	private Integer shiftnextseq;
	private Date shiftinitialdate;
	private BigDecimal shiftinitialoffset;
	private Integer useforroundresponsible;
	private String extrawsinfo6;
	private String extrawsinfo7;
	private String extrawsinfo8;
	private String extrawsinfo9;
	private String extrawsinfo10;
	private String rfid;
	private Integer moid;
	private Integer plantid;
	private Integer legalunitid;
	private String legalunitcurrencyid;
	private Date lastchangedtz;
	private Date lastexportdtz;
	private Date lastimportdtz;
	private Integer recordlanguageid;
    /**
     * 在岗状态  1 在岗 2 不在岗
     */
	private Integer onguard;
    /**
     * 是否委外供应商 1 是 2 否
     */
	private Integer issupplier;
	private String firstname;
	private String middlename;
	private String lastname;
	private Integer judgegrade;
	private Integer shiftid;
	private Integer typeid;
	private Integer statusid;
	private Integer humanstatus;


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

	public Integer getRootuserid() {
		return rootuserid;
	}

	public void setRootuserid(Integer rootuserid) {
		this.rootuserid = rootuserid;
	}

	public Integer getIshuman() {
		return ishuman;
	}

	public void setIshuman(Integer ishuman) {
		this.ishuman = ishuman;
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

	public String getQiyewechatkey() {
		return qiyewechatkey;
	}

	public void setQiyewechatkey(String qiyewechatkey) {
		this.qiyewechatkey = qiyewechatkey;
	}

	public Integer getPostid() {
		return postid;
	}

	public void setPostid(Integer postid) {
		this.postid = postid;
	}

	public String getOfficalwechatkey() {
		return officalwechatkey;
	}

	public void setOfficalwechatkey(String officalwechatkey) {
		this.officalwechatkey = officalwechatkey;
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

	public String getInspectionhumankey() {
		return inspectionhumankey;
	}

	public void setInspectionhumankey(String inspectionhumankey) {
		this.inspectionhumankey = inspectionhumankey;
	}

	public Integer getIsseniormanagement() {
		return isseniormanagement;
	}

	public void setIsseniormanagement(Integer isseniormanagement) {
		this.isseniormanagement = isseniormanagement;
	}

	public Integer getExternalresource() {
		return externalresource;
	}

	public void setExternalresource(Integer externalresource) {
		this.externalresource = externalresource;
	}

	public Integer getAccountid() {
		return accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public Integer getCosttypeid() {
		return costtypeid;
	}

	public void setCosttypeid(Integer costtypeid) {
		this.costtypeid = costtypeid;
	}

	public Integer getCostpurposeid() {
		return costpurposeid;
	}

	public void setCostpurposeid(Integer costpurposeid) {
		this.costpurposeid = costpurposeid;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public BigDecimal getHourperweek() {
		return hourperweek;
	}

	public void setHourperweek(BigDecimal hourperweek) {
		this.hourperweek = hourperweek;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getAddress5() {
		return address5;
	}

	public void setAddress5(String address5) {
		this.address5 = address5;
	}

	public BigDecimal getHourrate1() {
		return hourrate1;
	}

	public void setHourrate1(BigDecimal hourrate1) {
		this.hourrate1 = hourrate1;
	}

	public BigDecimal getHourrate2() {
		return hourrate2;
	}

	public void setHourrate2(BigDecimal hourrate2) {
		this.hourrate2 = hourrate2;
	}

	public BigDecimal getHourrate3() {
		return hourrate3;
	}

	public void setHourrate3(BigDecimal hourrate3) {
		this.hourrate3 = hourrate3;
	}

	public BigDecimal getHourrate4() {
		return hourrate4;
	}

	public void setHourrate4(BigDecimal hourrate4) {
		this.hourrate4 = hourrate4;
	}

	public BigDecimal getHourrate5() {
		return hourrate5;
	}

	public void setHourrate5(BigDecimal hourrate5) {
		this.hourrate5 = hourrate5;
	}

	public BigDecimal getHourrate6() {
		return hourrate6;
	}

	public void setHourrate6(BigDecimal hourrate6) {
		this.hourrate6 = hourrate6;
	}

	public BigDecimal getHourrate7() {
		return hourrate7;
	}

	public void setHourrate7(BigDecimal hourrate7) {
		this.hourrate7 = hourrate7;
	}

	public BigDecimal getHourrate8() {
		return hourrate8;
	}

	public void setHourrate8(BigDecimal hourrate8) {
		this.hourrate8 = hourrate8;
	}

	public BigDecimal getHourrate9() {
		return hourrate9;
	}

	public void setHourrate9(BigDecimal hourrate9) {
		this.hourrate9 = hourrate9;
	}

	public BigDecimal getHourrate10() {
		return hourrate10;
	}

	public void setHourrate10(BigDecimal hourrate10) {
		this.hourrate10 = hourrate10;
	}

	public BigDecimal getHourrate11() {
		return hourrate11;
	}

	public void setHourrate11(BigDecimal hourrate11) {
		this.hourrate11 = hourrate11;
	}

	public BigDecimal getHourrate12() {
		return hourrate12;
	}

	public void setHourrate12(BigDecimal hourrate12) {
		this.hourrate12 = hourrate12;
	}

	public BigDecimal getHourrate13() {
		return hourrate13;
	}

	public void setHourrate13(BigDecimal hourrate13) {
		this.hourrate13 = hourrate13;
	}

	public BigDecimal getHourrate14() {
		return hourrate14;
	}

	public void setHourrate14(BigDecimal hourrate14) {
		this.hourrate14 = hourrate14;
	}

	public BigDecimal getHourrate15() {
		return hourrate15;
	}

	public void setHourrate15(BigDecimal hourrate15) {
		this.hourrate15 = hourrate15;
	}

	public BigDecimal getHourrate16() {
		return hourrate16;
	}

	public void setHourrate16(BigDecimal hourrate16) {
		this.hourrate16 = hourrate16;
	}

	public BigDecimal getHourrate17() {
		return hourrate17;
	}

	public void setHourrate17(BigDecimal hourrate17) {
		this.hourrate17 = hourrate17;
	}

	public BigDecimal getHourrate18() {
		return hourrate18;
	}

	public void setHourrate18(BigDecimal hourrate18) {
		this.hourrate18 = hourrate18;
	}

	public BigDecimal getHourrate19() {
		return hourrate19;
	}

	public void setHourrate19(BigDecimal hourrate19) {
		this.hourrate19 = hourrate19;
	}

	public BigDecimal getHourrate20() {
		return hourrate20;
	}

	public void setHourrate20(BigDecimal hourrate20) {
		this.hourrate20 = hourrate20;
	}

	public String getYearweekfrom1() {
		return yearweekfrom1;
	}

	public void setYearweekfrom1(String yearweekfrom1) {
		this.yearweekfrom1 = yearweekfrom1;
	}

	public String getYearweekfrom2() {
		return yearweekfrom2;
	}

	public void setYearweekfrom2(String yearweekfrom2) {
		this.yearweekfrom2 = yearweekfrom2;
	}

	public String getYearweekfrom3() {
		return yearweekfrom3;
	}

	public void setYearweekfrom3(String yearweekfrom3) {
		this.yearweekfrom3 = yearweekfrom3;
	}

	public String getYearweekfrom4() {
		return yearweekfrom4;
	}

	public void setYearweekfrom4(String yearweekfrom4) {
		this.yearweekfrom4 = yearweekfrom4;
	}

	public String getYearweekfrom5() {
		return yearweekfrom5;
	}

	public void setYearweekfrom5(String yearweekfrom5) {
		this.yearweekfrom5 = yearweekfrom5;
	}

	public String getYearweekfrom6() {
		return yearweekfrom6;
	}

	public void setYearweekfrom6(String yearweekfrom6) {
		this.yearweekfrom6 = yearweekfrom6;
	}

	public String getYearweekfrom7() {
		return yearweekfrom7;
	}

	public void setYearweekfrom7(String yearweekfrom7) {
		this.yearweekfrom7 = yearweekfrom7;
	}

	public String getYearweekfrom8() {
		return yearweekfrom8;
	}

	public void setYearweekfrom8(String yearweekfrom8) {
		this.yearweekfrom8 = yearweekfrom8;
	}

	public String getYearweekfrom9() {
		return yearweekfrom9;
	}

	public void setYearweekfrom9(String yearweekfrom9) {
		this.yearweekfrom9 = yearweekfrom9;
	}

	public String getYearweekfrom10() {
		return yearweekfrom10;
	}

	public void setYearweekfrom10(String yearweekfrom10) {
		this.yearweekfrom10 = yearweekfrom10;
	}

	public String getYearweekto1() {
		return yearweekto1;
	}

	public void setYearweekto1(String yearweekto1) {
		this.yearweekto1 = yearweekto1;
	}

	public String getYearweekto2() {
		return yearweekto2;
	}

	public void setYearweekto2(String yearweekto2) {
		this.yearweekto2 = yearweekto2;
	}

	public String getYearweekto3() {
		return yearweekto3;
	}

	public void setYearweekto3(String yearweekto3) {
		this.yearweekto3 = yearweekto3;
	}

	public String getYearweekto4() {
		return yearweekto4;
	}

	public void setYearweekto4(String yearweekto4) {
		this.yearweekto4 = yearweekto4;
	}

	public String getYearweekto5() {
		return yearweekto5;
	}

	public void setYearweekto5(String yearweekto5) {
		this.yearweekto5 = yearweekto5;
	}

	public String getYearweekto6() {
		return yearweekto6;
	}

	public void setYearweekto6(String yearweekto6) {
		this.yearweekto6 = yearweekto6;
	}

	public String getYearweekto7() {
		return yearweekto7;
	}

	public void setYearweekto7(String yearweekto7) {
		this.yearweekto7 = yearweekto7;
	}

	public String getYearweekto8() {
		return yearweekto8;
	}

	public void setYearweekto8(String yearweekto8) {
		this.yearweekto8 = yearweekto8;
	}

	public String getYearweekto9() {
		return yearweekto9;
	}

	public void setYearweekto9(String yearweekto9) {
		this.yearweekto9 = yearweekto9;
	}

	public String getYearweekto10() {
		return yearweekto10;
	}

	public void setYearweekto10(String yearweekto10) {
		this.yearweekto10 = yearweekto10;
	}

	public BigDecimal getSpecialhour1() {
		return specialhour1;
	}

	public void setSpecialhour1(BigDecimal specialhour1) {
		this.specialhour1 = specialhour1;
	}

	public BigDecimal getSpecialhour2() {
		return specialhour2;
	}

	public void setSpecialhour2(BigDecimal specialhour2) {
		this.specialhour2 = specialhour2;
	}

	public BigDecimal getSpecialhour3() {
		return specialhour3;
	}

	public void setSpecialhour3(BigDecimal specialhour3) {
		this.specialhour3 = specialhour3;
	}

	public BigDecimal getSpecialhour4() {
		return specialhour4;
	}

	public void setSpecialhour4(BigDecimal specialhour4) {
		this.specialhour4 = specialhour4;
	}

	public BigDecimal getSpecialhour5() {
		return specialhour5;
	}

	public void setSpecialhour5(BigDecimal specialhour5) {
		this.specialhour5 = specialhour5;
	}

	public BigDecimal getSpecialhour6() {
		return specialhour6;
	}

	public void setSpecialhour6(BigDecimal specialhour6) {
		this.specialhour6 = specialhour6;
	}

	public BigDecimal getSpecialhour7() {
		return specialhour7;
	}

	public void setSpecialhour7(BigDecimal specialhour7) {
		this.specialhour7 = specialhour7;
	}

	public BigDecimal getSpecialhour8() {
		return specialhour8;
	}

	public void setSpecialhour8(BigDecimal specialhour8) {
		this.specialhour8 = specialhour8;
	}

	public BigDecimal getSpecialhour9() {
		return specialhour9;
	}

	public void setSpecialhour9(BigDecimal specialhour9) {
		this.specialhour9 = specialhour9;
	}

	public BigDecimal getSpecialhour10() {
		return specialhour10;
	}

	public void setSpecialhour10(BigDecimal specialhour10) {
		this.specialhour10 = specialhour10;
	}

	public Integer getUseforworkresource() {
		return useforworkresource;
	}

	public void setUseforworkresource(Integer useforworkresource) {
		this.useforworkresource = useforworkresource;
	}

	public Integer getUseforworkresponsible() {
		return useforworkresponsible;
	}

	public void setUseforworkresponsible(Integer useforworkresponsible) {
		this.useforworkresponsible = useforworkresponsible;
	}

	public Integer getUseforworkorderby() {
		return useforworkorderby;
	}

	public void setUseforworkorderby(Integer useforworkorderby) {
		this.useforworkorderby = useforworkorderby;
	}

	public Integer getUseforpurchaseorderby() {
		return useforpurchaseorderby;
	}

	public void setUseforpurchaseorderby(Integer useforpurchaseorderby) {
		this.useforpurchaseorderby = useforpurchaseorderby;
	}

	public Integer getUseforintpurcorderby() {
		return useforintpurcorderby;
	}

	public void setUseforintpurcorderby(Integer useforintpurcorderby) {
		this.useforintpurcorderby = useforintpurcorderby;
	}

	public Integer getUseforprojectresponsible() {
		return useforprojectresponsible;
	}

	public void setUseforprojectresponsible(Integer useforprojectresponsible) {
		this.useforprojectresponsible = useforprojectresponsible;
	}

	public Integer getUseforprojectorderby() {
		return useforprojectorderby;
	}

	public void setUseforprojectorderby(Integer useforprojectorderby) {
		this.useforprojectorderby = useforprojectorderby;
	}

	public Integer getUseforstockremoval() {
		return useforstockremoval;
	}

	public void setUseforstockremoval(Integer useforstockremoval) {
		this.useforstockremoval = useforstockremoval;
	}

	public Long getHumanbarcode() {
		return humanbarcode;
	}

	public void setHumanbarcode(Long humanbarcode) {
		this.humanbarcode = humanbarcode;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public Integer getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}

	public Date getLastchangedate() {
		return lastchangedate;
	}

	public void setLastchangedate(Date lastchangedate) {
		this.lastchangedate = lastchangedate;
	}

	public Integer getLastchangetime() {
		return lastchangetime;
	}

	public void setLastchangetime(Integer lastchangetime) {
		this.lastchangetime = lastchangetime;
	}

	public Date getLastexportdate() {
		return lastexportdate;
	}

	public void setLastexportdate(Date lastexportdate) {
		this.lastexportdate = lastexportdate;
	}

	public Integer getLastexporttime() {
		return lastexporttime;
	}

	public void setLastexporttime(Integer lastexporttime) {
		this.lastexporttime = lastexporttime;
	}

	public Date getLastimportdate() {
		return lastimportdate;
	}

	public void setLastimportdate(Date lastimportdate) {
		this.lastimportdate = lastimportdate;
	}

	public Integer getLastimporttime() {
		return lastimporttime;
	}

	public void setLastimporttime(Integer lastimporttime) {
		this.lastimporttime = lastimporttime;
	}

	public Integer getNonproductiveaccountid() {
		return nonproductiveaccountid;
	}

	public void setNonproductiveaccountid(Integer nonproductiveaccountid) {
		this.nonproductiveaccountid = nonproductiveaccountid;
	}

	public Integer getSiteid() {
		return siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

	public Integer getRecordactive() {
		return recordactive;
	}

	public void setRecordactive(Integer recordactive) {
		this.recordactive = recordactive;
	}

	public String getCustombarcode() {
		return custombarcode;
	}

	public void setCustombarcode(String custombarcode) {
		this.custombarcode = custombarcode;
	}

	public String getExtrawsinfo1() {
		return extrawsinfo1;
	}

	public void setExtrawsinfo1(String extrawsinfo1) {
		this.extrawsinfo1 = extrawsinfo1;
	}

	public String getExtrawsinfo2() {
		return extrawsinfo2;
	}

	public void setExtrawsinfo2(String extrawsinfo2) {
		this.extrawsinfo2 = extrawsinfo2;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public String getComment1() {
		return comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

	public String getComment2() {
		return comment2;
	}

	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

	public String getComment3() {
		return comment3;
	}

	public void setComment3(String comment3) {
		this.comment3 = comment3;
	}

	public String getComment4() {
		return comment4;
	}

	public void setComment4(String comment4) {
		this.comment4 = comment4;
	}

	public String getComment5() {
		return comment5;
	}

	public void setComment5(String comment5) {
		this.comment5 = comment5;
	}

	public String getComment6() {
		return comment6;
	}

	public void setComment6(String comment6) {
		this.comment6 = comment6;
	}

	public String getComment7() {
		return comment7;
	}

	public void setComment7(String comment7) {
		this.comment7 = comment7;
	}

	public String getComment8() {
		return comment8;
	}

	public void setComment8(String comment8) {
		this.comment8 = comment8;
	}

	public String getComment9() {
		return comment9;
	}

	public void setComment9(String comment9) {
		this.comment9 = comment9;
	}

	public String getComment10() {
		return comment10;
	}

	public void setComment10(String comment10) {
		this.comment10 = comment10;
	}

	public Integer getPlanningactive() {
		return planningactive;
	}

	public void setPlanningactive(Integer planningactive) {
		this.planningactive = planningactive;
	}

	public BigDecimal getPlantopct() {
		return plantopct;
	}

	public void setPlantopct(BigDecimal plantopct) {
		this.plantopct = plantopct;
	}

	public Integer getWsgroupid() {
		return wsgroupid;
	}

	public void setWsgroupid(Integer wsgroupid) {
		this.wsgroupid = wsgroupid;
	}

	public BigDecimal getNumbermen() {
		return numbermen;
	}

	public void setNumbermen(BigDecimal numbermen) {
		this.numbermen = numbermen;
	}

	public BigDecimal getHourspersonweek() {
		return hourspersonweek;
	}

	public void setHourspersonweek(BigDecimal hourspersonweek) {
		this.hourspersonweek = hourspersonweek;
	}

	public Integer getLocationid() {
		return locationid;
	}

	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}

	public String getExtrawsinfo3() {
		return extrawsinfo3;
	}

	public void setExtrawsinfo3(String extrawsinfo3) {
		this.extrawsinfo3 = extrawsinfo3;
	}

	public String getExtrawsinfo4() {
		return extrawsinfo4;
	}

	public void setExtrawsinfo4(String extrawsinfo4) {
		this.extrawsinfo4 = extrawsinfo4;
	}

	public String getExtrawsinfo5() {
		return extrawsinfo5;
	}

	public void setExtrawsinfo5(String extrawsinfo5) {
		this.extrawsinfo5 = extrawsinfo5;
	}

	public Integer getContactpersonid() {
		return contactpersonid;
	}

	public void setContactpersonid(Integer contactpersonid) {
		this.contactpersonid = contactpersonid;
	}

	public Integer getShiftplanid() {
		return shiftplanid;
	}

	public void setShiftplanid(Integer shiftplanid) {
		this.shiftplanid = shiftplanid;
	}

	public Integer getShiftnextseq() {
		return shiftnextseq;
	}

	public void setShiftnextseq(Integer shiftnextseq) {
		this.shiftnextseq = shiftnextseq;
	}

	public Date getShiftinitialdate() {
		return shiftinitialdate;
	}

	public void setShiftinitialdate(Date shiftinitialdate) {
		this.shiftinitialdate = shiftinitialdate;
	}

	public BigDecimal getShiftinitialoffset() {
		return shiftinitialoffset;
	}

	public void setShiftinitialoffset(BigDecimal shiftinitialoffset) {
		this.shiftinitialoffset = shiftinitialoffset;
	}

	public Integer getUseforroundresponsible() {
		return useforroundresponsible;
	}

	public void setUseforroundresponsible(Integer useforroundresponsible) {
		this.useforroundresponsible = useforroundresponsible;
	}

	public String getExtrawsinfo6() {
		return extrawsinfo6;
	}

	public void setExtrawsinfo6(String extrawsinfo6) {
		this.extrawsinfo6 = extrawsinfo6;
	}

	public String getExtrawsinfo7() {
		return extrawsinfo7;
	}

	public void setExtrawsinfo7(String extrawsinfo7) {
		this.extrawsinfo7 = extrawsinfo7;
	}

	public String getExtrawsinfo8() {
		return extrawsinfo8;
	}

	public void setExtrawsinfo8(String extrawsinfo8) {
		this.extrawsinfo8 = extrawsinfo8;
	}

	public String getExtrawsinfo9() {
		return extrawsinfo9;
	}

	public void setExtrawsinfo9(String extrawsinfo9) {
		this.extrawsinfo9 = extrawsinfo9;
	}

	public String getExtrawsinfo10() {
		return extrawsinfo10;
	}

	public void setExtrawsinfo10(String extrawsinfo10) {
		this.extrawsinfo10 = extrawsinfo10;
	}

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public Integer getMoid() {
		return moid;
	}

	public void setMoid(Integer moid) {
		this.moid = moid;
	}

	public Integer getPlantid() {
		return plantid;
	}

	public void setPlantid(Integer plantid) {
		this.plantid = plantid;
	}

	public Integer getLegalunitid() {
		return legalunitid;
	}

	public void setLegalunitid(Integer legalunitid) {
		this.legalunitid = legalunitid;
	}

	public String getLegalunitcurrencyid() {
		return legalunitcurrencyid;
	}

	public void setLegalunitcurrencyid(String legalunitcurrencyid) {
		this.legalunitcurrencyid = legalunitcurrencyid;
	}

	public Date getLastchangedtz() {
		return lastchangedtz;
	}

	public void setLastchangedtz(Date lastchangedtz) {
		this.lastchangedtz = lastchangedtz;
	}

	public Date getLastexportdtz() {
		return lastexportdtz;
	}

	public void setLastexportdtz(Date lastexportdtz) {
		this.lastexportdtz = lastexportdtz;
	}

	public Date getLastimportdtz() {
		return lastimportdtz;
	}

	public void setLastimportdtz(Date lastimportdtz) {
		this.lastimportdtz = lastimportdtz;
	}

	public Integer getRecordlanguageid() {
		return recordlanguageid;
	}

	public void setRecordlanguageid(Integer recordlanguageid) {
		this.recordlanguageid = recordlanguageid;
	}

	public Integer getOnguard() {
		return onguard;
	}

	public void setOnguard(Integer onguard) {
		this.onguard = onguard;
	}

	public Integer getIssupplier() {
		return issupplier;
	}

	public void setIssupplier(Integer issupplier) {
		this.issupplier = issupplier;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getJudgegrade() {
		return judgegrade;
	}

	public void setJudgegrade(Integer judgegrade) {
		this.judgegrade = judgegrade;
	}

	public Integer getShiftid() {
		return shiftid;
	}

	public void setShiftid(Integer shiftid) {
		this.shiftid = shiftid;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public Integer getStatusid() {
		return statusid;
	}

	public void setStatusid(Integer statusid) {
		this.statusid = statusid;
	}

	public Integer getHumanstatus() {
		return humanstatus;
	}

	public void setHumanstatus(Integer humanstatus) {
		this.humanstatus = humanstatus;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
