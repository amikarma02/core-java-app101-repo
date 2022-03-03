/**
 * 
 */
package com.sapient.aem.service;

import com.sapient.aem.bean.Employee;

/**
 * @author amikarma
 *
 */
public class EmployeeServiceImpl implements EmployeeService {

//getting a employee object
	@Override
	public Employee getEmployee(int id,String name,double salary,
			String designation) {
		
		return new Employee(id,name,salary,designation);
	}

	//finding the scheme based on the conditions like salary and designation 
	@Override
	public String findSuitableInsurance(Employee employee) {
		double salary=employee.getSalary();
		String designation=employee.getDesignation();
		String scheme= "No Scheme";
		
		if(salary>5000 && salary< 20000 &&designation.equalsIgnoreCase("System Associate")){
			scheme= "Scheme C";
		}
		else if(salary>=20000 && salary< 40000 &&designation.equalsIgnoreCase("Programmer")){
			scheme= "Scheme B";
				}
				
		else if(salary>=40000 &&designation.equalsIgnoreCase("Manager")){
			scheme= "Scheme A";
				}
				else{
					scheme= "No Scheme";
				}
		
		
		return scheme;
	}

	//displaying the employee details
	@Override
	public void displayDetails(Employee employee) {
		System.out.println("Employee id: " +employee.getId()+"\nEmployee name: "+employee.getName()+"\nDesignation: "+employee.getDesignation()+"\nSalary: "+employee.getSalary());

	}

}
