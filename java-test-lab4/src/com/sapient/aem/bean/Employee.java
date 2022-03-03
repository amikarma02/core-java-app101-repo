package com.sapient.aem.bean;

public class Employee {

	//fields
  private int id;
  private String name;
  private double salary;
  private String designation;
  private static String insuranceScheme="No scheme";
  
 //Default constructor or non-parameterized constructor
public Employee() {
}

//parameterized constructor
public Employee(int id, String name, double salary, String designation) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.designation = designation;

}

//Getters and setters

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getInsuranceScheme() {
	return insuranceScheme;
}

	
	
	
}
