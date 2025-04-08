package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Vehiculos;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.Color;

public class frmVehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtMarca;
	private JTextField txtPuestos;
	private JTextField txtModelo;
	private JTextField txtNumeromotor;
	private JTextField txtCategoria;
	private JTextField txtIdtipo;
	Vehiculos cr = new Vehiculos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVehiculo frame = new frmVehiculo();
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
	public frmVehiculo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 381, 413);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(133, 188, 136));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion De Vehiculos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(77, 11, 171, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(52, 70, 67, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Marca:");
		lblNewLabel_1_1.setBounds(52, 122, 67, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Puestos:");
		lblNewLabel_1_2.setBounds(200, 122, 67, 24);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Modelo:");
		lblNewLabel_1_2_1.setBounds(52, 174, 67, 24);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Numero De Motor:");
		lblNewLabel_1_2_2.setBounds(200, 174, 115, 24);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Categoria:");
		lblNewLabel_1_2_3.setBounds(52, 227, 67, 24);
		contentPane.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("ID Tipo De Transporte:");
		lblNewLabel_1_2_4.setBounds(200, 227, 131, 24);
		contentPane.add(lblNewLabel_1_2_4);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(129, 72, 86, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(52, 143, 86, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtPuestos = new JTextField();
		txtPuestos.setBounds(200, 143, 86, 20);
		contentPane.add(txtPuestos);
		txtPuestos.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(52, 196, 86, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtNumeromotor = new JTextField();
		txtNumeromotor.setBounds(200, 196, 86, 20);
		contentPane.add(txtNumeromotor);
		txtNumeromotor.setColumns(10);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(52, 249, 86, 20);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		txtIdtipo = new JTextField();
		txtIdtipo.setBounds(200, 249, 86, 20);
		contentPane.add(txtIdtipo);
		txtIdtipo.setColumns(10);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setBorder(null);
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8666542_save_icon.png"));
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.create(txtMatricula.getText(), txtModelo.getText(), Integer.parseInt(txtPuestos.getText()), txtModelo.getText(), Integer.parseInt(txtNumeromotor.getText()), txtCategoria.getText(), Integer.parseInt(txtIdtipo.getText()));
				txtMatricula.setText("");
				txtMarca.setText("");
				txtPuestos.setText("");
				txtModelo.setText("");
				txtNumeromotor.setText("");
				txtCategoria.setText("");
				txtIdtipo.setText("");
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(64, 292, 48, 46);
		contentPane.add(btnGuardar);
		
		JButton btnDelete = new JButton("");
		btnDelete.setBorder(null);
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(txtMatricula.getText());
				txtMatricula.setText("");
				txtMarca.setText("");
				txtPuestos.setText("");
				txtModelo.setText("");
				txtNumeromotor.setText("");
				txtCategoria.setText("");
				txtIdtipo.setText("");
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8664938_trash_can_delete_remove_icon.png"));
		btnDelete.setContentAreaFilled(false);
		btnDelete.setBounds(235, 292, 48, 46);
		contentPane.add(btnDelete);
		
		JButton btnConsultar = new JButton("");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(txtMatricula.getText(), txtMarca, txtPuestos, txtModelo, txtNumeromotor, txtCategoria, txtIdtipo);
			}
		});
		btnConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\3844467_magnifier_search_zoom_icon.png"));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(122, 292, 45, 46);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(txtMatricula.getText(), txtMarca.getText(), Integer.parseInt(txtPuestos.getText()), txtModelo.getText(), Integer.parseInt(txtNumeromotor.getText()), txtCategoria.getText(), Integer.parseInt(txtIdtipo.getText()));
			}
		});
		btnActualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035962_sync_sharp_icon.png"));
		btnActualizar.setContentAreaFilled(false);
		btnActualizar.setBorder(null);
		btnActualizar.setBounds(177, 292, 48, 46);
		contentPane.add(btnActualizar);
	}
}
