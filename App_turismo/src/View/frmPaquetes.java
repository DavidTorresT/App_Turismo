package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;

import Model.Paquetes;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class frmPaquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIddestino;
	private JTextField txtIdorigen;
	private JTextField txtFechaventa;
	private JTextField txtHoraventa;
	private JTextField txtHorasalida;
	private JTextField txtFechaejecucion;
	private JTextField txtObservacion;
	private JTextField txtIdpromotor;
	private JTextField txtIdmedio;
	private JTextField txtIdcliente;
	private JTextField txtIdagencia;
	private JTextField txtPrecio;
	private JTextField txtIdpaquete;
	Paquetes cr = new Paquetes();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPaquetes frame = new frmPaquetes();
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
	public frmPaquetes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion De Paquetes Turisticos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(87, 11, 254, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID Destino:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 124, 72, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID Origen:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 174, 72, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Fecha De Venta:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 227, 97, 22);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hora De Venta:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 281, 88, 22);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Hora De Salida:");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(155, 124, 88, 22);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Fecha De Ejecucion:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(155, 174, 112, 22);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Observacion:");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(155, 227, 88, 22);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("ID Promotor:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(155, 281, 72, 22);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("ID Medio:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(319, 124, 72, 22);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("ID Cliente:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_6.setBounds(319, 174, 72, 22);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("ID Agencia:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(319, 227, 72, 22);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Matricula:");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_8.setBounds(319, 281, 72, 22);
		contentPane.add(lblNewLabel_1_8);
		
		txtIddestino = new JTextField();
		txtIddestino.setBounds(12, 143, 86, 20);
		contentPane.add(txtIddestino);
		txtIddestino.setColumns(10);
		
		txtIdorigen = new JTextField();
		txtIdorigen.setBounds(10, 195, 86, 20);
		contentPane.add(txtIdorigen);
		txtIdorigen.setColumns(10);
		
		txtFechaventa = new JTextField();
		txtFechaventa.setBounds(10, 250, 86, 20);
		contentPane.add(txtFechaventa);
		txtFechaventa.setColumns(10);
		
		txtHoraventa = new JTextField();
		txtHoraventa.setBounds(10, 302, 86, 20);
		contentPane.add(txtHoraventa);
		txtHoraventa.setColumns(10);
		
		JComboBox cbMatricula = new JComboBox();
		cbMatricula.setModel(new DefaultComboBoxModel(new String[] {"ASFDS53", "BUS-245", "FJD-304", "HHY-341", "IMO-983", "JKF-G35", "PCK-678", "SUV-345", "TRK-567", "YTT-203"}));
		cbMatricula.setBounds(319, 301, 86, 22);
		contentPane.add(cbMatricula);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setBorder(null);
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8666542_save_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paquetes cr = new Paquetes();
				String matricula = "" + cbMatricula.getSelectedItem();
				cr.create(Integer.parseInt(txtIddestino.getText()), Integer.parseInt(txtIdorigen.getText()), txtFechaventa.getText(), txtHoraventa.getText(), txtHorasalida.getText(),
						txtFechaejecucion.getText(), txtObservacion.getText(), Integer.parseInt(txtIdpromotor.getText()), Integer.parseInt(txtIdmedio.getText()), Integer.parseInt(txtIdcliente.getText()), Integer.parseInt(txtIdagencia.getText()), matricula, txtPrecio.getText());
				txtIddestino.setText("");
				txtIdorigen.setText("");
				txtFechaventa.setText("");
				txtHoraventa.setText("");
				txtHorasalida.setText("");
				txtFechaejecucion.setText("");
				txtObservacion.setText("");
				txtIdpromotor.setText("");
				txtIdmedio.setText("");
				txtIdcliente.setText("");
				txtIdagencia.setText("");
				txtPrecio.setText("");
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(181, 392, 46, 46);
		contentPane.add(btnGuardar);
		
		txtHorasalida = new JTextField();
		txtHorasalida.setBounds(155, 143, 86, 20);
		contentPane.add(txtHorasalida);
		txtHorasalida.setColumns(10);
		
		txtFechaejecucion = new JTextField();
		txtFechaejecucion.setBounds(155, 196, 86, 20);
		contentPane.add(txtFechaejecucion);
		txtFechaejecucion.setColumns(10);
		
		txtObservacion = new JTextField();
		txtObservacion.setBounds(155, 250, 86, 20);
		contentPane.add(txtObservacion);
		txtObservacion.setColumns(10);
		
		txtIdpromotor = new JTextField();
		txtIdpromotor.setBounds(155, 302, 86, 20);
		contentPane.add(txtIdpromotor);
		txtIdpromotor.setColumns(10);
		
		txtIdmedio = new JTextField();
		txtIdmedio.setBounds(319, 143, 86, 20);
		contentPane.add(txtIdmedio);
		txtIdmedio.setColumns(10);
		
		txtIdcliente = new JTextField();
		txtIdcliente.setBounds(319, 195, 86, 20);
		contentPane.add(txtIdcliente);
		txtIdcliente.setColumns(10);
		
		txtIdagencia = new JTextField();
		txtIdagencia.setBounds(319, 250, 86, 20);
		contentPane.add(txtIdagencia);
		txtIdagencia.setColumns(10);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Precio:");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_2.setBounds(108, 347, 53, 22);
		contentPane.add(lblNewLabel_1_3_2);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(155, 350, 86, 20);
		contentPane.add(txtPrecio);
		
		JButton btnDelete = new JButton("");
		btnDelete.setBorder(null);
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIdpaquete.getText()));
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8664938_trash_can_delete_remove_icon.png"));
		btnDelete.setContentAreaFilled(false);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(263, 57, 46, 46);
		contentPane.add(btnDelete);
		
		txtIdpaquete = new JTextField();
		txtIdpaquete.setColumns(10);
		txtIdpaquete.setBounds(157, 70, 86, 20);
		contentPane.add(txtIdpaquete);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("ID Paquete:");
		lblNewLabel_1_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_2_1.setBounds(75, 67, 86, 22);
		contentPane.add(lblNewLabel_1_3_2_1);
		
		
	}
}
