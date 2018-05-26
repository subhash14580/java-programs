//package com;

public abstract class Employee {
	private int empoyeeId;
	private String employeeName;
	private String employeeType;
	private int totalWorkingDaysPerMonth;
	public Employee(int empoyeeId, String employeeName, String employeeType, int totalWorkingDaysPerMonth) {
		super();
		this.empoyeeId = empoyeeId;
		this.employeeName = employeeName;
		this.employeeType = employeeType;
		this.totalWorkingDaysPerMonth = totalWorkingDaysPerMonth;
	}
	public int getEmpoyeeId() {
		return empoyeeId;
	}
	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public int getTotalWorkingDaysPerMonth() {
		return totalWorkingDaysPerMonth;
	}
	public void setTotalWorkingDaysPerMonth(int totalWorkingDaysPerMonth) {
		this.totalWorkingDaysPerMonth = totalWorkingDaysPerMonth;
	}
	
	

}
