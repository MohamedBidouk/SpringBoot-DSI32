package com.mohamed.student.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmployer;
	private String nameEmployer;
	private Double salaryEmployer;
	private Date dateRec;
	
	public Long getIdEmployer() {
		return idEmployer;
	}
	public void setIdEmployer(Long idEmployer) {
		this.idEmployer = idEmployer;
	}
	public String getNameEmployer() {
		return nameEmployer;
	}
	public void setNameEmployer(String nameEmployer) {
		this.nameEmployer = nameEmployer;
	}
	public Double getSalaryEmployer() {
		return salaryEmployer;
	}
	public void setSalaryEmployer(Double salaryEmployer) {
		this.salaryEmployer = salaryEmployer;
	}
	public Date getDateRec() {
		return dateRec;
	}
	public void setDateRec(Date dateRec) {
		this.dateRec = dateRec;
	}
	
	public Employer() {
		super();
	}
	
	public Employer(String nameEmployer, Double salaryEmployer, Date dateRec) {
		super();
		this.nameEmployer = nameEmployer;
		this.salaryEmployer = salaryEmployer;
		this.dateRec = dateRec;
	}
	
	@Override
	public String toString() {
		return "Employerloyer [idEmployer=" + idEmployer + ", nameEmployer=" + nameEmployer + ", salaryEmployer=" + salaryEmployer + ", dateRec=" + dateRec
				+ "]";
	}	
	
	@ManyToOne
	private Category category;
	
}