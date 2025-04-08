package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Paquetes {

	public int iddestino;
	public int idorigen;
	public String fechaVenta;
	public String horaVenta;
	public String horaSalida;
	public String fechaEjecucion;
	public String observacion;
	public int idpromotor;
	public int idmedios;
	public int idcliente;
	public int idagencia;
	public String matricula;
	public String precios;

	public Paquetes(int iddestino, int idorigen, String fechaVenta, String horaVenta, String horaSalida,
			String fechaEjecucion, String observacion, int idpromotor, int idmedios, int idcliente, int idagencia,
			String matricula, String precios) {
		super();
		this.iddestino = iddestino;
		this.idorigen = idorigen;
		this.fechaVenta = fechaVenta;
		this.horaVenta = horaVenta;
		this.horaSalida = horaSalida;
		this.fechaEjecucion = fechaEjecucion;
		this.observacion = observacion;
		this.idpromotor = idpromotor;
		this.idmedios = idmedios;
		this.idcliente = idcliente;
		this.idagencia = idagencia;
		this.matricula = matricula;
		this.precios = precios;
	}

	public Paquetes() {
		super();
	}

	public int getIddestino() {
		return iddestino;
	}

	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}

	public int getIdorigen() {
		return idorigen;
	}

	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getHoraVenta() {
		return horaVenta;
	}

	public void setHoraVenta(String horaVenta) {
		this.horaVenta = horaVenta;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getFechaEjecucion() {
		return fechaEjecucion;
	}

	public void setFechaEjecucion(String fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getIdpromotor() {
		return idpromotor;
	}

	public void setIdpromotor(int idpromotor) {
		this.idpromotor = idpromotor;
	}

	public int getIdmedios() {
		return idmedios;
	}

	public void setIdmedios(int idmedios) {
		this.idmedios = idmedios;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public int getIdagencia() {
		return idagencia;
	}

	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getPrecios() {
		return precios;
	}

	public void setPrecios(String precios) {
		this.precios = precios;
	}

	Conexion conector = new Conexion();

	// Crear
	public void create(int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
			String fechaejecucion, String observacion, int idpromotor, int idmedio, int idcliente, int idagencia,
			String matricula, String precio) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "INSERT INTO tblpaquetes (iddestino, idorigen, fechaventa, horaventa, horasalida, fechaejecucion, observacion, idpromotor, idmedios, idcliente, idagencia, matricula, precios) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); // Abrir el buffer
			// Parametrizar los campos
			pst.setInt(1, iddestino);
			pst.setInt(2, idorigen);
			pst.setString(3, fechaventa);
			pst.setString(4, horaventa);
			pst.setString(5, horasalida);
			pst.setString(6, fechaejecucion);
			pst.setString(7, observacion);
			pst.setInt(8, idpromotor);
			pst.setInt(9, idmedio);
			pst.setInt(10, idcliente);
			pst.setInt(11, idagencia);
			pst.setString(12, matricula);
			pst.setString(13, precio);
			// Ejecutar la trx
			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Borrar
	public void delete(int codigo) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "DELETE FROM tblpaquetes  WHERE codigo = ?";

		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); // Abrir el buffer
			// Parametrizar los campos
			pst.setInt(1, codigo);

			// Confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + codigo + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + codigo + " Eliminado");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Consultar
	public void readOne(int codigo, JTextField iddestino, JTextField idorigen, JTextField fechaventa,
			JTextField horaventa, JTextField horasalida, JTextField fechaejecucion, JTextField observacion,
			JTextField idpromotor, JTextField idmedios, JTextField idcliente, JTextField idagencia,
			JTextField matricula, JTextField precio) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "SELECT * FROM tblpaquetes  WHERE codigo = ?";

		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); // Abrir el buffer

			pst.setInt(1, codigo);
			ResultSet rs = pst.executeQuery(); // Almacenamiento temporal

			while (rs.next()) {
				iddestino.setText(rs.getString(2));
				idorigen.setText(rs.getString(3));
				fechaventa.setText(rs.getString(4));
				horaventa.setText(rs.getString(5));
				horasalida.setText(rs.getString(6));
				fechaejecucion.setText(rs.getString(7));
				observacion.setText(rs.getString(8));
				idpromotor.setText(rs.getString(9));
				idmedios.setText(rs.getString(10));
				idcliente.setText(rs.getString(11));
				idagencia.setText(rs.getString(12));
				matricula.setText(rs.getString(13));
				precio.setText(rs.getString(14));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Actualizar
	public void update(int codigo, int iddestino, int idorigen, String fechaventa, String horaventa,
			String horasalida, String fechaejecucion, String observacion, int idpromotor, int idmedio, int idcliente, int idagencia, String matricula, String precio) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "UPDATE tblpaquetes SET iddestino = ?, idorigen = ?, fechaventa = ?, horaventa = ?, horasalida = ?, fechaejecucion = ?, observacion = ?, idpromotor = ?, idmedios = ?, idcliente = ?, idagencia = ?, matricula = ?, precios = ? WHERE codigo = ?";

		try {
			dbConnection = conector.conectarBD(); // Abrir la conexion
			pst = dbConnection.prepareStatement(script); // Abrir el buffer

			// Parametrizar los campos
			pst.setInt(1, iddestino);
			pst.setInt(2, idorigen);
			pst.setString(3, fechaventa);
			pst.setString(4, horaventa);
			pst.setString(5, horasalida);
			pst.setString(6, fechaejecucion);
			pst.setString(7, observacion);
			pst.setInt(8, idpromotor);
			pst.setInt(9, idmedio);
			pst.setInt(10, idcliente);
			pst.setInt(11, idagencia);
			pst.setString(12, matricula);
			pst.setString(13, precio);
			pst.setInt(14, codigo);

			// Ejecutar la trx
			pst.executeUpdate();

			int rs = JOptionPane.showConfirmDialog(null, "Desea actuailzar el registro" + codigo + "?");

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
