package br.com.lavajato.modelo;

import java.util.Date;

public class NotaServico {
	
	private long idNotaServico;
	private Date tempoInicial;
	private Date tempoFinal;
	private Date dataRealizacao;
	
	private Veiculo veiculo;
	private Funcionario funcionario;
	
	
	public NotaServico(long idNotaServico, Date tempoInicial, Date tempoFinal, Date dataRealizacao, Veiculo veiculo,
			Funcionario funcionario) {
		super();
		this.idNotaServico = idNotaServico;
		this.tempoInicial = tempoInicial;
		this.tempoFinal = tempoFinal;
		this.dataRealizacao = dataRealizacao;
		this.veiculo = veiculo;
		this.funcionario = funcionario;
	}


	public NotaServico(Date tempoInicial, Date tempoFinal, Date dataRealizacao) {
		super();
		this.tempoInicial = tempoInicial;
		this.tempoFinal = tempoFinal;
		this.dataRealizacao = dataRealizacao;
	}


	@Override
	public String toString() {
		return "NotaServico [idNotaServico=" + idNotaServico + ","
				+ " tempoInicial=" + tempoInicial + ", tempoFinal="
				+ tempoFinal + ", dataRealizacao=" + dataRealizacao + ","
				+ " veiculo=" + veiculo + ", funcionario="
				+ funcionario + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataRealizacao == null) ? 0 : dataRealizacao.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + (int) (idNotaServico ^ (idNotaServico >>> 32));
		result = prime * result + ((tempoFinal == null) ? 0 : tempoFinal.hashCode());
		result = prime * result + ((tempoInicial == null) ? 0 : tempoInicial.hashCode());
		result = prime * result + ((veiculo == null) ? 0 : veiculo.hashCode());
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
		NotaServico other = (NotaServico) obj;
		if (dataRealizacao == null) {
			if (other.dataRealizacao != null)
				return false;
		} else if (!dataRealizacao.equals(other.dataRealizacao))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (idNotaServico != other.idNotaServico)
			return false;
		if (tempoFinal == null) {
			if (other.tempoFinal != null)
				return false;
		} else if (!tempoFinal.equals(other.tempoFinal))
			return false;
		if (tempoInicial == null) {
			if (other.tempoInicial != null)
				return false;
		} else if (!tempoInicial.equals(other.tempoInicial))
			return false;
		if (veiculo == null) {
			if (other.veiculo != null)
				return false;
		} else if (!veiculo.equals(other.veiculo))
			return false;
		return true;
	}
}
