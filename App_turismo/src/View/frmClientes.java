package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.Color;

public class frmClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTipodocumento;
	private JTextField txtDocumento;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtEps;
	private JTextField txtAlergias;
	private JTextField txtFechanacimiento;
	private JTextField txtCorreo;
	private JTextField txtEstadocivil;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JButton btnGuardar;
	Clientes cr = new Clientes();
	private JLabel lblIdCliente;
	private JTextField txtIdcliente;
	private JButton btnDelete;
	private JButton btnConsultar;
	private JButton btnActualizar;
	private JButton btnMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmClientes frame = new frmClientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmClientes() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 440, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(133, 188, 136));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de Documento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 140, 127, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Documento:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(246, 140, 72, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombres.setBounds(10, 171, 127, 20);
		contentPane.add(lblNombres);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(246, 171, 102, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblEps = new JLabel("EPS:");
		lblEps.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEps.setBounds(10, 202, 127, 20);
		contentPane.add(lblEps);
		
		JLabel lblAlergias = new JLabel("Alergias:");
		lblAlergias.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAlergias.setBounds(246, 202, 102, 20);
		contentPane.add(lblAlergias);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFechaDeNacimiento.setBounds(10, 233, 127, 20);
		contentPane.add(lblFechaDeNacimiento);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCorreo.setBounds(246, 233, 102, 20);
		contentPane.add(lblCorreo);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEstadoCivil.setBounds(10, 264, 127, 20);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefono.setBounds(246, 264, 102, 20);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDireccion.setBounds(10, 295, 127, 20);
		contentPane.add(lblDireccion);
		
		txtTipodocumento = new JTextField();
		txtTipodocumento.setBounds(136, 140, 86, 20);
		contentPane.add(txtTipodocumento);
		txtTipodocumento.setColumns(10);
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(328, 140, 86, 20);
		contentPane.add(txtDocumento);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(136, 171, 86, 20);
		contentPane.add(txtNombres);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(328, 171, 86, 20);
		contentPane.add(txtApellidos);
		
		txtEps = new JTextField();
		txtEps.setBounds(136, 202, 86, 20);
		contentPane.add(txtEps);
		txtEps.setColumns(10);
		
		txtAlergias = new JTextField();
		txtAlergias.setColumns(10);
		txtAlergias.setBounds(328, 202, 86, 20);
		contentPane.add(txtAlergias);
		
		txtFechanacimiento = new JTextField();
		txtFechanacimiento.setColumns(10);
		txtFechanacimiento.setBounds(136, 233, 86, 20);
		contentPane.add(txtFechanacimiento);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(328, 233, 86, 20);
		contentPane.add(txtCorreo);
		
		txtEstadocivil = new JTextField();
		txtEstadocivil.setColumns(10);
		txtEstadocivil.setBounds(136, 264, 86, 20);
		contentPane.add(txtEstadocivil);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(328, 264, 86, 20);
		contentPane.add(txtTelefono);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(136, 295, 86, 20);
		contentPane.add(txtDireccion);
		
		JLabel lblNewLabel_3 = new JLabel("Gestion De Clientes");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(111, 22, 208, 36);
		contentPane.add(lblNewLabel_3);
		
		btnGuardar = new JButton("");
		btnGuardar.setToolTipText("Guardar");
		btnGuardar.setBorder(null);
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8666542_save_icon.png"));
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.create(Integer.parseInt(txtTipodocumento.getText()), Integer.parseInt(txtDocumento.getText()), txtNombres.getText(), txtApellidos.getText(), txtEps.getText(),
						txtAlergias.getText(), txtFechanacimiento.getText(), txtCorreo.getText(), txtEstadocivil.getText(), txtTelefono.getText(), txtDireccion.getText());
				txtTipodocumento.setText("");
				txtDocumento.setText("");
				txtNombres.setText("");
				txtApellidos.setText("");
				txtEps.setText("");
				txtAlergias.setText("");
				txtFechanacimiento.setText("");
				txtCorreo.setText("");
				txtEstadocivil.setText("");
				txtTelefono.setText("");
				txtDireccion.setText("");
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(90, 334, 46, 46);
		contentPane.add(btnGuardar);
		
		lblIdCliente = new JLabel("ID Cliente:");
		lblIdCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdCliente.setBounds(74, 81, 102, 20);
		contentPane.add(lblIdCliente);
		
		txtIdcliente = new JTextField();
		txtIdcliente.setColumns(10);
		txtIdcliente.setBounds(150, 82, 86, 20);
		contentPane.add(txtIdcliente);
		
		btnDelete = new JButton("");
		btnDelete.setToolTipText("Eliminar");
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setBorder(null);
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIdcliente.getText()));
				txtTipodocumento.setText("");
				txtDocumento.setText("");
				txtNombres.setText("");
				txtApellidos.setText("");
				txtEps.setText("");
				txtAlergias.setText("");
				txtFechanacimiento.setText("");
				txtCorreo.setText("");
				txtEstadocivil.setText("");
				txtTelefono.setText("");
				txtDireccion.setText("");
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8664938_trash_can_delete_remove_icon.png"));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setContentAreaFilled(false);
		btnDelete.setBounds(259, 329, 52, 51);
		contentPane.add(btnDelete);
		
		btnConsultar = new JButton("");
		btnConsultar.setToolTipText("Consultar");
		btnConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(txtIdcliente.getText()), txtTipodocumento, txtDocumento, txtNombres, txtApellidos, txtEps, txtAlergias, txtFechanacimiento, txtCorreo, txtEstadocivil, txtTelefono, txtDireccion);
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\3844467_magnifier_search_zoom_icon.png"));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(146, 334, 45, 46);
		contentPane.add(btnConsultar);
		
		btnActualizar = new JButton("");
		btnActualizar.setToolTipText("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(Integer.parseInt(txtIdcliente.getText()), txtTipodocumento.getText(), Integer.parseInt(txtDocumento.getText()), txtNombres.getText(), txtApellidos.getText(), txtEps.getText(), txtAlergias.getText(), txtFechanacimiento.getText(), txtCorreo.getText(), txtEstadocivil.getText(), txtTelefono.getText(), txtDireccion.getText());
			}
		});
		btnActualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035962_sync_sharp_icon.png"));
		btnActualizar.setContentAreaFilled(false);
		btnActualizar.setBorder(null);
		btnActualizar.setBounds(201, 334, 48, 46);
		contentPane.add(btnActualizar);
		
		btnMenu = new JButton("");
		btnMenu.setToolTipText("Menu");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmPrincipal view = new frmPrincipal();
				view.show();
			}
		});
		btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035789_chevron_back_sharp_icon.png"));
		btnMenu.setContentAreaFilled(false);
		btnMenu.setBorder(null);
		btnMenu.setBounds(10, 22, 21, 21);
		contentPane.add(btnMenu);
	}
}
