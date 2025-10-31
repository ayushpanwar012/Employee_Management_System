package com.ems.model;

public class Employee {

	private int id;
	private String name;
	private String department;
	private double salary;
	
	public Employee() {}
	public Employee(String name,String department,double salary) {
		
		this.name=name;
		this.department=department;
		this.salary=salary;
		
		
	}
	
	public int getid() {return id;}
	public int setid(int id) {return this.id=id;}
	
	public String getName() {return name;}
	public String setName(String name) {return this.name=name;}
	
	public String getDepartment() {return department;}
	public String setDepartment(String department) {return this.department=department;}
	
	public double getSalary() {return salary;}
	public double setSalary(double salary) {return this.salary=salary;}
	
}
