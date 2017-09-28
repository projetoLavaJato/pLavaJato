package br.com.LavaJato.DAO;

import java.util.List;

import br.com.LavaJato.model.Cliente;
import br.com.LavaJato.model.TelefoneCliente;
import br.com.LavaJato.model.Veiculo;

public class teste {
	
	public static void main (String[] args) throws Exception{
		VeiculoDAO dao = new VeiculoDAO();
		//TelefoneClienteDAO dao = new TelefoneClienteDAO();
		//ClienteDAO dao = new ClienteDAO();
		
		
						//////// PARA INSERIR  //////////
		//Cliente cliente = new Cliente("-000-a---","-000-a---","---000----","---a00000----");
		
		//TelefoneCliente telefone = new TelefoneCliente(1,87975433);
		
		//Veiculo veiculo = new Veiculo("ABC-3456", "Goll","2.0 - 4portas",1);
		
		//cliente.setTelefoneCliente(telefone);
		//cliente.setVeiculo(veiculo);
		
		//dao.inserirCliente(cliente);		
		
						////////PARA ATUALIZAR  //////////
		//Cliente cliente = new Cliente("00000000","00000000000000","00000000000","000000000",3);
		//TelefoneCliente telefone = new TelefoneCliente(3,87975433);
		//cliente.setTelefoneCliente(telefone);
		//dao.atualizarCliente(cliente);
		
		
					/////////// PARA REMOVER  //////////
		//Cliente cliente = new Cliente(1);
		//TelefoneCliente telefone = new TelefoneCliente(1);
		//cliente.setTelefoneCliente(telefone);
		Veiculo v = new Veiculo(1);
		dao.removerVeiculo(v);
		
		
					///// PARA LISTAR /////
		//List<Cliente> cliente = dao.ListaTodos();
        //for (Cliente c : cliente){
        //System.out.println(c);
        //System.out.println("Listados com sucesso");
		
		System.out.println("---------removido com sucesso----------");
		
		}
	//}
}
