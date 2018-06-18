package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class CadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf_cnpj;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroUsuario frame = new CadastroUsuario();
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
	public CadastroUsuario() {
		setTitle("Cadastro Usu\u00E1rio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 340, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nome = new JTextField();
		nome.setBounds(76, 11, 210, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 14, 63, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpfcnpj = new JLabel("CPF/CNPJ:");
		lblCpfcnpj.setBounds(10, 50, 72, 14);
		contentPane.add(lblCpfcnpj);
		
		cpf_cnpj = new JTextField();
		cpf_cnpj.setBounds(77, 47, 209, 20);
		contentPane.add(cpf_cnpj);
		cpf_cnpj.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 85, 63, 14);
		contentPane.add(lblEmail);
		
		email = new JTextField();
		email.setBounds(76, 82, 210, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(114, 122, 89, 23);
		contentPane.add(btnCadastrar);
	}
}
