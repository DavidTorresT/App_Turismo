package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Medios;

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

public class frmMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservaciones;
	private JTextField txtIdtipomedio;
	private JButton btnGuardar;
	Medios cr = new Medios();
	private JLabel lblNewLabel_1;
	private JTextField txtIdmedios;
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
					frmMedios frame = new frmMedios();
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
	public frmMedios() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 351);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(133, 188, 136));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion De Medios");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(127, 11, 158, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(91, 118, 63, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Observaciones:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(91, 164, 100, 23);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("ID Tipo De Medio:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(91, 208, 116, 23);
		contentPane.add(lblNewLabel_1_3);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(216, 121, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(216, 167, 86, 20);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);
		
		txtIdtipomedio = new JTextField();
		txtIdtipomedio.setBounds(217, 211, 86, 20);
		contentPane.add(txtIdtipomedio);
		txtIdtipomedio.setColumns(10);
		
		btnGuardar = new JButton("");
		btnGuardar.setToolTipText("Guardar");
		btnGuardar.setBorder(null);
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8666542_save_icon.png"));
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.create(txtNombre.getText(), txtObservaciones.getText(), Integer.parseInt(txtIdtipomedio.getText()));
				txtNombre.setText("");
				txtObservaciones.setText("");
				txtIdtipomedio.setText("");
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(91, 258, 46, 43);
		contentPane.add(btnGuardar);
		
		lblNewLabel_1 = new JLabel("ID Medio:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(91, 66, 73, 23);
		contentPane.add(lblNewLabel_1);
		
		txtIdmedios = new JTextField();
		txtIdmedios.setColumns(10);
		txtIdmedios.setBounds(174, 69, 86, 20);
		contentPane.add(txtIdmedios);
		
		btnDelete = new JButton("");
		btnDelete.setToolTipText("Eliminar");
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.setBorder(null);
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIdmedios.getText()));
				txtNombre.setText("");
				txtObservaciones.setText("");
				txtIdtipomedio.setText("");
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8664938_trash_can_delete_remove_icon.png"));
		btnDelete.setContentAreaFilled(false);
		btnDelete.setBounds(260, 258, 48, 46);
		contentPane.add(btnDelete);
		
		btnConsultar = new JButton("");
		btnConsultar.setToolTipText("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(txtIdmedios.getText()), txtNombre, txtObservaciones, txtIdtipomedio);
			}
		});
		btnConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\3844467_magnifier_search_zoom_icon.png"));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(147, 255, 45, 46);
		contentPane.add(btnConsultar);
		
		btnActualizar = new JButton("");
		btnActualizar.setToolTipText("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(Integer.parseInt(txtIdmedios.getText()), txtNombre.getText(), txtObservaciones.getText());
			}
		});
		btnActualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035962_sync_sharp_icon.png"));
		btnActualizar.setContentAreaFilled(false);
		btnActualizar.setBorder(null);
		btnActualizar.setBounds(202, 255, 48, 46);
		contentPane.add(btnActualizar);
		
		btnMenu = new JButton("");
		btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmPrincipal view = new frmPrincipal();
				view.show();
			}
		});
		btnMenu.setToolTipText("Menu");
		btnMenu.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035789_chevron_back_sharp_icon.png"));
		btnMenu.setContentAreaFilled(false);
		btnMenu.setBorder(null);
		btnMenu.setBounds(10, 11, 21, 21);
		contentPane.add(btnMenu);
	}

}
