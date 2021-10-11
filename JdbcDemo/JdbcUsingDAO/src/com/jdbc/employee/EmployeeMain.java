package com.jdbc.employee;

import com.jdbc.dao.EmployeeDAOImp;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeDAOImp emp=new EmployeeDAOImp();
		
		//emp.employeeAllDetails();
		
		 //emp.updateEmployeeDetails();
		
		//emp.singleEmployeeDetailsByID();
		
		//emp.insertEmployeeDetails();
		
		//emp.deleteEmployeeDetails();
		
		//emp.updateSalaryAndEmail();
		
		//emp.readSalaryByID();
		
		//emp.readEmailByID();
		
		emp.readCityByID(); 
	}

}
