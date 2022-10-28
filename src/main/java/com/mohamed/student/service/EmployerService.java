package com.mohamed.student.service;

import java.util.List;

import com.mohamed.student.entities.*;

public interface EmployerService {

	Employer saveEmployer(Employer e);
	Employer updateEmployer(Employer e);
	void deleteEmployer(Employer e);
	void deleteEmployerById(Long id);
	Employer getEmployer(Long id);
	List<Employer> getAllEmployers();
	
	List<Employer> FindEmployerByName(String name);
	List<Employer> FindEmployerByNameConatins(String name);
	List<Employer> findByNameSalary(String name, Double salary);
	List<Employer> findByCategorie(Category cat);
	List<Employer> findByCategorieIdCat(Long id);
	List<Employer> findByOrderByNomEmployerAsc();
	List<Employer> sortEmployersNameSalary();
}
