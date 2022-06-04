package com.hk.json;

import lombok.Data;

@Data
public class Address 
{
	private String house;
	private String community;
	private String town;
	private String district;
	private String state;
	private Integer pinCode;
}
