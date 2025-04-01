package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Operadores {
	
	public int tipodocumento; 
	public int documento;
	public String nombres;
	public String apellidos; 
	public String direccion; 
	public String correo; 
	public String telefono;
	public String matricula;
	
	
	public Operadores(int tipodocumento, int documento, String nombres, String apellidos, String direccion,
			String correo, String telefono, String matricula) {
		super();
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.matricula = matricula;
	}


	public Operadores() {
		super();
	}


	public int getTipodocumento() {
		return tipodocumento;
	}


	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}


	public int getDocumento() {
		return documento;
	}


	public void setDocumento(int documento) {
		this.documento = documento;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	Conexion conector = new Conexion();
		
	public void create(int tipodocumento, int documento, String nombres, String apellidos, String direccion, String correo, String telefono, String matricula) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
			
		String script = "INSERT INTO tbloperadores (tipodocumento, documento, nombres, apellidos, direccion, correo, telefono, matricula) values (?, ?, ?, ?, ?, ?, ?, ?)";
			
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			//Parametrizar los campos
			pst.setInt(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, direccion);
			pst.setString(6, correo);
			pst.setString(7, telefono);
			pst.setString(8, matricula);
			//Ejecutar la trx
			pst.executeUpdate();
				
			JOptionPane.showConfirmDialog(null, "Registro con exito");
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
	}

	public void delete(int idoperador) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "DELETE FROM tbloperadores  WHERE id = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			//Parametrizar los campos
			pst.setInt(1, idoperador);
			
			//Confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idoperador + "?");
			
			if (resp == JOptionPane.OK_OPTION) {
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idoperador + " Eliminado");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
