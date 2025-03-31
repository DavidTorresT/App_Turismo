package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Promotores {
	
	public int tipodocumento; 
	public int documento;
	public String nombres; 
	public String apellidos; 
	public String direccion; 
	public String correopersonal; 
	public String fechanacimiento;
	public String telefono;
	
	
	public Promotores(int tipodocumento, int documento, String nombres, String apellidos, String direccion,
			String correopersonal, String fechanacimiento, String telefono) {
		super();
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.correopersonal = correopersonal;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
	}


	public Promotores() {
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


	public String getCorreopersonal() {
		return correopersonal;
	}


	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}


	public String getFechanacimiento() {
		return fechanacimiento;
	}


	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	Conexion conector = new Conexion();
		
	public void create(int tipodocumento, int documento, String nombres, String apellidos, String direccion, String correopersonal, String fechanacimiento, String telefono) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
			
		String script = "INSERT INTO tblpromotores (tipodocumento, documento, nombres, apellidos, direccion, correopersonal, fechanacimiento, telefono) values (?, ?, ?, ?, ?, ?, ?, ?)";
			
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			//Parametrizar los campos
			pst.setInt(1,tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, direccion);
			pst.setString(6, correopersonal);
			pst.setString(7, fechanacimiento);
			pst.setString(8, telefono);
			//Ejecutar la trx
			pst.executeUpdate();
				
			JOptionPane.showConfirmDialog(null, "Registro con exito");
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
	}
	
}
