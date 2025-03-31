package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencias;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParsePosition;
import java.awt.event.ActionEvent;

public class frmAgencias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtWeb;
	private JTextField txtIdcompania;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAgencias frame = new frmAgencias();
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
	public frmAgencias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion De Agencias");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(131, 11, 181, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombrel = new JLabel("Nombre:");
		lblNombrel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombrel.setBounds(58, 65, 81, 17);
		contentPane.add(lblNombrel);
		
		JLabel lblNewLabel_1 = new JLabel("Direccion:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(285, 65, 81, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(58, 116, 81, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Telefono:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(285, 116, 81, 19);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Web:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(58, 166, 81, 19);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("ID Compañia:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(285, 166, 86, 19);
		contentPane.add(lblNewLabel_2_3);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(58, 85, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(285, 85, 86, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(58, 135, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(285, 135, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtWeb = new JTextField();
		txtWeb.setBounds(58, 186, 86, 20);
		contentPane.add(txtWeb);
		txtWeb.setColumns(10);
		
		txtIdcompania = new JTextField();
		txtIdcompania.setBounds(285, 186, 86, 20);
		contentPane.add(txtIdcompania);
		txtIdcompania.setColumns(10);
		
		JButton btbGuardar = new JButton("Guardar");
		btbGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agencias cr = new Agencias();
				cr.create(txtNombre.getText(), txtDireccion.getText(), txtCorreo.getText(), txtTelefono.getText(), txtWeb.getText(), Integer.parseInt(txtIdcompania.getText()));
				txtNombre.setText("");
				txtDireccion.setText("");
				txtCorreo.setText("");
				txtTelefono.setText("");
				txtWeb.setText("");
				txtIdcompania.setText("");
			}
		});
		btbGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btbGuardar.setBounds(175, 227, 102, 23);
		contentPane.add(btbGuardar);
	}
}
