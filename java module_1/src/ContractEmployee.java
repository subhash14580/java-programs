//package com;

public class ContractEmployee extends Employee{
	private double ratePerHour;
	private int  totalWorkingHoursPerDay;
	public ContractEmployee(int empoyeeId, String employeeName, String employeeType, int totalWorkingDaysPerMonth) {
		super(totalWorkingDaysPerMonth, employeeType, employeeType, totalWorkingDaysPerMonth);
	}
	public double getRatePerHour() {
		return ratePerHour;
	}
	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	public int getTotalWorkingHoursPerDay() {
		return totalWorkingHoursPerDay;
	}
	public void setTotalWorkingHoursPerDay(int totalWorkingHoursPerDay) {
		this.totalWorkingHoursPerDay = totalWorkingHoursPerDay;
	}
	public double calculateSalary(){
		double val=ratePerHour*totalWorkingHoursPerDay*getTotalWorkingDaysPerMonth();
		
		return val;
	}
}
