/**
 * 
 */
package com.sapient.aem.service;

import com.sapient.aem.bean.Employee;

/**
 * @author amikarma
 *
 */
public interface EmployeeService {

	public Employee getEmployee(int id, String name, double salary, String designation);
	
	public String findSuitableInsurance(Employee employee);
	
	public void displayDetails(Employee employee);

	

	


	
}
