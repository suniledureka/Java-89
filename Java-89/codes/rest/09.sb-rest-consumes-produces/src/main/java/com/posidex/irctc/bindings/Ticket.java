package com.posidex.irctc.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {
	private String name;
	private String fromStation;
	private String toStation;
	private String doj;
	private String trainNo;
	
	private String pnr;
	private String dob;
	private String status;
	private Float fare;
}
