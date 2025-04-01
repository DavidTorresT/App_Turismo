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

public class frmMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JTextField txtTipomedio;
	private JButton btnNewButton;
	Medios cr = new Medios();
	private JLabel lblNewLabel_1;
	private JTextField txtIdmedios;
	private JButton btnDelete;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
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
		
		txtObservacion = new JTextField();
		txtObservacion.setBounds(216, 167, 86, 20);
		contentPane.add(txtObservacion);
		txtObservacion.setColumns(10);
		
		txtTipomedio = new JTextField();
		txtTipomedio.setBounds(217, 211, 86, 20);
		contentPane.add(txtTipomedio);
		txtTipomedio.setColumns(10);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8666542_save_icon.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.create(txtNombre.getText(), txtObservacion.getText(), Integer.parseInt(txtTipomedio.getText()));
				txtNombre.setText("");
				txtObservacion.setText("");
				txtTipomedio.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(188, 242, 46, 43);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("ID Medio:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(91, 66, 73, 23);
		contentPane.add(lblNewLabel_1);
		
		txtIdmedios = new JTextField();
		txtIdmedios.setColumns(10);
		txtIdmedios.setBounds(174, 69, 86, 20);
		contentPane.add(txtIdmedios);
		
		btnDelete = new JButton("");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIdmedios.getText()));
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Icon\\8664938_trash_can_delete_remove_icon.png"));
		btnDelete.setBounds(270, 56, 48, 46);
		contentPane.add(btnDelete);
	}

}
