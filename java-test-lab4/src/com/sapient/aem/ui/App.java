package com.sapient.aem.ui;

import java.util.Scanner;

import com.sapient.aem.bean.Employee;
import com.sapient.aem.service.EmployeeService;
import com.sapient.aem.service.EmployeeServiceImpl;

public class App {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("===Enter employee id===");
int id=sc.nextInt();
System.out.println("===Enter employee name===");
String name=sc.next();
System.out.println("===Enter employee Salary===");
double salary=sc.nextInt();
System.out.println("===Enter employee designation===");
String designation=sc.next();

EmployeeServiceImpl employeeimpl=new EmployeeServiceImpl();

Employee employee=employeeimpl.getEmployee(id, name, salary, designation);

System.out.println("\n=================================================");


System.out.println("Insurance scheme is :: "+ employeeimpl.findSuitableInsurance(employee));

System.out.println("\n====================Employee Details=============================");
employeeimpl.displayDetails(employee);




		
	}

}
