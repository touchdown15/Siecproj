package siec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Nti")
public class Nti extends Curso {

	@Column(name = "codNti")
	private int codNti;
	
	@Column(name = "areaSisp")
	private String areaSisp;

	public int getCodNti() {
		return codNti;
	}

	public void setCodNti(int codNti) {
		this.codNti = codNti;
	}

	public String getAreaSisp() {
		return areaSisp;
	}

	public void setAreaSisp(String areaSisp) {
		this.areaSisp = areaSisp;
	}
	
}
