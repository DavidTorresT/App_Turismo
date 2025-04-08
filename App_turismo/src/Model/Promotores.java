package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;
import View.frmPrincipal;

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
	
	//Crear	
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
	
	//Borrar
	public void delete(int idpromotor) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "DELETE FROM tblpromotores  WHERE id = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			//Parametrizar los campos
			pst.setInt(1, idpromotor);
			
			//Confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idpromotor + "?");
			
			if (resp == JOptionPane.OK_OPTION) {
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idpromotor + " Eliminado");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//Consultar
	public void readOne(int idpromotor, JTextField tipodocumento, JTextField documento, JTextField nombres, JTextField apellidos, JTextField direccion, JTextField correo, JTextField fechanacimiento, JTextField telefono) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "SELECT * FROM tblpromotores  WHERE id = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			pst.setInt(1, idpromotor);
			ResultSet rs = pst.executeQuery(); //Almacenamiento temporal
			
			while (rs.next()) {
				tipodocumento.setText(rs.getString(2));
				documento.setText(rs.getString(3));
				nombres.setText(rs.getString(4));
				apellidos.setText(rs.getString(5));
				direccion.setText(rs.getString(6));
				correo.setText(rs.getString(7));
				fechanacimiento.setText(rs.getString(8));
				telefono.setText(rs.getString(9));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public void controlAcceso(int user, String pass) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "SELECT * FROM tblpromotores  WHERE documento = ? and contrasena = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			pst.setInt(1, user);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery(); //Almacenamiento temporal
			
			while (rs.next()) {
				frmPrincipal principal = new frmPrincipal();
				principal.show();
				//JOptionPane.showConfirmDialog(null, "Acceso permitido");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//Actualizar
	public void update(int idpromotor, String tipodocumento, int documento, String nombres, String apellidos, String direccion, String correo, String fechanacimiento, String telefono) {
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "UPDATE tblpromotores SET tipodocumento = ?, documento = ?, nombres = ?, apellidos = ?, direccion = ?, correopersonal = ?, fechanacimiento = ?, telefono = ? WHERE id = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); //Abrir el buffer
			
			//Parametrizar los campos
			pst.setString(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, direccion);
			pst.setString(6, correo);
			pst.setString(7, fechanacimiento);
			pst.setString(8, telefono);
			pst.setInt(9, idpromotor);
			
			//Ejecutar la trx
			pst.executeUpdate();
			
			int  rs = JOptionPane.showConfirmDialog(null, "Desea actuailzar el registro" + idpromotor + "?");
			
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
