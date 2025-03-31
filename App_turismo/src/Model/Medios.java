package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Medios {
	
	public String nombre;
	public String observaciones;
	public int idtipomedio;


	public Medios(String nombre, String observaciones, int idtipomedio) {
		super();
		this.nombre = nombre;
		this.observaciones = observaciones;
		this.idtipomedio = idtipomedio;
	}


	public Medios() {
		super();
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public int getIdtipomedio() {
		return idtipomedio;
	}


	public void setIdtipomedio(int idtipomedio) {
		this.idtipomedio = idtipomedio;
	}
	
    Conexion conector = new Conexion();
	
	public void create(String nombre, String observacion, int idtipomedio) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "INSERT INTO tblmedios (nombre, observacion, idtipomedio) values (?, ?, ?)";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			//Parametrizar los campos
			pst.setString(1, nombre);
			pst.setString(2, observacion);
			pst.setInt(3, idtipomedio);
			//Ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		
	}

}
