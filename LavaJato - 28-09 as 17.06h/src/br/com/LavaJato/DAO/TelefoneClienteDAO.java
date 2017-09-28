package br.com.LavaJato.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.LavaJato.model.Cliente;
import br.com.LavaJato.model.TelefoneCliente;
import br.com.LavaJato.util.conexao;

public class TelefoneClienteDAO {
	
public void inserirTelefoneCliente (TelefoneCliente telefonecliente) throws Exception{
	
		
		
		Connection conn = null; // Chamando o obj Para conexao;
		PreparedStatement pstm = null; // Metodo que se comunica entre o banco e a linguagem java
		conn = conexao.getConexeao(); // conexao com o banco
		
		String inserirTelefoneCliente = "insert into TelefoneCliente(idCliente,telefoneCliente)"
						+ "values (?,?)"; // Scrip de banco
		
		pstm = conn.prepareStatement(inserirTelefoneCliente); // retorna o script
		
		
		pstm.setLong(1, telefonecliente.getIdCliente());
		pstm.setLong(2, telefonecliente.getTelefoneCliente());
		pstm.execute();
	}

	public void atualizarTelefoneCliente(TelefoneCliente telefoneCliente) throws Exception{
	
		Connection conn = null; // Chamando o obj Para conexao;
		PreparedStatement stm = null; // Metodo que se comunica entre o banco e a linguagem java
		conn = conexao.getConexeao(); // conexao com o banco
		
		String atualizar = "update TelefoneCliente set telefoneCliente = ? where idCliente = ?";
		
		stm = conn.prepareCall(atualizar);
		
		stm.setLong(1, telefoneCliente.getTelefoneCliente());
		stm.setLong(2, telefoneCliente.getIdCliente());
		stm.executeUpdate();
	
	}

	public void removerTelefoneCliente(TelefoneCliente telefoneCliente) throws Exception{
			
		Connection conn = null; 
		PreparedStatement stm = null; 
		conn = conexao.getConexeao(); 
		
		String remover = "delete from TelefoneCliente where idCliente = ?";
		
		stm = conn.prepareCall(remover);
		
		stm.setLong(1, telefoneCliente.getIdCliente());
		stm.execute();
		
	}
	
}
