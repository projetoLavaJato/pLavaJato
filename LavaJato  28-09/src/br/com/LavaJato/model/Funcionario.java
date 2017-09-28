package br.com.LavaJato.model;

public class Funcionario {
	
	private long idFuncionario;
	private int tipo;
	private double salario;
	private String nome;
	private String endereco;
	private TelefoneFuncionario telefoneFuncionario;
	
	

	public Funcionario(long idFuncionario, int tipo, double salario, String nome, String endereco,
			TelefoneFuncionario telefoneFuncionario) {
		super();
		this.idFuncionario = idFuncionario;
		this.tipo = tipo;
		this.salario = salario;
		this.nome = nome;
		this.endereco = endereco;
		this.telefoneFuncionario = telefoneFuncionario;
	}


	public Funcionario(int tipo, double salario, String nome, String endereco, long idFuncionario ) {
		super();
		
		this.tipo = tipo;
		this.salario = salario;
		this.nome = nome;
		this.endereco = endereco;
		this.idFuncionario = idFuncionario;
	}


	public Funcionario(int tipo, double salario, String nome, String endereco) {
		super();
		this.tipo = tipo;
		this.salario = salario;
		this.nome = nome;
		this.endereco = endereco;
	}
	


	public Funcionario(long idFuncionario) {
		super();
		this.idFuncionario = idFuncionario;
	}


	public long getIdFuncionario() {
		return idFuncionario;
	}


	public void setIdFuncionario(long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	


	public TelefoneFuncionario getTelefoneFuncionario() {
		return telefoneFuncionario;
	}


	public void setTelefoneFuncionario(TelefoneFuncionario telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}


	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ","
				+ " tipo=" + tipo + ", salario=" + salario + ", nome="
				+ nome + ", endereco=" + endereco + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + (int) (idFuncionario ^ (idFuncionario >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tipo;
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
		Funcionario other = (Funcionario) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (idFuncionario != other.idFuncionario)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
	

}
