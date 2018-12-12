/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.framework.client.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * RequestDto
 * @author zhuxiuhong
 * @since 2018
 * @param <T>
 */
public class RequestDto<T extends BaseBusinessDto> {

	@NotNull(message = "framework.request.head.null")
	@Valid
	private Header header;

	@Valid
	private T data;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RequestDto [header=" + header + ", data=" + data + "]";
	}

}
