package codigo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(29, 23, 372, 20);
		contentPane.add(comboBox);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(29, 78, 46, 14);
		contentPane.add(lblTitulo);
		
		textField = new JTextField();
		textField.setBounds(85, 75, 316, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 117, 162, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDirector = new JLabel("Director");
		lblDirector.setBounds(29, 120, 46, 14);
		contentPane.add(lblDirector);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(268, 120, 46, 14);
		contentPane.add(lblAo);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(29, 164, 46, 14);
		contentPane.add(lblGenero);
		
		JLabel lblActores = new JLabel("Actores");
		lblActores.setBounds(29, 195, 46, 14);
		contentPane.add(lblActores);
		
		textField_2 = new JTextField();
		textField_2.setBounds(315, 117, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(85, 161, 162, 20);
		contentPane.add(comboBox_1);
	}
}
