/**   
 * Copyright © 2019 西安东恒鑫源软件开发有限公司版权所有.
 * 
 * 功能描述：
 * @Package: com.ehs.security.entity 
 * @author: chentm   
 * @date: 2019年5月28日 上午10:42:52 
 */
package com.ehs.common.organization.entity.entitysuper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import com.ehs.common.auth.entity.SysUser;
import com.ehs.common.base.entity.BaseEntity;


/**   
* Copyright: Copyright (c) 2019 西安东恒鑫源软件开发有限公司
* @ClassName: UserBaseInfo.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: chentm
* @date: 2019年5月28日 上午10:42:52 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年5月28日      chentm          v1.0.0               修改原因
*/
@MappedSuperclass
public abstract  class OrgUser extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	public static final String DATA_CODE="dataCode";
	public static final String NAME="name";
	public static final String SYS_USER_KEY="sysUserKey";
	public static final String EMAIL="email";
	public static final String TELEPHONE="telephone";
	public static final String ORG_KEY="orgKey";
	/**
	 * 员工编号
	 */
	private String dataCode;
	/**
	 * 所属组织
	 */
	private String orgKey;
	/**
	 * 员工账号
	 */
	private String sysUserKey;
	/**
	 * 员工姓名
	 */
	private String name;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 手机
	 */
	private String telephone;
	
	
	
	






	public String getOrgKey() {
		return orgKey;
	}

	public void setOrgKey(String orgKey) {
		this.orgKey = orgKey;
	}

	public String getDataCode() {
		return dataCode;
	}

	public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}



	public String getSysUserKey() {
		return sysUserKey;
	}

	public void setSysUserKey(String sysUserKey) {
		this.sysUserKey = sysUserKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	

}
