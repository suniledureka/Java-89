package com.posidex.boot.rest.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
	@XmlElement(name = "bid")
	@JsonProperty("bid")
	private Integer bookId;
	
	@JsonProperty("title")
	private String bookTitle;
	
	@XmlElement(name = "price")
	private Float bookPrice;
}
