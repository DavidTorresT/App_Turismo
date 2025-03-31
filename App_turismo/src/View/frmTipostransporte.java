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

public class frmTipostransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JButton btnGuardar;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(50, 55, 66, 25);
		contentPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion:");
		lblObservacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblObservacion.setBounds(50, 104, 85, 25);
		contentPane.add(lblObservacion);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(155, 59, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtObservacion = new JTextField();
		txtObservacion.setToolTipText("");
		txtObservacion.setBounds(155, 104, 177, 91);
		contentPane.add(txtObservacion);
		txtObservacion.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipos De Transporte");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(119, 11, 182, 33);
		contentPane.add(lblNewLabel_1);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tipostransporte cr = new Tipostransporte();
				cr.create(txtNombre.getText(), txtObservacion.getText());
				txtNombre.setText("");
				txtObservacion.setText("");
				
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(165, 212, 99, 23);
		contentPane.add(btnGuardar);
	}

}
