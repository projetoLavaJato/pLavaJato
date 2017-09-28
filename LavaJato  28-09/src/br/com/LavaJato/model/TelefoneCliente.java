package br.com.LavaJato.model;

public class TelefoneCliente {
	
	private long IdCliente ;
	private long telefoneCliente;
	
	public TelefoneCliente(long idCliente, long telefoneCliente) {
		super();
		IdCliente = idCliente;
		this.telefoneCliente = telefoneCliente;
	}
	
	public TelefoneCliente(long idCliente) {
		super();
		IdCliente = idCliente;
		
	}

	public long getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(long idCliente) {
		IdCliente = idCliente;
	}

	public long getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(long telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	@Override
	public String toString() {
		return "TelefoneCliente [IdCliente=" + IdCliente + ", telefoneCliente=" + telefoneCliente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (IdCliente ^ (IdCliente >>> 32));
		result = prime * result + (int) (telefoneCliente ^ (telefoneCliente >>> 32));
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
		TelefoneCliente other = (TelefoneCliente) obj;
		if (IdCliente != other.IdCliente)
			return false;
		if (telefoneCliente != other.telefoneCliente)
			return false;
		return true;
	}
	
	
}
