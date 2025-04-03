package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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

	public void delete(int idmedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "DELETE FROM tblmedios  WHERE idmedios = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			//Parametrizar los campos
			pst.setInt(1, idmedios);
			
			//Confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idmedios + "?");
			
			if (resp == JOptionPane.OK_OPTION) {
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idmedios + " Eliminado");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void readOne(int idmedios, JTextField nombre, JTextField observacion, JTextField idtipomedio) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "SELECT * FROM tblmedios  WHERE idmedios = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			pst.setInt(1, idmedios);
			ResultSet rs = pst.executeQuery(); //Almacenamiento temporal
			
			while (rs.next()) {
				nombre.setText(rs.getString(2));
				observacion.setText(rs.getString(3));
				idtipomedio.setText(rs.getString(4));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
