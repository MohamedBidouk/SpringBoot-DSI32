package com.mohamed.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohamed.student.entities.Category;
import com.mohamed.student.entities.Employer;
import com.mohamed.student.repository.EmployerRepository;

@Service
public class EmpServiceImpl implements EmployerService{

	@Autowired
	EmployerRepository empRepository;
	
	@Override
	public Employer saveEmployer(Employer e) {
		return empRepository.save(e);
	}

	@Override
	public Employer updateEmployer(Employer e) {
		return empRepository.save(e);
	}

	@Override
	public void deleteEmployer(Employer e) {
		empRepository.delete(e);
		
	}

	@Override
	public void deleteEmployerById(Long id) {
		empRepository.deleteById(id);
		
	}

	@Override
	public Employer getEmployer(Long id) {
		return empRepository.findById(id).get();
	}

	@Override
	public List<Employer> getAllEmployers() {
		return empRepository.findAll();
	}

	@Override
	public List<Employer> FindEmployerByName(String name) {
		return empRepository.findByNameEmployer(name);
	}

	@Override
	public List<Employer> FindEmployerByNameConatins(String name) {
		return empRepository.findByNameEmployerContains(name);
	}

	@Override
	public List<Employer> findByNameSalary(String name, Double salary) {
		return empRepository.findByNameSalary(name, salary);
	}

	@Override
	public List<Employer> findByCategorie(Category cat) {
		return empRepository.findByCategorie(cat);
	}

	@Override
	public List<Employer> findByCategorieIdCat(Long id) {
		return empRepository.findByCategoryIdCat(id);
	}

	@Override
	public List<Employer> findByOrderByNomEmployerAsc() {
		return empRepository.findByOrderByNameEmployerAsc();
	}

	@Override
	public List<Employer> sortEmployersNameSalary() {
		return empRepository.sortEmployersNameSalary();
	}

	
}
