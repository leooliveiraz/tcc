package entidades;

// Generated 17/10/2015 19:11:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AntenasId generated by hbm2java
 */
@Embeddable
public class AntenasId implements java.io.Serializable {

	private int cdAntena;
	private String cdIp;

	public AntenasId() {
	}

	public AntenasId(int cdAntena, String cdIp) {
		this.cdAntena = cdAntena;
		this.cdIp = cdIp;
	}

	@Column(name = "cd_antena", nullable = false)
	public int getCdAntena() {
		return this.cdAntena;
	}

	public void setCdAntena(int cdAntena) {
		this.cdAntena = cdAntena;
	}

	@Column(name = "cd_ip", nullable = false, length = 18)
	public String getCdIp() {
		return this.cdIp;
	}

	public void setCdIp(String cdIp) {
		this.cdIp = cdIp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AntenasId))
			return false;
		AntenasId castOther = (AntenasId) other;

		return (this.getCdAntena() == castOther.getCdAntena())
				&& ((this.getCdIp() == castOther.getCdIp()) || (this.getCdIp() != null
						&& castOther.getCdIp() != null && this.getCdIp()
						.equals(castOther.getCdIp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCdAntena();
		result = 37 * result
				+ (getCdIp() == null ? 0 : this.getCdIp().hashCode());
		return result;
	}

}
