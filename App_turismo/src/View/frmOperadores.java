package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Operadores;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class frmOperadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTipodocumento;
	private JTextField txtNumerodocumento;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JButton btnGuardar;
	private JComboBox cbMatricula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmOperadores frame = new frmOperadores();
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
	public frmOperadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo De Documento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(32, 53, 122, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumeroDeDocumento = new JLabel("Numero De Documento:");
		lblNumeroDeDocumento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNumeroDeDocumento.setBounds(194, 53, 137, 21);
		contentPane.add(lblNumeroDeDocumento);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(32, 99, 68, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblApellidos.setBounds(194, 99, 68, 21);
		contentPane.add(lblApellidos);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDireccion.setBounds(32, 150, 68, 21);
		contentPane.add(lblDireccion);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCorreo.setBounds(194, 150, 68, 21);
		contentPane.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelefono.setBounds(32, 202, 68, 21);
		contentPane.add(lblTelefono);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMatricula.setBounds(194, 202, 68, 21);
		contentPane.add(lblMatricula);
		
		txtTipodocumento = new JTextField();
		txtTipodocumento.setBounds(32, 73, 86, 20);
		contentPane.add(txtTipodocumento);
		txtTipodocumento.setColumns(10);
		
		txtNumerodocumento = new JTextField();
		txtNumerodocumento.setBounds(194, 73, 86, 20);
		contentPane.add(txtNumerodocumento);
		txtNumerodocumento.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(32, 119, 86, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(194, 119, 86, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(32, 171, 86, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(194, 171, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(32, 224, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gestion De Operadores Turisticos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(35, 11, 279, 31);
		contentPane.add(lblNewLabel_1);
		
		cbMatricula = new JComboBox();
		cbMatricula.setModel(new DefaultComboBoxModel(new String[] {"ASFDS53", "BUS-245", "FJD-304", "HHY-341", "IMO-983", "JKF-G35", "PCK-678", "SUV-345", "TRK-567", "YTT-203"}));
		cbMatricula.setBounds(194, 223, 86, 22);
		contentPane.add(cbMatricula);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operadores cr = new Operadores();
				String matricula = "" + cbMatricula.getSelectedItem();
				cr.create(Integer.parseInt(txtTipodocumento.getText()), Integer.parseInt(txtNumerodocumento.getText()), txtNombres.getText(), txtApellidos.getText(),
						txtDireccion.getText(), txtCorreo.getText(), txtTelefono.getText(), matricula);
				txtTipodocumento.setText("");
				txtNumerodocumento.setText("");
				txtNombres.setText("");
				txtApellidos.setText("");
				txtDireccion.setText("");
				txtCorreo.setText("");
				txtTelefono.setText("");
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(117, 280, 97, 23);
		contentPane.add(btnGuardar);
		
		
	}

}
