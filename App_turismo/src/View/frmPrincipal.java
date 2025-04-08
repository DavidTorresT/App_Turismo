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
		setBounds(100, 100, 434, 444);
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
		btnPromotores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035899_person_sharp_icon.png"));
		btnPromotores.setContentAreaFilled(false);
		btnPromotores.setBounds(18, 198, 75, 60);
		contentPane.add(btnPromotores);
		
		JLabel lblNewLabel_1 = new JLabel("Promotores");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(18, 182, 75, 14);
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
		btnVehiculos.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035717_bus_sharp_icon.png"));
		btnVehiculos.setContentAreaFilled(false);
		btnVehiculos.setBorder(null);
		btnVehiculos.setBounds(223, 305, 65, 49);
		contentPane.add(btnVehiculos);
		
		JLabel lblNewLabel_1_1 = new JLabel("Vehiculos");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(223, 289, 65, 14);
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
		btnCompania.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035671_business_sharp_icon.png"));
		btnCompania.setContentAreaFilled(false);
		btnCompania.setBorder(null);
		btnCompania.setBounds(18, 113, 60, 49);
		contentPane.add(btnCompania);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Compañias");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(20, 88, 65, 14);
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
		btnCliente.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035899_person_sharp_icon.png"));
		btnCliente.setContentAreaFilled(false);
		btnCliente.setBorder(null);
		btnCliente.setBounds(292, 111, 65, 60);
		contentPane.add(btnCliente);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Clientes");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(292, 88, 65, 14);
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
		btnAgencia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035776_airplane_sharp_icon.png"));
		btnAgencia.setContentAreaFilled(false);
		btnAgencia.setBorder(null);
		btnAgencia.setBounds(98, 113, 65, 49);
		contentPane.add(btnAgencia);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Agencias");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setBounds(98, 88, 65, 14);
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
		btnPaquetes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9036020_newspaper_sharp_icon.png"));
		btnPaquetes.setContentAreaFilled(false);
		btnPaquetes.setBorder(null);
		btnPaquetes.setBounds(183, 113, 65, 49);
		contentPane.add(btnPaquetes);
		
		JLabel lblNewLabel_1_2 = new JLabel("Paquetes Turisticos");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(173, 88, 93, 14);
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
		btnTiposmedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035730_globe_sharp_icon.png"));
		btnTiposmedios.setContentAreaFilled(false);
		btnTiposmedios.setBorder(null);
		btnTiposmedios.setBounds(183, 209, 65, 49);
		contentPane.add(btnTiposmedios);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Medios ");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBounds(103, 182, 65, 14);
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
		btnMedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035894_phone_portrait_sharp_icon.png"));
		btnMedios.setContentAreaFilled(false);
		btnMedios.setBorder(null);
		btnMedios.setBounds(103, 207, 65, 49);
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
		btnTipostransporte.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035723_car_sport_sharp_icon.png"));
		btnTipostransporte.setContentAreaFilled(false);
		btnTipostransporte.setBorder(null);
		btnTipostransporte.setBounds(117, 305, 65, 49);
		contentPane.add(btnTipostransporte);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Tipos De Medios");
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setBounds(183, 182, 77, 14);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Tipos De Transporte");
		lblNewLabel_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1_1.setBounds(98, 289, 110, 14);
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
		btnOperadores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\9035899_person_sharp_icon.png"));
		btnOperadores.setContentAreaFilled(false);
		btnOperadores.setBorder(null);
		btnOperadores.setBounds(292, 198, 60, 60);
		contentPane.add(btnOperadores);
		
		JLabel lblNewLabel_1_3 = new JLabel("Operadores");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(282, 182, 75, 14);
		contentPane.add(lblNewLabel_1_3);
	}
}
