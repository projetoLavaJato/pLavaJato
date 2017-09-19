package br.com.lavajato.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class conexao {
	
public static Connection getConexeao() throws Exception{
		
		Connection conn = null;
			
	String url_conection = "jdbc:mysql://localhost:3306/lavaJatoProjeto";
	String usuario = "root";
	String senha ="889626";
	
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
	return conn = DriverManager.getConnection(url_conection,usuario,senha);
		
	}
}
