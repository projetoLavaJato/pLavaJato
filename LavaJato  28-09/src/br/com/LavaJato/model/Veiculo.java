package br.com.LavaJato.model;

public class Veiculo {
	
	private long idVeiculo;
	private String placa;
	private String marca;
	private String modelo;
	private long IdClienteVeiculo;
	
	
	public Veiculo(long idVeiculo, String placa, String marca, String modelo, long idClienteVeiculo) {
		super();
		this.idVeiculo = idVeiculo;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		IdClienteVeiculo = idClienteVeiculo;
	}

	public Veiculo(String placa, String marca, String modelo) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	

	public Veiculo(long idVeiculo) {
		super();
		this.idVeiculo = idVeiculo;
	}

	public Veiculo(String placa, String marca, String modelo, long idClienteVeiculo) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		IdClienteVeiculo = idClienteVeiculo;
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

	public long getIdClienteVeiculo() {
		return IdClienteVeiculo;
	}

	public void setIdClienteVeiculo(long idClienteVeiculo) {
		IdClienteVeiculo = idClienteVeiculo;
	}

	@Override
	public String toString() {
		return "Veiculo [idVeiculo=" + idVeiculo + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo
				+ ", IdClienteVeiculo=" + IdClienteVeiculo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (IdClienteVeiculo ^ (IdClienteVeiculo >>> 32));
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
		if (IdClienteVeiculo != other.IdClienteVeiculo)
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
