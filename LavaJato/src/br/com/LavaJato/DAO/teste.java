package br.com.LavaJato.DAO;

import java.util.List;

import br.com.LavaJato.model.Cliente;
import br.com.LavaJato.model.TelefoneCliente;

public class teste {
	
	public static void main (String[] args) throws Exception{
		
		ClienteDAO dao = new ClienteDAO();
		
		
						//////// PARA INSERIR  //////////
		//Cliente cliente = new Cliente("00000000","00000000000000","00000000000","000000000");
		//TelefoneCliente telefone = new TelefoneCliente(3,87975433);
		//cliente.setTelefoneCliente(telefone);
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
		//dao.removerCliente(cliente);
		
		
					///// PARA LISTAR /////
		//List<Cliente> cliente = dao.ListaTodos();
        //for (Cliente c : cliente){
        //System.out.println(c);
        //System.out.println("Listados com sucesso");
		
		System.out.println("--------------------");
		
		}
	//}
}
