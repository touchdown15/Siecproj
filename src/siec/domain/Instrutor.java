package siec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "instrutor")
public class Instrutor extends Pessoa {

	@Column(name = "endereco")
	private String endereco;
	
	@Column(name = "inss")
	private String inss;
	
	@Column(name = "pisPassep")
	private String pisPassep;
	
	@Column(name = "banco")
	private String banco;
	
	@Column(name = "conta")
	private String conta;
	
	@Column(name = "cim")
	private String cim;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getInss() {
		return inss;
	}

	public void setInss(String inss) {
		this.inss = inss;
	}

	public String getPisPassep() {
		return pisPassep;
	}

	public void setPisPassep(String pisPassep) {
		this.pisPassep = pisPassep;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}
	
}
