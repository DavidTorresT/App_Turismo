package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Compania {
	
	public String razonsocial;
	public String direccion;
	public String correo;
	public String telefono;
	public String fechaCreacion;
	public String web;
	
	
	public Compania(String razonsocial, String direccion, String correo, String telefono,
			String fechaCreacion, String web) {
		super();
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.fechaCreacion = fechaCreacion;
		this.web = web;
	}


	public Compania() {
		super();
	}


	public String getRazonsocial() {
		return razonsocial;
	}


	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
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


	public String getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public String getWeb() {
		return web;
	}


	public void setWeb(String web) {
		this.web = web;
	}

    Conexion conector = new Conexion();
	
	public void create(String razonsocial, String direccion, String correo, String telefono, String fechacreacion, String web) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "INSERT INTO tblcompanias (razonsocial, direccion, correo, telefono,fechacreacion, web) values (?, ?, ?, ?, ?, ?)";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			//Parametrizar los campos
			pst.setString(1, razonsocial);
			pst.setString(2, direccion);
			pst.setString(3, correo);
			pst.setString(4, telefono);
			pst.setString(5, fechacreacion);
			pst.setString(6, web);
			//Ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
			
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		
	}
	
	public void delete(int idcompania) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "DELETE FROM tblcompanias  WHERE idcompania = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			//Parametrizar los campos
			pst.setInt(1, idcompania);
			
			//Confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idcompania + "?");
			
			if (resp == JOptionPane.OK_OPTION) {
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idcompania + " Eliminado");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
