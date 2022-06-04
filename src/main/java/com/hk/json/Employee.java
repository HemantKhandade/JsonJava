package com.hk.json;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Employee 
{ 
	private String id;
	private String name;
	private String lname;
	private String age;
	private EmployeeLocations address;
	private String company;
}
