package siec.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "arquivo")
public class Arquivo {

	@Id
	@Column(name = "pasta")
	private String pasta;
	
	@Column(name = "entregue")
	private boolean entregue;
	
	@Column(name = "dataEntrega")
	private Date dataEntrega;
	
	@Column(name ="Recebimento")
	private String recebimento;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "arquivoTurma", referencedColumnName = "codTurma")
	private Turma turma;
	
}
