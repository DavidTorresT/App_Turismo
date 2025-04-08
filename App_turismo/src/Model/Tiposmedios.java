package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Tiposmedios {
	
	public String nombre; 
	public String observaciones;
	

	public Tiposmedios(String nombre, String observaciones) {
		super();
		this.nombre = nombre;
		this.observaciones = observaciones;
	}
	
	
	public Tiposmedios() {
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



	Conexion conector = new Conexion();
	
	//Crear
	public void create(String nombre, String observaciones) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "INSERT INTO tbltiposmedios (nombre, observaciones) values (?, ?)";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			//Parametrizar los campos
			pst.setString(1, nombre);
			pst.setString(2, observaciones);
			//Ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	//Borrar
	public void delete(int idtipomedio) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "DELETE FROM tbltiposmedios  WHERE idtipomedio = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			//Parametrizar los campos
			pst.setInt(1, idtipomedio);
			
			//Confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtipomedio + "?");
			
			if (resp == JOptionPane.OK_OPTION) {
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " +idtipomedio+ " Eliminado");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//Consultar
	public void readOne(int idtipomedio, JTextField nombres, JTextField observacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "SELECT * FROM tbltiposmedios  WHERE idtipomedio = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			pst.setInt(1, idtipomedio);
			ResultSet rs = pst.executeQuery(); //Almacenamiento temporal
			
			while (rs.next()) {
				nombres.setText(rs.getString(2));
				observacion.setText(rs.getString(3));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//Actualizar
	public void update(int idtipomedio, String nombre, String observaciones) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "UPDATE tbltiposmedios SET nombre = ?, observaciones = ? WHERE idtipomedio = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar los campos
			pst.setString(1, nombre);
			pst.setString(2, observaciones);
			pst.setInt(3, idtipomedio);
			
			//Ejecutar la trx
			pst.executeUpdate();
			
			int  rs = JOptionPane.showConfirmDialog(null, "Desea actuailzar el registro" + idtipomedio + "?");
			
			if (rs == JOptionPane.OK_OPTION) {
				// Ejecuta la tx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro actualizado con exito.");
			} else {
				JOptionPane.showConfirmDialog(null, "Operacion cancelada.");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
