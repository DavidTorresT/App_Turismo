package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class frmPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal frame = new frmPrincipal();
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
	public frmPrincipal() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 453, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(133, 188, 136));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion De Registros");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(117, 22, 171, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnPromotores = new JButton("");
		btnPromotores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPromotores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmPromotores view = new frmPromotores();
				view.show();
			}
		});
		btnPromotores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPromotores.setBorder(null);
		btnPromotores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\promotor.png"));
		btnPromotores.setContentAreaFilled(false);
		btnPromotores.setBounds(38, 183, 65, 60);
		contentPane.add(btnPromotores);
		
		JLabel lblNewLabel_1 = new JLabel("Promotores");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(28, 158, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnVehiculos = new JButton("");
		btnVehiculos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVehiculos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmVehiculo view = new frmVehiculo();
				view.show();
			}
		});
		btnVehiculos.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\autobus.png"));
		btnVehiculos.setContentAreaFilled(false);
		btnVehiculos.setBorder(null);
		btnVehiculos.setBounds(235, 287, 65, 58);
		contentPane.add(btnVehiculos);
		
		JLabel lblNewLabel_1_1 = new JLabel("Vehiculos");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(235, 262, 65, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnCompania = new JButton("");
		btnCompania.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCompania.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmCompanias view = new frmCompanias();
				view.show();
			}
		});
		btnCompania.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\compania.png"));
		btnCompania.setContentAreaFilled(false);
		btnCompania.setBorder(null);
		btnCompania.setBounds(33, 88, 60, 49);
		contentPane.add(btnCompania);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Compañias");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(28, 63, 65, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnCliente = new JButton("");
		btnCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmClientes view = new frmClientes();
				view.show();
			}
		});
		btnCliente.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\opinion-del-cliente.png"));
		btnCliente.setContentAreaFilled(false);
		btnCliente.setBorder(null);
		btnCliente.setBounds(343, 88, 65, 58);
		contentPane.add(btnCliente);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Clientes");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(343, 63, 65, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JButton btnAgencia = new JButton("");
		btnAgencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmAgencias view = new frmAgencias();
				view.show();
			}
		});
		btnAgencia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgencia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\agencia-de-viajes.png"));
		btnAgencia.setContentAreaFilled(false);
		btnAgencia.setBorder(null);
		btnAgencia.setBounds(117, 88, 65, 49);
		contentPane.add(btnAgencia);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Agencias");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setBounds(117, 64, 65, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JButton btnPaquetes = new JButton("");
		btnPaquetes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmPaquetes view = new frmPaquetes();
				view.show();
			}
		});
		btnPaquetes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\viajar.png"));
		btnPaquetes.setContentAreaFilled(false);
		btnPaquetes.setBorder(null);
		btnPaquetes.setBounds(223, 88, 77, 58);
		contentPane.add(btnPaquetes);
		
		JLabel lblNewLabel_1_2 = new JLabel("Paquetes Turisticos");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(204, 64, 125, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnTiposmedios = new JButton("");
		btnTiposmedios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTiposmedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTiposmedios view = new frmTiposmedios();
				view.show();
			}
		});
		btnTiposmedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\medios-de-comunicacion-en-masa.png"));
		btnTiposmedios.setContentAreaFilled(false);
		btnTiposmedios.setBorder(null);
		btnTiposmedios.setBounds(221, 178, 67, 65);
		contentPane.add(btnTiposmedios);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Medios ");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBounds(117, 158, 65, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JButton btnMedios = new JButton("");
		btnMedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTiposmedios view = new frmTiposmedios();
				view.show();
			}
		});
		btnMedios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\marketing-de-medios-sociales.png"));
		btnMedios.setContentAreaFilled(false);
		btnMedios.setBorder(null);
		btnMedios.setBounds(117, 178, 65, 60);
		contentPane.add(btnMedios);
		
		JButton btnTipostransporte = new JButton("");
		btnTipostransporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTipostransporte view = new frmTipostransporte();
				view.show();
			}
		});
		btnTipostransporte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTipostransporte.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\transporte.png"));
		btnTipostransporte.setContentAreaFilled(false);
		btnTipostransporte.setBorder(null);
		btnTipostransporte.setBounds(98, 287, 84, 58);
		contentPane.add(btnTipostransporte);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Tipos De Medios");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setBounds(204, 158, 108, 14);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Tipos De Transporte");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1_1.setBounds(77, 262, 125, 14);
		contentPane.add(lblNewLabel_1_1_2_1_1);
		
		JButton btnOperadores = new JButton("");
		btnOperadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmOperadores view = new frmOperadores();
				view.show();
			}
		});
		btnOperadores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOperadores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\group_921347.png"));
		btnOperadores.setContentAreaFilled(false);
		btnOperadores.setBorder(null);
		btnOperadores.setBounds(348, 183, 60, 60);
		contentPane.add(btnOperadores);
		
		JLabel lblNewLabel_1_3 = new JLabel("Operadores");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(333, 158, 75, 14);
		contentPane.add(lblNewLabel_1_3);
	}
}
