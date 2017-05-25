package siec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codCurso")
	private int codCurso;
	
	@Column(name = "nomeCurso")
	private String nomeCurso;
	
	@Column(name = "valorCurso")
	private double valorCurso;
	
	@Column(name = "cargaCurso")
	private int cargaCurso;

	public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getValorCurso() {
		return valorCurso;
	}

	public void setValorCurso(double valorCurso) {
		this.valorCurso = valorCurso;
	}

	public int getCargaCurso() {
		return cargaCurso;
	}

	public void setCargaCurso(int cargaCurso) {
		this.cargaCurso = cargaCurso;
	}

}
