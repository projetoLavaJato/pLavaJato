package br.com.LavaJato.model;

public class TelefoneFuncionario {
	
	private long idfuncionario;
	private long telefoneFuncionario;
	
	
	public TelefoneFuncionario(long idfuncionario, long telefoneFuncionario) {
		super();
		this.idfuncionario = idfuncionario;
		this.telefoneFuncionario = telefoneFuncionario;
	}
	
	public TelefoneFuncionario(long telefoneFuncionario) {
		super();
		this.telefoneFuncionario = telefoneFuncionario;
	}
	
	
	public long getIdfuncionario() {
		return idfuncionario;
	}
	public void setIdfuncionario(long idfuncionario) {
		this.idfuncionario = idfuncionario;
	}
	public long getTelefoneFuncionario() {
		return telefoneFuncionario;
	}
	public void setTelefoneFuncionario(long telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}
	@Override
	public String toString() {
		return "TelefoneFuncionario [idfuncionario=" + idfuncionario + ", telefoneFuncionario=" + telefoneFuncionario
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idfuncionario ^ (idfuncionario >>> 32));
		result = prime * result + (int) (telefoneFuncionario ^ (telefoneFuncionario >>> 32));
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
		TelefoneFuncionario other = (TelefoneFuncionario) obj;
		if (idfuncionario != other.idfuncionario)
			return false;
		if (telefoneFuncionario != other.telefoneFuncionario)
			return false;
		return true;
	}
	
}
