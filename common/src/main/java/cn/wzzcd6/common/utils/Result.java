package cn.wzzcd6.common.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * 前后端交互数据标准
 */
@Data
public class Result implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 消息
	 */
	private String msg;

	/**
	 * 返回代码
	 */
	private Integer code;

	/**
	 * 结果
	 */
	private Object resp;
	
	/**
	 * 成功
	 * @param result
	 */
	public Result(Object resp) {
		this.code = 200;
		this.msg = "成功";
		this.resp = resp;
	}
	public Result(int code,String msg) {
		this.code = code;
		this.msg = msg;
		this.resp = null;
	}

}
