package com.mohamed.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mohamed.student.entities.*;

@RepositoryRestResource(path = "rest")
public interface EmployerRepository extends JpaRepository<Employer, Long> {

	
	List<Employer> findByNameEmployer(String name);
	List<Employer> findByNameEmployerContains(String name);
	
	@Query("select e from Employer e where e.nameEmployer like %?1 and e.salaryEmployer > ?2")
	List<Employer> findByNameSalary (String name, Double salary);
	
	/*@Query("select e from Employer e where e.nameEmployer like %?1 and e.salaryEmployer > ?2")
	List<Employer> findByNameSalary (@Param("name") String name,@Param("salary") Double salary);*/
	
	@Query("select e from Employer e where e.category = ?1")
	List<Employer> findByCategorie (Category category);
	
	List<Employer> findByCategoryIdCat(Long id);
	
	List<Employer> findByOrderByNameEmployerAsc();
	
	@Query("select e from Employer e order by e.nameEmployer ASC, e.salaryEmployer DESC")
	List<Employer> sortEmployersNameSalary ();


}
