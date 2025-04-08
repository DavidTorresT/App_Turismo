package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Promotores;

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

public class frmPromotores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTipodocumento;
	private JTextField txtNumerodocumento;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtFechanacimiento;
	private JTextField txtTelefono;
	private JButton btnGuardar;
	Promotores cr = new Promotores();
	private JButton btnDelete;
	private JLabel lblIdPromotor;
	private JTextField txtIdpromotor;
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
					frmPromotores frame = new frmPromotores();
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
	public frmPromotores() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 402, 405);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(133, 188, 136));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo De Documento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(30, 103, 115, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumeroDeDocumento = new JLabel("Numero De Documento:");
		lblNumeroDeDocumento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumeroDeDocumento.setBounds(218, 103, 134, 21);
		contentPane.add(lblNumeroDeDocumento);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombres.setBounds(30, 155, 65, 21);
		contentPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApellidos.setBounds(218, 155, 65, 21);
		contentPane.add(lblApellidos);
		
		txtTipodocumento = new JTextField();
		txtTipodocumento.setBounds(30, 124, 86, 20);
		contentPane.add(txtTipodocumento);
		txtTipodocumento.setColumns(10);
		
		txtNumerodocumento = new JTextField();
		txtNumerodocumento.setBounds(218, 124, 86, 20);
		contentPane.add(txtNumerodocumento);
		txtNumerodocumento.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(30, 178, 86, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDireccion.setBounds(30, 209, 65, 21);
		contentPane.add(lblDireccion);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCorreo.setBounds(218, 209, 65, 21);
		contentPane.add(lblCorreo);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(218, 178, 86, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(30, 227, 86, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha De Nacimiento:");
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFechaDeNacimiento.setBounds(30, 258, 125, 21);
		contentPane.add(lblFechaDeNacimiento);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefono.setBounds(218, 258, 65, 21);
		contentPane.add(lblTelefono);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(218, 227, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtFechanacimiento = new JTextField();
		txtFechanacimiento.setBounds(30, 278, 86, 20);
		contentPane.add(txtFechanacimiento);
		txtFechanacimiento.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gestion De Promotores");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(85, 11, 201, 21);
		contentPane.add(lblNewLabel_1);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(218, 278, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		btnGuardar = new JButton("");
		btnGuardar.setToolTipText("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(Integer.parseInt(txtTipodocumento.getText()), Integer.parseInt(txtNumerodocumento.getText()), txtNombres.getText(), txtApellidos.getText(), txtDireccion.getText(), txtCorreo.getText(), txtFechanacimiento.getText(), txtTelefono.getText());
				txtTipodocumento.setText("");
				txtNumerodocumento.setText("");
				txtNombres.setText("");
				txtApellidos.setText("");
				txtDireccion.setText("");
				txtCorreo.setText("");
				txtFechanacimiento.setText("");
				txtTelefono.setText("");
			}
		});
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setBorder(null);
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8666542_save_icon.png"));
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(69, 309, 42, 46);
		contentPane.add(btnGuardar);
		
		btnDelete = new JButton("");
		btnDelete.setToolTipText("Eliminar");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBorder(null);
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIdpromotor.getText()));
				txtTipodocumento.setText("");
				txtNumerodocumento.setText("");
				txtNombres.setText("");
				txtApellidos.setText("");
				txtDireccion.setText("");
				txtCorreo.setText("");
				txtFechanacimiento.setText("");
				txtTelefono.setText("");
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8664938_trash_can_delete_remove_icon.png"));
		btnDelete.setBounds(238, 309, 48, 46);
		btnDelete.setContentAreaFilled(false);
		contentPane.add(btnDelete);
		
		lblIdPromotor = new JLabel("ID Promotor:");
		lblIdPromotor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdPromotor.setBounds(54, 60, 78, 21);
		contentPane.add(lblIdPromotor);
		
		txtIdpromotor = new JTextField();
		txtIdpromotor.setColumns(10);
		txtIdpromotor.setBounds(142, 61, 86, 20);
		contentPane.add(txtIdpromotor);
		
		btnConsultar = new JButton("");
		btnConsultar.setToolTipText("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(txtIdpromotor.getText()), txtTipodocumento, txtNumerodocumento, txtNombres, txtApellidos, txtDireccion, txtCorreo, txtFechanacimiento, txtTelefono);
			}
		});
		btnConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\3844467_magnifier_search_zoom_icon.png"));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(125, 309, 45, 46);
		contentPane.add(btnConsultar);
		
		btnActualizar = new JButton("");
		btnActualizar.setToolTipText("Actualizar");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.update(Integer.parseInt(txtIdpromotor.getText()), txtTipodocumento.getText(), Integer.parseInt(txtNumerodocumento.getText()), txtNombres.getText(), txtApellidos.getText(), txtDireccion.getText(), txtCorreo.getText(), txtFechanacimiento.getText(), txtTelefono.getText());
			}
		});
		btnActualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035962_sync_sharp_icon.png"));
		btnActualizar.setContentAreaFilled(false);
		btnActualizar.setBorder(null);
		btnActualizar.setBounds(180, 309, 48, 46);
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
