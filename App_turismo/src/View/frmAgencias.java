package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencias;

import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmAgencias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtWeb;
	private JTextField txtIdcompania;
	private JTextField txtIdagencia;
	Agencias cr = new Agencias();

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
		setBounds(100, 100, 450, 354);
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
		lblNombrel.setBounds(51, 119, 81, 17);
		contentPane.add(lblNombrel);
		
		JLabel lblNewLabel_1 = new JLabel("Direccion:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(278, 119, 81, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(51, 170, 81, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Telefono:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(278, 170, 81, 19);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Web:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(51, 220, 81, 19);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("ID Compañia:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(278, 220, 86, 19);
		contentPane.add(lblNewLabel_2_3);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(51, 139, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(278, 139, 86, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(51, 189, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(278, 189, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtWeb = new JTextField();
		txtWeb.setBounds(51, 240, 86, 20);
		contentPane.add(txtWeb);
		txtWeb.setColumns(10);
		
		txtIdcompania = new JTextField();
		txtIdcompania.setBounds(278, 240, 86, 20);
		contentPane.add(txtIdcompania);
		txtIdcompania.setColumns(10);
		
		JButton btbGuardar = new JButton("");
		btbGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8666542_save_icon.png"));
		btbGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btbGuardar.setBounds(187, 258, 45, 46);
		contentPane.add(btbGuardar);
		
		JLabel lblIdAgencia = new JLabel("ID Agencia:");
		lblIdAgencia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdAgencia.setBounds(96, 64, 81, 17);
		contentPane.add(lblIdAgencia);
		
		txtIdagencia = new JTextField();
		txtIdagencia.setColumns(10);
		txtIdagencia.setBounds(187, 64, 86, 20);
		contentPane.add(txtIdagencia);
		
		JButton btnDelete = new JButton("");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIdagencia.getText()));
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8664938_trash_can_delete_remove_icon.png"));
		btnDelete.setBounds(278, 53, 48, 46);
		contentPane.add(btnDelete);
	}
}
