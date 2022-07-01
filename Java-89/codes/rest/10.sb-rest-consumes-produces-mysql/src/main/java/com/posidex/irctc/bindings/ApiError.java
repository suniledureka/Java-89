package com.posidex.irctc.bindings;

import lombok.Data;

@Data
public class ApiError {
	private Integer code;
	private String message;
	private String type;
	private String date;	
}
