package siec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ufpe")
public class Ufpe extends Curso {

	@Column(name = "codUfpe")
	private String codUfpe;
	
	@Column(name = "areaSisp")
	private String areaSisp;

	public String getCodUfpe() {
		return codUfpe;
	}

	public void setCodUfpe(String codUfpe) {
		this.codUfpe = codUfpe;
	}

	public String getAreaSisp() {
		return areaSisp;
	}

	public void setAreaSisp(String areaSisp) {
		this.areaSisp = areaSisp;
	}
	
	
}
