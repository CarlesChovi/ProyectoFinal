package codigo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField titulo;
	private JTextField director;
	private JTextField año;
	private Videoclub pelicula;
	
	private JComboBox<Videoclub> videoclub;

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
		
		videoclub = new JComboBox<Videoclub>();
		videoclub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					pelicula=videoclub.getItemAt(videoclub.getSelectedIndex());
					titulo.setText(String.valueOf(pelicula.getTitulo()));
					director.setText(String.valueOf(pelicula.getDirector()));
					año.setText(String.valueOf(pelicula.getAño()));
			}
		});
		videoclub.setBounds(10, 11, 414, 20);
		contentPane.add(videoclub);
				
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(29, 54, 46, 14);
		contentPane.add(lblTitulo);
		
		titulo = new JTextField();
		titulo.setBounds(85, 54, 316, 20);
		contentPane.add(titulo);
		titulo.setColumns(10);
		
		
		JLabel lblDirector = new JLabel("Director");
		lblDirector.setBounds(29, 103, 46, 14);
		contentPane.add(lblDirector);
		
		director = new JTextField();
		director.setBounds(85, 100, 162, 20);
		contentPane.add(director);
		director.setColumns(10);
				
			
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(29, 149, 46, 14);
		contentPane.add(lblGenero);
		
		
		
		JLabel lblAño = new JLabel("Año");
		lblAño.setBounds(268, 103, 46, 14);
		contentPane.add(lblAño);
		
		año = new JTextField();
		año.setBounds(315, 100, 86, 20);
		contentPane.add(año);
		año.setColumns(10);
				
		JButton btnGuardar_1 = new JButton("Guardar");
		btnGuardar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aquí realizaremos los siguientes pasos
				//1.- Comprobaremos que todos los campos están completados

				if((titulo.getText()).equals("")){
					JOptionPane.showMessageDialog(null,"Campo titulo vacio");
				}
				else if ((director.getText()).equals("")){
					JOptionPane.showMessageDialog(null,"Campo director vacio");
				}
				else if ((año.getText()).equals("")){
					JOptionPane.showMessageDialog(null,"Campo año vacio");
				}
				
				
				//2.- Creamos un nuevo objeto pelicula
				else  {
				pelicula=new Videoclub();
				pelicula.setTitulo(String.valueOf(titulo.getText()));
				pelicula.setDirector(String.valueOf(director.getText()));
				pelicula.setAño(Integer.parseInt(año.getText()));
				
				//3.- Lo almacenaremos en el ComboBox
				videoclub.addItem(pelicula);
				}
			}
		});

		btnGuardar_1.setBounds(10, 204, 89, 23);
		contentPane.add(btnGuardar_1);
		
		JButton btnModificar_1 = new JButton("Modificar");
		btnModificar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//seleccionar
				videoclub.getItemAt(videoclub.getSelectedIndex());
				
				pelicula.setTitulo(String.valueOf(titulo.getText()));
				pelicula.setDirector(String.valueOf((director.getText())));
				pelicula.setAño(Integer.parseInt((año.getText())));
				
			}
		});
		btnModificar_1.setBounds(158, 204, 89, 23);
		contentPane.add(btnModificar_1);
				
		JButton btnBorrar_1 = new JButton("Borrar");
		btnBorrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				videoclub.removeItem(videoclub.getItemAt(videoclub.getSelectedIndex()));
			}
		});
		

		btnBorrar_1.setBounds(315, 204, 89, 23);
		contentPane.add(btnBorrar_1);
		
		// Creacion del JComboBox y añadir los items.
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("");
		comboBox.addItem("Terror");
		comboBox.addItem("Acción");
		comboBox.addItem("Drama");
		comboBox.addItem("Comedia");
		comboBox.addItem("Animación");
		comboBox.addItem("Aventuras");
		comboBox.addItem("Ciencia Ficción");
		comboBox.setBounds(85, 146, 162, 20);
		contentPane.add(comboBox);
		
		
		
	}
}
