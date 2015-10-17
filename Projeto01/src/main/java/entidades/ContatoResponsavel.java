package entidades;

// Generated 17/10/2015 19:11:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ContatoResponsavel generated by hbm2java
 */
@Entity
@Table(name = "contato_responsavel", catalog = "rfid_maternidade")
public class ContatoResponsavel implements java.io.Serializable {

	private Integer cdContatoResponsavel;
	private Responsavel responsavel;
	private TipoContato tipoContato;
	private String dsContato;
	private String nmContato;

	public ContatoResponsavel() {
	}

	public ContatoResponsavel(Responsavel responsavel, TipoContato tipoContato) {
		this.responsavel = responsavel;
		this.tipoContato = tipoContato;
	}

	public ContatoResponsavel(Responsavel responsavel, TipoContato tipoContato,
			String dsContato, String nmContato) {
		this.responsavel = responsavel;
		this.tipoContato = tipoContato;
		this.dsContato = dsContato;
		this.nmContato = nmContato;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cd_contato_responsavel", unique = true, nullable = false)
	public Integer getCdContatoResponsavel() {
		return this.cdContatoResponsavel;
	}

	public void setCdContatoResponsavel(Integer cdContatoResponsavel) {
		this.cdContatoResponsavel = cdContatoResponsavel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "responsavel_cd_responsavel", nullable = false)
	public Responsavel getResponsavel() {
		return this.responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_contato_cd_tipo_contato", nullable = false)
	public TipoContato getTipoContato() {
		return this.tipoContato;
	}

	public void setTipoContato(TipoContato tipoContato) {
		this.tipoContato = tipoContato;
	}

	@Column(name = "ds_contato", length = 100)
	public String getDsContato() {
		return this.dsContato;
	}

	public void setDsContato(String dsContato) {
		this.dsContato = dsContato;
	}

	@Column(name = "nm_contato", length = 45)
	public String getNmContato() {
		return this.nmContato;
	}

	public void setNmContato(String nmContato) {
		this.nmContato = nmContato;
	}

}