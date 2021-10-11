package com.jdbc.dao;

public interface EmployeeDAO {

	void employeeAllDetails();

	void updateEmployeeDetails();

	void singleEmployeeDetailsByID();

	void insertEmployeeDetails();

	void deleteEmployeeDetails();

	void updateSalaryAndEmail();

	void readSalaryByID();

	void readEmailByID();

	void readCityByID();
}
