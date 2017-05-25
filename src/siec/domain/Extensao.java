package siec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="extensao")
public class Extensao extends Curso {
	
	@Column(name = "codSigproj")
	private String codSigproj;
	
	@Column(name = "valorProf")
	private double valorProf;
	
	@Column(name = "valorEncargo")
	private double valorEncargo;
	
	@Column(name = "valorNti")
	private double valorNti;

	public String getCodSigproj() {
		return codSigproj;
	}

	public void setCodSigproj(String codSigproj) {
		this.codSigproj = codSigproj;
	}

	public double getValorProf() {
		return valorProf;
	}

	public void setValorProf(double valorProf) {
		this.valorProf = valorProf;
	}

	public double getValorEncargo() {
		return valorEncargo;
	}

	public void setValorEncargo(double valorEncargo) {
		this.valorEncargo = valorEncargo;
	}

	public double getValorNti() {
		return valorNti;
	}

	public void setValorNti(double valorNti) {
		this.valorNti = valorNti;
	}
	

}
