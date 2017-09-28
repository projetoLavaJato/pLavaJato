package br.com.LavaJato.model;

public class Veiculo {
	
	private long idVeiculo;
	private String placa;
	private String marca;
	private String modelo;
	private Cliente cliente;
	
	
	public Veiculo(long idVeiculo, String placa, String marca, String modelo, Cliente cliente) {
		super();
		this.idVeiculo = idVeiculo;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cliente = cliente;
	}


	public Veiculo(String placa, String marca, String modelo) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}


	public long getIdVeiculo() {
		return idVeiculo;
	}


	public void setIdVeiculo(long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Veiculo [idVeiculo=" + idVeiculo + ", placa=" + placa + ","
				+ " marca=" + marca + ", modelo=" + modelo
				+ ", cliente=" + cliente + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + (int) (idVeiculo ^ (idVeiculo >>> 32));
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
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
		Veiculo other = (Veiculo) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (idVeiculo != other.idVeiculo)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
}
