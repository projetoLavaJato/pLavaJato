package br.com.LavaJato.service;

import java.util.List;

import br.com.LavaJato.DAO.ClienteDAO;
import br.com.LavaJato.model.Cliente;

public class ClienteService {
	
	private ClienteDAO dao; //Criando um isntancia da class
	
	
	
	public ClienteService() { // add um contrutor para pegar os metodos da class DAO
		dao = new ClienteDAO();
	}

	public void salvar (Cliente cliente) throws Exception{
		
		if(cliente.getIdCliente() != 0){
			dao.atualizarCliente(cliente);
		}else{
			dao.inserirCliente(cliente);
		}	
	}
	public List<Cliente> getCliente() throws Exception{
		return dao.ListaTodos();
		
	}

}
