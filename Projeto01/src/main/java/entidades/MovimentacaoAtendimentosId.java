package entidades;

// Generated 01/09/2015 00:07:35 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MovimentacaoAtendimentosId generated by hbm2java
 */
@Embeddable
public class MovimentacaoAtendimentosId implements java.io.Serializable {

	private int cdMovimentacao;
	private int antenasCdAntena;
	private int tagsCdTag;

	public MovimentacaoAtendimentosId() {
	}

	public MovimentacaoAtendimentosId(int cdMovimentacao, int antenasCdAntena,
			int tagsCdTag) {
		this.cdMovimentacao = cdMovimentacao;
		this.antenasCdAntena = antenasCdAntena;
		this.tagsCdTag = tagsCdTag;
	}

	@Column(name = "cd_movimentacao", nullable = false)
	public int getCdMovimentacao() {
		return this.cdMovimentacao;
	}

	public void setCdMovimentacao(int cdMovimentacao) {
		this.cdMovimentacao = cdMovimentacao;
	}

	@Column(name = "antenas_cd_antena", nullable = false)
	public int getAntenasCdAntena() {
		return this.antenasCdAntena;
	}

	public void setAntenasCdAntena(int antenasCdAntena) {
		this.antenasCdAntena = antenasCdAntena;
	}

	@Column(name = "tags_cd_tag", nullable = false)
	public int getTagsCdTag() {
		return this.tagsCdTag;
	}

	public void setTagsCdTag(int tagsCdTag) {
		this.tagsCdTag = tagsCdTag;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MovimentacaoAtendimentosId))
			return false;
		MovimentacaoAtendimentosId castOther = (MovimentacaoAtendimentosId) other;

		return (this.getCdMovimentacao() == castOther.getCdMovimentacao())
				&& (this.getAntenasCdAntena() == castOther.getAntenasCdAntena())
				&& (this.getTagsCdTag() == castOther.getTagsCdTag());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCdMovimentacao();
		result = 37 * result + this.getAntenasCdAntena();
		result = 37 * result + this.getTagsCdTag();
		return result;
	}

}
