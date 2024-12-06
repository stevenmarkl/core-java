package com.Day3;

//Java bean 
class Emp{
	private int eid;
	private String ename;
	private double esalary;
	public Emp() {
		
	
	}
	public Emp(int eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		System.out.println("Changed salary =" +esalary);
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	
	
	
}


public class Javabean {
	
	
	public static void main(String[] args) {
		Emp partha = new Emp(101,"partha",2000);
		
		partha.setEsalary(1000);
		partha.getEsalary();
	}

}
