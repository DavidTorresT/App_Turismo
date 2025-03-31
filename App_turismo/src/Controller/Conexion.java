package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
			
		public Connection conectarBD() {
			// Crear e inicializar un objeto de la clase connection
			Connection connection = null;
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_turismo", "root", "2556229");
				System.out.println("Connected Wiht the database sucessfully");
			} catch (SQLException e) {
				System.out.println("Error: "+ e.getMessage());
			}
			return connection; //retorna la conexion abierta con la BD
			
		}
		
	
	}


