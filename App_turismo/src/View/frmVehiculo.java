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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion De Vehiculos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(77, 11, 171, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula:");
		lblNewLabel_1.setBounds(51, 67, 67, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Marca:");
		lblNewLabel_1_1.setBounds(215, 67, 67, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Puestos:");
		lblNewLabel_1_2.setBounds(51, 121, 67, 24);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Modelo:");
		lblNewLabel_1_2_1.setBounds(199, 121, 67, 24);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Numero De Motor:");
		lblNewLabel_1_2_2.setBounds(51, 174, 94, 24);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Categoria:");
		lblNewLabel_1_2_3.setBounds(199, 174, 67, 24);
		contentPane.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("ID Tipo De Transporte:");
		lblNewLabel_1_2_4.setBounds(51, 228, 110, 24);
		contentPane.add(lblNewLabel_1_2_4);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(51, 90, 86, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(199, 90, 86, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtPuestos = new JTextField();
		txtPuestos.setBounds(51, 143, 86, 20);
		contentPane.add(txtPuestos);
		txtPuestos.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(199, 143, 86, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtNumeromotor = new JTextField();
		txtNumeromotor.setBounds(51, 197, 86, 20);
		contentPane.add(txtNumeromotor);
		txtNumeromotor.setColumns(10);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(199, 197, 86, 20);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		txtIdtipo = new JTextField();
		txtIdtipo.setBounds(51, 250, 86, 20);
		contentPane.add(txtIdtipo);
		txtIdtipo.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vehiculos cr = new Vehiculos();
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
		btnGuardar.setBounds(125, 293, 94, 23);
		contentPane.add(btnGuardar);
	}

}
