package com.xhxx.utils;

/**
 * 常量编码
 * 
 * @author zhang
 *
 */
public interface ConstantsCode {

	/**
	 * 初始数据
	 */
	static final int INITIAL = 0;
	
	/**
	 * 处理成功
	 */
	static final int SUCCESS = 1;
	
	/**
	 * 待处理
	 */
	static final int PENDING = 2;
	
	/**
	 * 失败
	 */
	static final int FAILED = -1;
	
	/**
	 * 处理成功，但推送到安全教育失败
	 */
	static final int insert_faild = -3;

}
