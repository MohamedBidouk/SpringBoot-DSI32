package com.mohamed.student.restcontroller;

import com.mohamed.student.service.*;
import com.mohamed.student.entities.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class employerRESTController {

	@Autowired
	EmployerService employerService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Employer> getAllEmployer(){
		return employerService.getAllEmployers();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Employer getEmployerById(@PathVariable("id") Long id) {
		return employerService.getEmployer(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Employer createEmployer(@RequestBody Employer employer) {
		return employerService.saveEmployer(employer);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Employer updateEmployer(@RequestBody Employer employer) {
		return employerService.updateEmployer(employer);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteEmployer(@PathVariable("id") Long id)
	{
		employerService.deleteEmployerById(id);
	}

	@RequestMapping(value="/empscat/{idCat}",method = RequestMethod.GET)
	public List<Employer> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
		return employerService.findByCategorieIdCat(idCat);
	}
	
	@RequestMapping(value="/empsByName/{name}",method = RequestMethod.GET)
	public List<Employer> findByNomProduitContains(@PathVariable("name") String name) {
	return employerService.FindEmployerByName(name);
	}

	
}