package br.com.lavajato.modelo;

public class TelefoneCliente {
	
	private Cliente cliente;
	private long telefoneCliente;
	
	
	
	public TelefoneCliente(Cliente cliente, long telefoneCliente) {
		super();
		this.cliente = cliente;
		this.telefoneCliente = telefoneCliente;
	}

	public TelefoneCliente(long telefoneCliente) {
		super();
		this.telefoneCliente = telefoneCliente;
	}

	
	@Override
	public String toString() {
		return "TelefoneCliente [cliente=" + cliente + ","
				+ " telefoneCliente=" + telefoneCliente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
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
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (telefoneCliente != other.telefoneCliente)
			return false;
		return true;
	}
	
	

}
