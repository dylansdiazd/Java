package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testeConexao {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		String usuario = "root";
		String senha = "pop9552pop!P";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}
}
