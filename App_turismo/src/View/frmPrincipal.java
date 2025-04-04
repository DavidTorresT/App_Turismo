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
		setBounds(100, 100, 450, 388);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(133, 188, 136));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(173, 22, 96, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnPromotores = new JButton("");
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
		btnPromotores.setBounds(20, 104, 65, 49);
		contentPane.add(btnPromotores);
		
		JLabel lblNewLabel_1 = new JLabel("Promotores");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 88, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnVehiculos = new JButton("");
		btnVehiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		btnVehiculos.setBounds(95, 104, 65, 49);
		contentPane.add(btnVehiculos);
		
		JLabel lblNewLabel_1_1 = new JLabel("Vehiculos");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(95, 88, 65, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnCompania = new JButton("");
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
		btnCompania.setBounds(171, 104, 60, 49);
		contentPane.add(btnCompania);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Compañias");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(173, 88, 65, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnCliente = new JButton("");
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
		btnCliente.setBounds(249, 104, 65, 49);
		contentPane.add(btnCliente);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Clientes");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(249, 88, 65, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
	}

}
