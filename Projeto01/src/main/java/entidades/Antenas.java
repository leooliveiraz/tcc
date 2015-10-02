package entidades;

// Generated 01/09/2015 00:07:35 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Antenas generated by hbm2java
 */
@Entity
@Table(name = "antenas", catalog = "rfid_maternidade")
public class Antenas implements java.io.Serializable {

	private int cdAntena;
	private String dsAntena;
	private int setorCdSetor;

	public Antenas() {
	}

	public Antenas(int cdAntena, int setorCdSetor) {
		this.cdAntena = cdAntena;
		this.setorCdSetor = setorCdSetor;
	}

	public Antenas(int cdAntena, String dsAntena, int setorCdSetor) {
		this.cdAntena = cdAntena;
		this.dsAntena = dsAntena;
		this.setorCdSetor = setorCdSetor;
	}

	@Id
	@Column(name = "cd_antena", unique = true, nullable = false)
	public int getCdAntena() {
		return this.cdAntena;
	}

	public void setCdAntena(int cdAntena) {
		this.cdAntena = cdAntena;
	}

	@Column(name = "ds_antena", length = 50)
	public String getDsAntena() {
		return this.dsAntena;
	}

	public void setDsAntena(String dsAntena) {
		this.dsAntena = dsAntena;
	}

	@Column(name = "setor_cd_setor", nullable = false)
	public int getSetorCdSetor() {
		return this.setorCdSetor;
	}

	public void setSetorCdSetor(int setorCdSetor) {
		this.setorCdSetor = setorCdSetor;
	}

}
