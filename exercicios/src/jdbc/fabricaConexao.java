package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class fabricaConexao {

 public static Connection getConexao() {
	 try {
	String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
	String usuario = "root";
	String senha = "pop9552pop!P";
	
	return DriverManager.getConnection(url, usuario, senha);
	 } catch(SQLException e) {
		 throw new RuntimeException(e);
		 
 }
}
}
