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
	private JTextField a�o;
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
					a�o.setText(String.valueOf(pelicula.getA�o()));
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
		
		
		
		JLabel lblA�o = new JLabel("A�o");
		lblA�o.setBounds(268, 103, 46, 14);
		contentPane.add(lblA�o);
		
		a�o = new JTextField();
		a�o.setBounds(315, 100, 86, 20);
		contentPane.add(a�o);
		a�o.setColumns(10);
				
		JButton btnGuardar_1 = new JButton("Guardar");
		btnGuardar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aqu� realizaremos los siguientes pasos
				//1.- Comprobaremos que todos los campos est�n completados

				if((titulo.getText()).equals("")){
					JOptionPane.showMessageDialog(null,"Campo titulo vacio");
				}
				else if ((director.getText()).equals("")){
					JOptionPane.showMessageDialog(null,"Campo director vacio");
				}
				else if ((a�o.getText()).equals("")){
					JOptionPane.showMessageDialog(null,"Campo a�o vacio");
				}
				
				
				//2.- Creamos un nuevo objeto pelicula
				else  {
				pelicula=new Videoclub();
				pelicula.setTitulo(String.valueOf(titulo.getText()));
				pelicula.setDirector(String.valueOf(director.getText()));
				pelicula.setA�o(Integer.parseInt(a�o.getText()));
				
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
				pelicula.setA�o(Integer.parseInt((a�o.getText())));
				
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
		
		// Creacion del JComboBox y a�adir los items.
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("");
		comboBox.addItem("Terror");
		comboBox.addItem("Acci�n");
		comboBox.addItem("Drama");
		comboBox.addItem("Comedia");
		comboBox.addItem("Animaci�n");
		comboBox.addItem("Aventuras");
		comboBox.addItem("Ciencia Ficci�n");
		comboBox.setBounds(85, 146, 162, 20);
		contentPane.add(comboBox);
		
		
		
	}
}
