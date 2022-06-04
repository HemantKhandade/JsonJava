package com.hk.json;

import java.util.Map;

public class LoadData {
	Employee employee;
	Map<String, Employee> employeeList;
	
	public Employee loadEmployeeData() {
		
		employee = new Employee();
		employee.setId("HK0074515");
		employee.setName("Hemant");
		employee.setLname("Khandade");
		employee.setAge("48");
		
		Address permanentAddress = new Address();
		permanentAddress.setHouse("B-101");
		permanentAddress.setCommunity("Nisarg City-2");
		permanentAddress.setTown("Wakad");
		permanentAddress.setDistrict("Pune");
		permanentAddress.setState("MH");
		permanentAddress.setPinCode(411057); 
		
		Address currentAddress = new Address();
		currentAddress.setHouse("B-1403");
		currentAddress.setCommunity("YashOne, Pathak Road");
		currentAddress.setTown("Maan");
		currentAddress.setDistrict("Pune");
		currentAddress.setState("MH");
		currentAddress.setPinCode(411057); 
		
		EmployeeLocations locations = new EmployeeLocations();
		locations.setCurrentAddress(currentAddress);
		locations.setPermanentAddress(permanentAddress);
		
		employee.setAddress(locations);
		
		return employee;
	}
	
	public Employee loadEmployeeListData() {
		return null;
	}
}
