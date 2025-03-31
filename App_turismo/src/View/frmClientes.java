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
	private JButton btnNewButton;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de Documento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 83, 127, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Documento:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(246, 83, 72, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombres.setBounds(10, 114, 127, 20);
		contentPane.add(lblNombres);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(246, 114, 102, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblEps = new JLabel("EPS:");
		lblEps.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEps.setBounds(10, 145, 127, 20);
		contentPane.add(lblEps);
		
		JLabel lblAlergias = new JLabel("Alergias:");
		lblAlergias.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAlergias.setBounds(246, 145, 102, 20);
		contentPane.add(lblAlergias);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFechaDeNacimiento.setBounds(10, 176, 127, 20);
		contentPane.add(lblFechaDeNacimiento);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCorreo.setBounds(246, 176, 102, 20);
		contentPane.add(lblCorreo);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEstadoCivil.setBounds(10, 207, 127, 20);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefono.setBounds(246, 207, 102, 20);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDireccion.setBounds(10, 238, 127, 20);
		contentPane.add(lblDireccion);
		
		txtTipodocumento = new JTextField();
		txtTipodocumento.setBounds(136, 83, 86, 20);
		contentPane.add(txtTipodocumento);
		txtTipodocumento.setColumns(10);
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(328, 83, 86, 20);
		contentPane.add(txtDocumento);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(136, 114, 86, 20);
		contentPane.add(txtNombres);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(328, 114, 86, 20);
		contentPane.add(txtApellidos);
		
		txtEps = new JTextField();
		txtEps.setBounds(136, 145, 86, 20);
		contentPane.add(txtEps);
		txtEps.setColumns(10);
		
		txtAlergias = new JTextField();
		txtAlergias.setColumns(10);
		txtAlergias.setBounds(328, 145, 86, 20);
		contentPane.add(txtAlergias);
		
		txtFechanacimiento = new JTextField();
		txtFechanacimiento.setColumns(10);
		txtFechanacimiento.setBounds(136, 176, 86, 20);
		contentPane.add(txtFechanacimiento);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(328, 176, 86, 20);
		contentPane.add(txtCorreo);
		
		txtEstadocivil = new JTextField();
		txtEstadocivil.setColumns(10);
		txtEstadocivil.setBounds(136, 207, 86, 20);
		contentPane.add(txtEstadocivil);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(328, 207, 86, 20);
		contentPane.add(txtTelefono);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(136, 238, 86, 20);
		contentPane.add(txtDireccion);
		
		JLabel lblNewLabel_3 = new JLabel("Gestion De Clientes");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(111, 22, 208, 36);
		contentPane.add(lblNewLabel_3);
		
		btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes cr = new Clientes();
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(169, 298, 96, 23);
		contentPane.add(btnNewButton);
	}
}
