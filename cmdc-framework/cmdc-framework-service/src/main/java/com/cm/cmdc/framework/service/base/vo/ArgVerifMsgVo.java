package com.cm.cmdc.framework.service.base.vo;

import java.io.Serializable;
import java.util.List;

public class ArgVerifMsgVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ArgErrorVo> argErrorMsg;
	
	public List<ArgErrorVo> getArgErrorMsg() {
		return argErrorMsg;
	}
	public void setArgErrorMsg(List<ArgErrorVo> argErrorMsg) {
		this.argErrorMsg = argErrorMsg;
	}

	
}
