package entidades;

// Generated 17/10/2015 19:11:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AutorizacaoSaidaId generated by hbm2java
 */
@Embeddable
public class AutorizacaoSaidaId implements java.io.Serializable {

	private int cdAutorizacaoSaida;
	private String usuarioCdUsuario;

	public AutorizacaoSaidaId() {
	}

	public AutorizacaoSaidaId(int cdAutorizacaoSaida, String usuarioCdUsuario) {
		this.cdAutorizacaoSaida = cdAutorizacaoSaida;
		this.usuarioCdUsuario = usuarioCdUsuario;
	}

	@Column(name = "cd_autorizacao_saida", nullable = false)
	public int getCdAutorizacaoSaida() {
		return this.cdAutorizacaoSaida;
	}

	public void setCdAutorizacaoSaida(int cdAutorizacaoSaida) {
		this.cdAutorizacaoSaida = cdAutorizacaoSaida;
	}

	@Column(name = "usuario_cd_usuario", nullable = false, length = 20)
	public String getUsuarioCdUsuario() {
		return this.usuarioCdUsuario;
	}

	public void setUsuarioCdUsuario(String usuarioCdUsuario) {
		this.usuarioCdUsuario = usuarioCdUsuario;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AutorizacaoSaidaId))
			return false;
		AutorizacaoSaidaId castOther = (AutorizacaoSaidaId) other;

		return (this.getCdAutorizacaoSaida() == castOther
				.getCdAutorizacaoSaida())
				&& ((this.getUsuarioCdUsuario() == castOther
						.getUsuarioCdUsuario()) || (this.getUsuarioCdUsuario() != null
						&& castOther.getUsuarioCdUsuario() != null && this
						.getUsuarioCdUsuario().equals(
								castOther.getUsuarioCdUsuario())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCdAutorizacaoSaida();
		result = 37
				* result
				+ (getUsuarioCdUsuario() == null ? 0 : this
						.getUsuarioCdUsuario().hashCode());
		return result;
	}

}