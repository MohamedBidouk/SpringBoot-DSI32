package com.mohamed.student.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.hateoas.server.core.Relation;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Relation(collectionRelation = "categorys", itemRelation = "category")
@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCat;
	private String nameCat;
	private String descCat;
	
	@JsonIgnore
	@OneToMany(mappedBy = "category")
	private List<Employer> Employers;
	
	public Category(String nameCat, String descCat, List<Employer> Employers) {
			super();
			this.nameCat = nameCat;
			this.descCat = descCat;
			this.Employers = Employers;
		}
		
		public Long getIdCat() {
			return idCat;
		}
		public void setIdCat(Long idCat) {
			this.idCat = idCat;
		}
		public String getNameCat() {
			return nameCat;
		}
		public void setNameCat(String nameCat) {
			this.nameCat = nameCat;
		}
		public String getDescCat() {
			return descCat;
		}
		public void setDescCat(String descCat) {
			this.descCat = descCat;
		}
		public List<Employer> getEmployers() {
			return Employers;
		}
		public void setEmployers(List<Employer> employers) {
			Employers = employers;
		}
		
		
	
}
