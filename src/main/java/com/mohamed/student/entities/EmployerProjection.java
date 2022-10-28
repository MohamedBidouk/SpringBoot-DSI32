package com.mohamed.student.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nameEmployer", types = { Employer.class })
public interface EmployerProjection {
	public String getNameEmployer();
}
