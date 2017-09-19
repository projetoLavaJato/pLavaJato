package br.com.lavajato.modelo;

public class Cliente {
	
	private long idCliente;
	private String cpfCliente;
	private String nomeCliente;
	private String emailCliente;
	

	public Cliente(long idCliente, String cpfCliente, String nomeCliente, String emailCliente) {
		super();
		this.idCliente = idCliente;
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
	}
	
	public Cliente(String cpfCliente, String nomeCliente, String emailCliente) {
		super();
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
	}
	
	
	
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ","
				+ " cpfCliente=" + cpfCliente + ","
				+ " nomeCliente=" + nomeCliente
				+ ", emailCliente=" + emailCliente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfCliente == null) ? 0 : cpfCliente.hashCode());
		result = prime * result + ((emailCliente == null) ? 0 : emailCliente.hashCode());
		result = prime * result + (int) (idCliente ^ (idCliente >>> 32));
		result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (cpfCliente == null) {
			if (other.cpfCliente != null)
				return false;
		} else if (!cpfCliente.equals(other.cpfCliente))
			return false;
		if (emailCliente == null) {
			if (other.emailCliente != null)
				return false;
		} else if (!emailCliente.equals(other.emailCliente))
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (nomeCliente == null) {
			if (other.nomeCliente != null)
				return false;
		} else if (!nomeCliente.equals(other.nomeCliente))
			return false;
		return true;
	}
}
