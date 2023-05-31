package com.ads.ava3.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "mysql";
	
	private static final String DATABASE_URL  = "jdbc:mysql://localhost:3306/ava3";
	
	public static Connection createConnectionToMySQL() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//cria conexão com o bd
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		//Recuperando a conexao se houver
		Connection con = createConnectionToMySQL();
		
		if(con!=null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
	}
}
