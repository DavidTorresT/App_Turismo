package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Agencias {
	
	public String nombre;
	public String direccon;
	public String correo;
	public String telefono;
	public String web;
	public int idcompania;
	
	
	public Agencias(String nombre, String direccon, String correo, String telefono, String web,
			int idcompania) {
		super();
		this.nombre = nombre;
		this.direccon = direccon;
		this.correo = correo;
		this.telefono = telefono;
		this.web = web;
		this.idcompania = idcompania;
	}
	

	public Agencias() {
		super();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccon() {
		return direccon;
	}


	public void setDireccon(String direccon) {
		this.direccon = direccon;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getWeb() {
		return web;
	}


	public void setWeb(String web) {
		this.web = web;
	}


	public int getIdcompania() {
		return idcompania;
	}


	public void setIdcompania(int idcompania) {
		this.idcompania = idcompania;
	}
	
	
    Conexion conector = new Conexion();
	
	public void create(String nombre, String direccion, String correo, String telefono, String web, int idcompania) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "INSERT INTO tblagencias (nombre, direccion, correo, telefono, web, idcompania) values (?, ?, ?, ?, ?, ?)";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			//Parametrizar los campos
			pst.setString(1, nombre);
			pst.setString(2, direccion);
			pst.setString(3, correo);
			pst.setString(4, telefono);
			pst.setString(5, web);
			pst.setInt(6, idcompania);
			//Ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		
	}

	public void delete(int idagencia) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "DELETE FROM tblagencias  WHERE idagencia = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			//Parametrizar los campos
			pst.setInt(1, idagencia);
			
			//Confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idagencia + "?");
			
			if (resp == JOptionPane.OK_OPTION) {
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idagencia + " Eliminado");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
