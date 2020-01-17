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
	private Integer tombstone;


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

	public Integer getTombstone() {
		return tombstone;
	}

	public void setTombstone(Integer tombstone) {
		this.tombstone = tombstone;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
