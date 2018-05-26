//package com;

public class PermanentEmployee extends Employee{
	private double ratePerDay;

	public PermanentEmployee(int empoyeeId, String employeeName, String employeeType, int totalWorkingDaysPerMonth) {
		super(empoyeeId, employeeName, employeeType, totalWorkingDaysPerMonth);
		
	}

	public double getRatePerDay() {
		return ratePerDay;
	}

	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}
	
	public double calculateSalary(){
		double val;
		val=ratePerDay*getTotalWorkingDaysPerMonth();
		return val;
	}

}
