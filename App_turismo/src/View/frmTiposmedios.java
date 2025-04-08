package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Tiposmedios;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Color;
import javax.swing.SwingConstants;

public class frmTiposmedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservaciones;
	private JTextField txtIdtipomedio;
	Tiposmedios cr = new Tiposmedios();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTiposmedios frame = new frmTiposmedios();
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
	public frmTiposmedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 316);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(133, 188, 136));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(27, 110, 73, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblObservaciones.setBounds(27, 147, 94, 26);
		contentPane.add(lblObservaciones);
		
		JLabel lblNewLabel_1 = new JLabel("Gestion De Tipos de Medios");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(90, 11, 237, 26);
		contentPane.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(144, 115, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(144, 147, 170, 54);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setBorder(null);
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8666542_save_icon.png"));
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(txtNombre.getText(), txtObservaciones.getText());
				txtNombre.setText("");
				txtObservaciones.setText("");
				
			}
		});
		btnGuardar.setBounds(111, 220, 48, 46);
		contentPane.add(btnGuardar);
		
		JLabel lblIdTipoMedio = new JLabel("ID Tipo Medio:");
		lblIdTipoMedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdTipoMedio.setBounds(27, 68, 94, 26);
		contentPane.add(lblIdTipoMedio);
		
		txtIdtipomedio = new JTextField();
		txtIdtipomedio.setColumns(10);
		txtIdtipomedio.setBounds(144, 73, 86, 20);
		contentPane.add(txtIdtipomedio);
		
		JButton btnDelete = new JButton("");
		btnDelete.setBorder(null);
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIdtipomedio.getText()));
				txtNombre.setText("");
				txtObservaciones.setText("");
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8664938_trash_can_delete_remove_icon.png"));
		btnDelete.setBounds(279, 220, 48, 46);
		btnDelete.setContentAreaFilled(false);
		contentPane.add(btnDelete);
		
		JButton btnConsultar = new JButton("");
		btnConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultar.setBorder(null);
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\3844467_magnifier_search_zoom_icon.png"));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(txtIdtipomedio.getText()), txtNombre, txtObservaciones);
			}
		});
		btnConsultar.setBounds(169, 220, 42, 46);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(Integer.parseInt(txtIdtipomedio.getText()), txtNombre.getText(), txtObservaciones.getText());
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035962_sync_sharp_icon.png"));
		btnActualizar.setContentAreaFilled(false);
		btnActualizar.setBorder(null);
		btnActualizar.setBounds(221, 220, 48, 46);
		contentPane.add(btnActualizar);
	}
}
