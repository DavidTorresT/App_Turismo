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
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private JLabel lblNewLabel_3;
	private JTextField txtIdoperador;
	private JButton btnDelete;
	Operadores cr = new Operadores();

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
		setBounds(100, 100, 382, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo De Documento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(35, 110, 122, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumeroDeDocumento = new JLabel("Numero De Documento:");
		lblNumeroDeDocumento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNumeroDeDocumento.setBounds(197, 110, 137, 21);
		contentPane.add(lblNumeroDeDocumento);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(35, 156, 68, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblApellidos.setBounds(197, 156, 68, 21);
		contentPane.add(lblApellidos);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDireccion.setBounds(35, 207, 68, 21);
		contentPane.add(lblDireccion);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCorreo.setBounds(197, 207, 68, 21);
		contentPane.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelefono.setBounds(35, 259, 68, 21);
		contentPane.add(lblTelefono);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMatricula.setBounds(197, 259, 68, 21);
		contentPane.add(lblMatricula);
		
		txtTipodocumento = new JTextField();
		txtTipodocumento.setBounds(35, 130, 86, 20);
		contentPane.add(txtTipodocumento);
		txtTipodocumento.setColumns(10);
		
		txtNumerodocumento = new JTextField();
		txtNumerodocumento.setBounds(197, 130, 86, 20);
		contentPane.add(txtNumerodocumento);
		txtNumerodocumento.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(35, 176, 86, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(197, 176, 86, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(35, 228, 86, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(197, 228, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(35, 281, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gestion De Operadores Turisticos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(35, 11, 279, 31);
		contentPane.add(lblNewLabel_1);
		
		cbMatricula = new JComboBox();
		cbMatricula.setModel(new DefaultComboBoxModel(new String[] {"ASFDS53", "BUS-245", "FJD-304", "HHY-341", "IMO-983", "JKF-G35", "PCK-678", "SUV-345", "TRK-567", "YTT-203"}));
		cbMatricula.setBounds(197, 280, 86, 22);
		contentPane.add(cbMatricula);
		
		btnGuardar = new JButton("");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8666542_save_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnGuardar.setBounds(148, 313, 51, 47);
		contentPane.add(btnGuardar);
		
		lblNewLabel_3 = new JLabel("ID Operador:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(71, 66, 81, 21);
		contentPane.add(lblNewLabel_3);
		
		txtIdoperador = new JTextField();
		txtIdoperador.setColumns(10);
		txtIdoperador.setBounds(162, 67, 86, 20);
		contentPane.add(txtIdoperador);
		
		btnDelete = new JButton("");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIdoperador.getText()));
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8664938_trash_can_delete_remove_icon.png"));
		btnDelete.setBounds(258, 53, 48, 46);
		contentPane.add(btnDelete);
		
		
	}

}
