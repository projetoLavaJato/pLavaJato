package br.com.LavaJato.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.LavaJato.model.Cliente;
import br.com.LavaJato.util.conexao;

public class ClienteDAO {
	
	public void inserirCliente (Cliente cliente) throws Exception{
		
		TelefoneClienteDAO telefone = new TelefoneClienteDAO();
		VeiculoDAO veiculo = new VeiculoDAO();
		
		Connection conn = null; // Chamando o obj Para conexao;
		PreparedStatement pstm = null; // Metodo que se comunica entre o banco e a linguagem java
		conn = conexao.getConexeao(); // conexao com o banco
		
		String inserirCliente = "insert into Cliente(cpfCliente, nomeCliente, emailCliente, enderecoCliente)"
						+ "values (?, ?, ?, ?)"; // Scrip de banco
		
		pstm = conn.prepareStatement(inserirCliente); // retorna o script
		
		pstm.setString(1, cliente.getCpfCliente());
		pstm.setString(2, cliente.getNomeCliente());
		pstm.setString(3, cliente.getEmailCliente());
		pstm.setString(4, cliente.getEnderecoCliente());
		pstm.execute(); // executa os gets e sets da entidade cliente
				
		telefone.inserirTelefoneCliente(cliente.getTelefoneCliente()); // Juntando os dados de DAOCLiente e DAOTelefoneo
		veiculo.inserirVeiculo(cliente.getVeiculo());
	}
	
	public void atualizarCliente (Cliente cliente) throws Exception{
		
		TelefoneClienteDAO telefone = new TelefoneClienteDAO();
		VeiculoDAO veiculo = new VeiculoDAO();

		Connection conn = null;
		PreparedStatement stm = null;
		conn = conexao.getConexeao(); 
		
		String atualizar = "update Cliente set cpfCliente = ?, nomeCliente = ?,"
							+ "emailCliente = ?, enderecoCliente = ? where idCliente = ?";
		
		stm = conn.prepareCall(atualizar);
		
		stm.setString(1, cliente.getCpfCliente());
		stm.setString(2, cliente.getNomeCliente());
		stm.setString(3, cliente.getEmailCliente());
		stm.setString(4, cliente.getEnderecoCliente());
		stm.setLong(5, cliente.getIdCliente());
		stm.executeUpdate();
		
		telefone.atualizarTelefoneCliente(cliente.getTelefoneCliente());
		veiculo.inserirVeiculo(cliente.getVeiculo());
		
	}
	public void removerCliente(Cliente cliente) throws Exception{
		
		TelefoneClienteDAO telefone = new TelefoneClienteDAO();
		VeiculoDAO veiculo = new VeiculoDAO();

		Connection conn = null; 
		PreparedStatement stm = null; 
		conn = conexao.getConexeao(); 
		
		String remover = "delete from Cliente where idCliente = ?";
		
		stm = conn.prepareCall(remover);
		
		stm.setLong(1, cliente.getIdCliente());
		stm.execute();
		
		telefone.removerTelefoneCliente(cliente.getTelefoneCliente());
		veiculo.inserirVeiculo(cliente.getVeiculo());

	}
	
	public List<Cliente> ListaTodos() throws Exception {
		List<Cliente> lista = new ArrayList<Cliente>();
		
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null; // para a lista
		
		conn = conexao.getConexeao(); // conexao
		String listar = "SELECT * FROM Cliente";
		
		stm = conn.prepareStatement(listar);
		rs = stm.executeQuery();// Query para a listagem no banco
		
		while(rs.next()){
				
		Cliente c = new Cliente(rs.getString("cpfCliente"),
								rs.getString("nomeCliente"),
								rs.getString("emailCliente"),
								rs.getString("enderecoCliente"));
								lista.add(c);
			}
		return lista;
	}
}
