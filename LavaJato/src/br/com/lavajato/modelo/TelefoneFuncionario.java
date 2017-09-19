package br.com.lavajato.modelo;

public class TelefoneFuncionario {
	
	private Funcionario funcionario;
	private long telefoneFuncionario;
	
	
	public TelefoneFuncionario(Funcionario funcionario, long telefoneFuncionario) {
		super();
		this.funcionario = funcionario;
		this.telefoneFuncionario = telefoneFuncionario;
	}


	public TelefoneFuncionario(long telefoneFuncionario) {
		super();
		this.telefoneFuncionario = telefoneFuncionario;
	}


	@Override
	public String toString() {
		return "TelefoneFuncionario [funcionario=" + funcionario + ", telefoneFuncionario=" + telefoneFuncionario + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
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
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (telefoneFuncionario != other.telefoneFuncionario)
			return false;
		return true;
	}	
}
