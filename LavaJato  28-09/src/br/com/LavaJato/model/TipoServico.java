package br.com.LavaJato.model;

public class TipoServico {
	
	private long idTipoServico;
	private double valor;
	private String nome;
	private String descricao;
	
	
	public TipoServico(long idTipoServico, double valor, String nome, String descricao) {
		super();
		this.idTipoServico = idTipoServico;
		this.valor = valor;
		this.nome = nome;
		this.descricao = descricao;
	}


	public TipoServico(double valor, String nome, String descricao) {
		super();
		this.valor = valor;
		this.nome = nome;
		this.descricao = descricao;
	}


	public long getIdTipoServico() {
		return idTipoServico;
	}


	public void setIdTipoServico(long idTipoServico) {
		this.idTipoServico = idTipoServico;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "TipoServico [idTipoServico=" + idTipoServico + ","
				+ " valor=" + valor + ", "
				+ "nome=" + nome + ", descricao="
				+ descricao + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + (int) (idTipoServico ^ (idTipoServico >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		TipoServico other = (TipoServico) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idTipoServico != other.idTipoServico)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
}
