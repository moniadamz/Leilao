package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal window = new JanelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 478, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCadastrarUsurio = new JButton("Cadastrar usu\u00E1rio");
		btnCadastrarUsurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCadastrarUsurio.setBounds(28, 11, 122, 23);
		frame.getContentPane().add(btnCadastrarUsurio);
		
		JButton btnCadastrarLeilo = new JButton("Cadastrar Leil\u00E3o");
		btnCadastrarLeilo.setBounds(28, 45, 122, 23);
		frame.getContentPane().add(btnCadastrarLeilo);
		
		JTextArea mostrarLances = new JTextArea();
		mostrarLances.setBounds(190, 44, 262, 182);
		frame.getContentPane().add(mostrarLances);
		
		JButton btnEncerrar = new JButton("Encerrar");
		btnEncerrar.setBounds(363, 237, 89, 23);
		frame.getContentPane().add(btnEncerrar);
		
		JLabel lblLancesAtO = new JLabel("Lances at\u00E9 o momento:");
		lblLancesAtO.setBounds(190, 13, 142, 19);
		frame.getContentPane().add(lblLancesAtO);
	}
}
