package saludador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;

public class Saludador extends JFrame {

	private JPanel contentPane;
	private JTextField entradaTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saludador frame = new Saludador();
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
	public Saludador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		entradaTexto = new JTextField();
		entradaTexto.setBounds(72, 104, 282, 20);
		entradaTexto.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(entradaTexto);
		entradaTexto.setColumns(10);
		
		JLabel texto = new JLabel("Escribe un nombre para saludar");
		texto.setFont(new Font("Tahoma", Font.BOLD, 11));
		texto.setBounds(113, 53, 201, 14);
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(texto);
		
		JButton btnSaludar = new JButton("¡Saludar!");
		btnSaludar.setBounds(164, 167, 93, 23);
		btnSaludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola " + entradaTexto.getText());
			}
		});
		contentPane.add(btnSaludar);
	}
}
