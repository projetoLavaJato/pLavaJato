package br.com.LavaJato.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.LavaJato.model.Cliente;
import br.com.LavaJato.model.Veiculo;
import br.com.LavaJato.util.conexao;

public class VeiculoDAO {
	
	public void inserirVeiculo(Veiculo veiculo) throws Exception{
		
		Connection conn = null;
		PreparedStatement pstm = null;
		conn = conexao.getConexeao();
		
		String inserirVeiculo = "insert into Veiculo(placa, marca, modelo, idCliente)values(?, ?, ?, ?)";
		
		pstm = conn.prepareStatement(inserirVeiculo);
		
		pstm.setString(1, veiculo.getPlaca());
		pstm.setString(2, veiculo.getMarca());
		pstm.setString(3, veiculo.getModelo());
		pstm.setLong(4, veiculo.getIdClienteVeiculo());
		pstm.execute();
				
	}
	
	public void atualizarVeiculo(Veiculo veiculo) throws Exception{
		
		Connection conn = null;
		PreparedStatement stm = null;
		conn = conexao.getConexeao();
		
		String atualizarVeiculo = "update Veiculo set placa = ?, modelo = ?,"
				+ "modelo = ?, idCliente = ? where idVeiculo = ?";
		
		stm = conn.prepareCall(atualizarVeiculo);
		
		stm.setString(1, veiculo.getPlaca());
		stm.setString(2, veiculo.getMarca());
		stm.setString(3, veiculo.getModelo());
		stm.setLong(4, veiculo.getIdClienteVeiculo());

		stm.executeUpdate();
		
	}
	
	public void removerVeiculo (Veiculo veiculo) throws Exception{
		
		Connection conn = null;
		PreparedStatement stm = null;
		conn = conexao.getConexeao();
		
		String removerVeiculo = "delete from Veiculo where idVeiculo = ?";
		
		stm = conn.prepareCall(removerVeiculo);
		
		stm.setLong(1, veiculo.getIdVeiculo());
		stm.execute();
				
	}
	
	public List<Veiculo> ListaTodos() throws Exception {
		List<Veiculo> lista = new ArrayList<Veiculo>();
		
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null; // para a lista
		
		conn = conexao.getConexeao(); // conexao
		String listar = "SELECT * FROM Veiculo";
		
		stm = conn.prepareStatement(listar);
		rs = stm.executeQuery();// Query para a listagem no banco
		
		while(rs.next()){
				
			Veiculo v = new Veiculo(
								rs.getString("placa"),
								rs.getString("marca"),
								rs.getString("modelo"),
								rs.getLong("idCliente"));
								lista.add(v);
			}
		return lista;
	}

}
