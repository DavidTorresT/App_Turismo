package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Compania;
import Model.Tiposmedios;

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

public class frmCompanias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRazonsocial;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtFechacreacion;
	private JTextField txtWeb;
	private JButton btnGuardar;
	private JLabel lblIdCompaia;
	private JTextField txtIdcompania;
	private JButton btnDelete;
	Compania cr = new Compania();
	private JButton btnConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCompanias frame = new frmCompanias();
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
	public frmCompanias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 361);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(133, 188, 136));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Razon Social:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(20, 158, 81, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Direccion:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(245, 161, 81, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(20, 186, 81, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Telefono:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(245, 191, 81, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Web:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(245, 220, 81, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Fecha De Creacion:");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_4.setBounds(20, 219, 119, 17);
		contentPane.add(lblNewLabel_2_4);
		
		txtRazonsocial = new JTextField();
		txtRazonsocial.setBounds(149, 161, 86, 20);
		contentPane.add(txtRazonsocial);
		txtRazonsocial.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(322, 161, 86, 20);
		contentPane.add(txtDireccion);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(149, 190, 86, 20);
		contentPane.add(txtCorreo);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(322, 190, 86, 20);
		contentPane.add(txtTelefono);
		
		txtFechacreacion = new JTextField();
		txtFechacreacion.setColumns(10);
		txtFechacreacion.setBounds(149, 219, 86, 20);
		contentPane.add(txtFechacreacion);
		
		txtWeb = new JTextField();
		txtWeb.setColumns(10);
		txtWeb.setBounds(322, 221, 86, 20);
		contentPane.add(txtWeb);
		
		JLabel lblNewLabel_3 = new JLabel("Gestion de Compañias");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(115, 25, 214, 38);
		contentPane.add(lblNewLabel_3);
		
		btnGuardar = new JButton("");
		btnGuardar.setBorder(null);
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8666542_save_icon.png"));
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.create(txtRazonsocial.getText(), txtDireccion.getText(), txtCorreo.getText(), txtTelefono.getText(), txtFechacreacion.getText(), txtWeb.getText());
				txtRazonsocial.setText("");
				txtDireccion.setText("");
				txtCorreo.setText("");
				txtTelefono.setText("");
				txtFechacreacion.setText("");
				txtWeb.setText("");
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(169, 273, 47, 38);
		contentPane.add(btnGuardar);
		
		lblIdCompaia = new JLabel("ID Compañia:");
		lblIdCompaia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdCompaia.setBounds(73, 99, 86, 17);
		contentPane.add(lblIdCompaia);
		
		txtIdcompania = new JTextField();
		txtIdcompania.setColumns(10);
		txtIdcompania.setBounds(169, 99, 86, 20);
		contentPane.add(txtIdcompania);
		
		btnDelete = new JButton("");
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setBorder(null);
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIdcompania.getText()));
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8664938_trash_can_delete_remove_icon.png"));
		btnDelete.setBounds(265, 84, 48, 46);
		btnDelete.setContentAreaFilled(false);
		contentPane.add(btnDelete);
		
		btnConsultar = new JButton("");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(txtIdcompania.getText()), txtRazonsocial, txtDireccion, txtCorreo, txtTelefono, txtFechacreacion, txtWeb);
			}
		});
		btnConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\3844467_magnifier_search_zoom_icon.png"));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(226, 265, 45, 46);
		contentPane.add(btnConsultar);
	}
}
