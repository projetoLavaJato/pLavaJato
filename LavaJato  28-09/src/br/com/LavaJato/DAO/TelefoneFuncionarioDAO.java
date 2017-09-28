package br.com.LavaJato.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.LavaJato.model.TelefoneFuncionario;
import br.com.LavaJato.util.conexao;

public class TelefoneFuncionarioDAO {
	
	public void inserirTelefoneFuncionario (TelefoneFuncionario telefoneFuncionario) throws Exception{
		
	Connection conn = null; // Chamando o obj Para conexao;
	PreparedStatement pstm = null; // Metodo que se comunica entre o banco e a linguagem java
	conn = conexao.getConexeao(); // conexao com o banco
	
	String inserirTelefoneFuncionario = "insert into TelefoneFuncionario(idFuncionario,telefoneFuncionario)"
					+ "values (?,?)"; // Scrip de banco
	
	pstm = conn.prepareStatement(inserirTelefoneFuncionario); // retorna o script
	
	
	pstm.setLong(1, telefoneFuncionario.getIdfuncionario());
	pstm.setLong(2, telefoneFuncionario.getTelefoneFuncionario());
	pstm.execute();
}

public void atualizarTelefoneCliente(TelefoneFuncionario telefoneFuncionario) throws Exception{

	Connection conn = null; // Chamando o obj Para conexao;
	PreparedStatement stm = null; // Metodo que se comunica entre o banco e a linguagem java
	conn = conexao.getConexeao(); // conexao com o banco
	
	String atualizar = "update TelefoneFuncionario set telefoneFuncionario = ? where idFuncionario = ?";
	
	stm = conn.prepareCall(atualizar);
	
	stm.setLong(1, telefoneFuncionario.getTelefoneFuncionario());
	stm.setLong(2, telefoneFuncionario.getIdfuncionario());
	stm.executeUpdate();

}

public void removerTelefoneCliente(TelefoneFuncionario telefoneFuncionario) throws Exception{
		
	Connection conn = null; 
	PreparedStatement stm = null; 
	conn = conexao.getConexeao(); 
	
	String remover = "delete from TelefoneCliente where idCliente = ?";
	
	stm = conn.prepareCall(remover);
	
	stm.setLong(1, telefoneFuncionario.getIdfuncionario());
	stm.execute();
	
	}
}
