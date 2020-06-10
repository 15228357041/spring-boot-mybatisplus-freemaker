package cn.chinau8.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Getter;
import lombok.Setter;


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
@Getter
@Setter
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




	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
