/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: CMSRuntimeException.java 
 * @Prject: lifeihong-cms
 * @Package: com.lifeihong.cms.util 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月14日 下午3:04:44 
 * @version: V1.0   
 */
package com.lifeihong.cms.util;

/**
 * @ClassName: CMSRuntimeException
 * @Description: 自定义异常
 * @author: charles
 * @date: 2019年8月14日 下午3:04:44
 */
public class CMSRuntimeException extends RuntimeException {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	public CMSRuntimeException() {
		super();
	}

	public CMSRuntimeException(String message) {
		super(message);
	}

}
