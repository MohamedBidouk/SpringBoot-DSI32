package com.mohamed.student;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mohamed.student.entities.*;
import com.mohamed.student.repository.EmployerRepository;

@SpringBootTest
class Employer1ApplicationTests {

	@Autowired
	private EmployerRepository employerRepository;
	@Test
	public void testCreateEmployer() {
	Employer emp = new Employer("Hamed",3092.5,new Date());
	employerRepository.save(emp);
	}

	@Test
	public void testFindEmployer()
	{
	Employer e = employerRepository.findById(1L).get();
	System.out.println(e);
	}
	
	@Test
	public void testUpdateEmployer()
	{
	Employer e = employerRepository.findById(1L).get();
	e.setSalaryEmployer(1000.0);
	employerRepository.save(e);
	}
	
	@Test
	public void testDeleteEmployer()
	{
	employerRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousEmployers()
	{
	List<Employer> emps = employerRepository.findAll();
	for (Employer e : emps)
	{
	System.out.println(e);
	}
	}
	
	@Test
	public void testFindEmployerByName()
	{
		List<Employer> emps = employerRepository.findByNameEmployer("PC Dell");
		for (Employer e : emps)
			{
				System.out.println(e);
			}
	}
	
	@Test
	public void testFindEmployerByNameConatins()
	{
		List<Employer> emps = employerRepository.findByNameEmployer("k");
		for (Employer e : emps)
			{
				System.out.println(e);
			}
	}
	
	@Test
	public void testfindByNameSalary()
	{
		List<Employer> emps = employerRepository.findByNameSalary("PC Dell", 3.0);
		for (Employer e : emps)
			{
				System.out.println(e);
			}
	}
	
	@Test
	public void testfindByCategorie()
	{
		Category cat = new Category();
		cat.setIdCat(1L);
		List<Employer> emps = employerRepository.findByCategorie(cat);
		for (Employer e : emps)
			{
				System.out.println(e);
			}
	}
	
	@Test
	public void testFindByCategorieIdCat()
	{
		List<Employer> emps = employerRepository.findByCategoryIdCat(1L);
		for (Employer e : emps)
			{
				System.out.println(e);
			}
	 }

	@Test
	public void testfindByOrderByNomEmployerAsc()
	{
		List<Employer> emps = employerRepository.findByOrderByNameEmployerAsc();
		for (Employer e : emps)
			{
				System.out.println(e);
			}
	}
	
	@Test
	public void testSortEmployersNameSalary()
		{
			List<Employer> emps = employerRepository.sortEmployersNameSalary();
			for (Employer e : emps)
				{
					System.out.println(e);
				}
		}

}
