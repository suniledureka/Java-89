package com.posidex.irctc.bindings;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@Entity
@Table
public class Ticket {
	@Id
	private String pnr;
	
	private String name;
	private String fromStation;
	private String toStation;
	private String doj;
	private String trainNo;

	private String dob;
	private String status;
	private Float fare;
}
