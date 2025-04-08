package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Tipostransporte;

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

public class frmTipostransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JButton btnGuardar;
	private JLabel lblIdTipoDe;
	private JTextField txtIdtipo;
	private JButton btnDelete;
	Tipostransporte cr = new Tipostransporte();
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
					frmTipostransporte frame = new frmTipostransporte();
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
	public frmTipostransporte() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(new Color(133, 188, 136));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(60, 136, 66, 25);
		contentPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion:");
		lblObservacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblObservacion.setBounds(60, 169, 85, 25);
		contentPane.add(lblObservacion);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(155, 140, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtObservacion = new JTextField();
		txtObservacion.setToolTipText("");
		txtObservacion.setBounds(155, 171, 177, 60);
		contentPane.add(txtObservacion);
		txtObservacion.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipos De Transporte");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(119, 11, 182, 33);
		contentPane.add(lblNewLabel_1);
		
		btnGuardar = new JButton("");
		btnGuardar.setToolTipText("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(txtNombre.getText(), txtObservacion.getText());
				txtNombre.setText("");
				txtObservacion.setText("");
			}
		});
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setBorder(null);
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8666542_save_icon.png"));
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(113, 244, 48, 46);
		contentPane.add(btnGuardar);
		
		lblIdTipoDe = new JLabel("ID Tipo De Transporte:");
		lblIdTipoDe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdTipoDe.setBounds(20, 79, 165, 25);
		contentPane.add(lblIdTipoDe);
		
		txtIdtipo = new JTextField();
		txtIdtipo.setColumns(10);
		txtIdtipo.setBounds(193, 79, 89, 24);
		contentPane.add(txtIdtipo);
		
		btnDelete = new JButton("");
		btnDelete.setToolTipText("Eliminar");
		btnDelete.setBorder(null);
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIdtipo.getText()));
				txtNombre.setText("");
				txtObservacion.setText("");
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8664938_trash_can_delete_remove_icon.png"));
		btnDelete.setBounds(278, 244, 48, 46);
		btnDelete.setContentAreaFilled(false);
		contentPane.add(btnDelete);
		
		btnConsultar = new JButton("");
		btnConsultar.setToolTipText("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(txtIdtipo.getText()), txtNombre, txtObservacion);
			}
		});
		btnConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\3844467_magnifier_search_zoom_icon.png"));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(165, 244, 45, 46);
		contentPane.add(btnConsultar);
		
		btnActualizar = new JButton("");
		btnActualizar.setToolTipText("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(Integer.parseInt(txtIdtipo.getText()), txtNombre.getText(), txtObservacion.getText());
			}
		});
		btnActualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035962_sync_sharp_icon.png"));
		btnActualizar.setContentAreaFilled(false);
		btnActualizar.setBorder(null);
		btnActualizar.setBounds(220, 244, 48, 46);
		contentPane.add(btnActualizar);
		
		btnMenu = new JButton("");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmPrincipal view = new frmPrincipal();
				view.show();
			}
			
		});
		btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu.setToolTipText("Menu");
		btnMenu.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035789_chevron_back_sharp_icon.png"));
		btnMenu.setContentAreaFilled(false);
		btnMenu.setBorder(null);
		btnMenu.setBounds(10, 11, 21, 21);
		contentPane.add(btnMenu);
	}

}
