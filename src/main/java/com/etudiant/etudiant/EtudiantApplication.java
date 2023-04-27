package com.etudiant.etudiant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class EtudiantApplication {

	public EtudiantApplication() throws SQLException {
	}

	public static void main(String[] args) {
		SpringApplication.run(EtudiantApplication.class, args);
	}

	String url = "jdbc:mysql://localhost:3308/warehouse";
	String username = "root";
	String password = "password";

	/*try {
		Connection con = DriverManager.getConnection(url,username,password);
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("Select * from etudiant");
	} catch (SQLException e) {
		e.printStackTrace();
	}*/
}
