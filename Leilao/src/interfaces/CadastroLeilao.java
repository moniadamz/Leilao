package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroLeilao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroLeilao frame = new CadastroLeilao();
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
	public CadastroLeilao() {
		setTitle("Cadastro Leil\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdicionarObjetos = new JLabel("Adicionar Objetos:");
		lblAdicionarObjetos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdicionarObjetos.setBounds(10, 11, 126, 14);
		contentPane.add(lblAdicionarObjetos);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(10, 36, 64, 14);
		contentPane.add(lblDescrio);
		
		textField = new JTextField();
		textField.setBounds(78, 33, 192, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescrioCompleta = new JLabel("Descri\u00E7\u00E3o completa:");
		lblDescrioCompleta.setBounds(10, 67, 116, 14);
		contentPane.add(lblDescrioCompleta);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 64, 309, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 92, 414, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(10, 123, 64, 14);
		contentPane.add(lblCategoria);
		
		textField_3 = new JTextField();
		textField_3.setBounds(78, 120, 151, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(335, 143, 89, 23);
		contentPane.add(btnAdicionar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 176, 290, 124);
		contentPane.add(textArea);
		
		JButton btnCadastrarLeilo = new JButton("Cadastrar Leil\u00E3o");
		btnCadastrarLeilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrarLeilo.setBounds(335, 241, 89, 59);
		contentPane.add(btnCadastrarLeilo);
	}
}
