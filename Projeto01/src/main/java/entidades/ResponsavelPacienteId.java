package entidades;

// Generated 01/09/2015 00:07:35 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ResponsavelPacienteId generated by hbm2java
 */
@Embeddable
public class ResponsavelPacienteId implements java.io.Serializable {

	private int responsavelCdResponsavel;
	private int pacienteCdPaciente;

	public ResponsavelPacienteId() {
	}

	public ResponsavelPacienteId(int responsavelCdResponsavel,
			int pacienteCdPaciente) {
		this.responsavelCdResponsavel = responsavelCdResponsavel;
		this.pacienteCdPaciente = pacienteCdPaciente;
	}

	@Column(name = "responsavel_cd_responsavel", nullable = false)
	public int getResponsavelCdResponsavel() {
		return this.responsavelCdResponsavel;
	}

	public void setResponsavelCdResponsavel(int responsavelCdResponsavel) {
		this.responsavelCdResponsavel = responsavelCdResponsavel;
	}

	@Column(name = "paciente_cd_paciente", nullable = false)
	public int getPacienteCdPaciente() {
		return this.pacienteCdPaciente;
	}

	public void setPacienteCdPaciente(int pacienteCdPaciente) {
		this.pacienteCdPaciente = pacienteCdPaciente;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ResponsavelPacienteId))
			return false;
		ResponsavelPacienteId castOther = (ResponsavelPacienteId) other;

		return (this.getResponsavelCdResponsavel() == castOther
				.getResponsavelCdResponsavel())
				&& (this.getPacienteCdPaciente() == castOther
						.getPacienteCdPaciente());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getResponsavelCdResponsavel();
		result = 37 * result + this.getPacienteCdPaciente();
		return result;
	}

}