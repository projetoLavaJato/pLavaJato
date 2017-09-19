package br.com.lavajato.modelo;

public class tipoServicoNota {
	
	private TipoServico tipoServico;
	
	private NotaServico notaServico;
	
		
	public tipoServicoNota() {
		
	}

	public tipoServicoNota(TipoServico tipoServico, NotaServico notaServico) {
		super();
		this.tipoServico = tipoServico;
		this.notaServico = notaServico;
	}

	
	@Override
	public String toString() {
		return "tipoServicoNota [tipoServico=" + tipoServico + ","
				+ " notaServico=" + notaServico + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((notaServico == null) ? 0 : notaServico.hashCode());
		result = prime * result + ((tipoServico == null) ? 0 : tipoServico.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		tipoServicoNota other = (tipoServicoNota) obj;
		if (notaServico == null) {
			if (other.notaServico != null)
				return false;
		} else if (!notaServico.equals(other.notaServico))
			return false;
		if (tipoServico == null) {
			if (other.tipoServico != null)
				return false;
		} else if (!tipoServico.equals(other.tipoServico))
			return false;
		return true;
	}
}
