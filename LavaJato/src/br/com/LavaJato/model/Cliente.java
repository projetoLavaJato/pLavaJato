package br.com.LavaJato.model;

public class Cliente {
	
	private long idCliente;
	private String cpfCliente;
	private String nomeCliente;
	private String emailCliente;
	private String enderecoCliente;
	private TelefoneCliente telefoneCliente;
	
	
	public Cliente(){
		
	}
	
	public Cliente(long idCliente, String cpfCliente, String nomeCliente, String emailCliente, String enderecoCliente,
			TelefoneCliente telefoneCliente) {
		super();
		this.idCliente = idCliente;
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.enderecoCliente = enderecoCliente;
		this.telefoneCliente = telefoneCliente;
	}


	public Cliente(String cpfCliente, String nomeCliente, String emailCliente, String enderecoCliente) {
		super();
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.enderecoCliente = enderecoCliente;
	}
	

	public Cliente(String cpfCliente, String nomeCliente, String emailCliente, String enderecoCliente,long idCliente) {
		super();
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.enderecoCliente = enderecoCliente;
		this.idCliente = idCliente;
	}
	

	public Cliente(long idCliente) {
		super();
		this.idCliente = idCliente;
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


	public String getEnderecoCliente() {
		return enderecoCliente;
	}


	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}


	public TelefoneCliente getTelefoneCliente() {
		return telefoneCliente;
	}


	public void setTelefoneCliente(TelefoneCliente telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}


	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cpfCliente=" + cpfCliente + ", nomeCliente=" + nomeCliente
				+ ", emailCliente=" + emailCliente + ", enderecoCliente=" + enderecoCliente + ", telefoneCliente="
				+ telefoneCliente + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfCliente == null) ? 0 : cpfCliente.hashCode());
		result = prime * result + ((emailCliente == null) ? 0 : emailCliente.hashCode());
		result = prime * result + ((enderecoCliente == null) ? 0 : enderecoCliente.hashCode());
		result = prime * result + (int) (idCliente ^ (idCliente >>> 32));
		result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
		result = prime * result + ((telefoneCliente == null) ? 0 : telefoneCliente.hashCode());
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
		if (enderecoCliente == null) {
			if (other.enderecoCliente != null)
				return false;
		} else if (!enderecoCliente.equals(other.enderecoCliente))
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (nomeCliente == null) {
			if (other.nomeCliente != null)
				return false;
		} else if (!nomeCliente.equals(other.nomeCliente))
			return false;
		if (telefoneCliente == null) {
			if (other.telefoneCliente != null)
				return false;
		} else if (!telefoneCliente.equals(other.telefoneCliente))
			return false;
		return true;
	}
	
	
	
}
