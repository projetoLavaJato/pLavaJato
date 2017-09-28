package br.com.LavaJato.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.LavaJato.model.Funcionario;
import br.com.LavaJato.util.conexao;

public class FuncionarioDAO {
public void inserirFuncionario (Funcionario funcionario) throws Exception{
		
		TelefoneFuncionarioDAO telefone = new TelefoneFuncionarioDAO();
	
		Connection conn = null; // Chamando o obj Para conexao;
		PreparedStatement pstm = null; // Metodo que se comunica entre o banco e a linguagem java
		conn = conexao.getConexeao(); // conexao com o banco
		
		String inserirFuncionario = "insert into Funcionario(tipo, salario, nome, endereco)"
						+ "values (?, ?, ?, ?)"; // Scrip de banco
		
		pstm = conn.prepareStatement(inserirFuncionario); // retorna o script
		
		pstm.setInt(1, funcionario.getTipo());
		pstm.setDouble(2, funcionario.getSalario());
		pstm.setString(3, funcionario.getNome());
		pstm.setString(4, funcionario.getEndereco());
		pstm.execute(); // executa os gets e sets da entidade cliente
		
		telefone.inserirTelefoneFuncionario(funcionario.getTelefoneFuncionario());
	}
	
	public void atualizarFuncionario (Funcionario funcionario) throws Exception{
		
		TelefoneFuncionarioDAO telefone = new TelefoneFuncionarioDAO();
				
		Connection conn = null;
		PreparedStatement stm = null;
		conn = conexao.getConexeao(); 
		
		String atualizarFuncionario = "update Funcionario set tipo = ?, salario = ?,"
							+ "nome = ?, endereco = ? where idFuncionario = ?";
		
		stm = conn.prepareCall(atualizarFuncionario);
		
		stm.setInt(1, funcionario.getTipo());
		stm.setDouble(2, funcionario.getSalario());
		stm.setString(3, funcionario.getNome());
		stm.setString(4, funcionario.getEndereco());
		stm.setLong(5, funcionario.getIdFuncionario());
		stm.executeUpdate();
		
		telefone.inserirTelefoneFuncionario(funcionario.getTelefoneFuncionario());
			
	}
	public void removerFuncionario(Funcionario funcionario) throws Exception{
		
		TelefoneFuncionarioDAO telefone = new TelefoneFuncionarioDAO();
		
		Connection conn = null; 
		PreparedStatement stm = null; 
		conn = conexao.getConexeao(); 
		
		String removerFuncionario = "delete from Funcionario where idFuncionario = ?";
		
		stm = conn.prepareCall(removerFuncionario);
		
		stm.setLong(1, funcionario.getIdFuncionario());
		stm.execute();
		
		telefone.inserirTelefoneFuncionario(funcionario.getTelefoneFuncionario());

	}
	
	public List<Funcionario> ListaTodos() throws Exception {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null; // para a lista
		
		conn = conexao.getConexeao(); // conexao
		String listar = "SELECT * FROM Funcionario";
		
		stm = conn.prepareStatement(listar);
		rs = stm.executeQuery();// Query para a listagem no banco
		
		while(rs.next()){
				
			Funcionario f = new Funcionario(
								rs.getInt("tipo"),
								rs.getDouble("salario"),
								rs.getString("nome"),
								rs.getString("endereco"));
								lista.add(f);
			}
		return lista;
	}
}