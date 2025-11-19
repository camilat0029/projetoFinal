package projetoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNomeCad;
	private JTextField tfUsuarioCad;
	private JPasswordField pfSenhaCad;
	
	private TelaLogin login;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Camila\\Desktop\\Camila\\Design Gráfico\\Projeto Telas\\Patinha2.png"));
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome Completo");
		lbNome.setBounds(73, 52, 120, 13);
		contentPane.add(lbNome);
		
		JLabel lbUsuario = new JLabel("Usuário");
		lbUsuario.setBounds(73, 96, 45, 13);
		contentPane.add(lbUsuario);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setBounds(73, 146, 45, 13);
		contentPane.add(lbSenha);
		
		tfNomeCad = new JTextField();
		tfNomeCad.setBounds(177, 49, 144, 19);
		contentPane.add(tfNomeCad);
		tfNomeCad.setColumns(10);
		
		tfUsuarioCad = new JTextField();
		tfUsuarioCad.setBounds(177, 93, 144, 19);
		contentPane.add(tfUsuarioCad);
		tfUsuarioCad.setColumns(10);
		
		pfSenhaCad = new JPasswordField();
		pfSenhaCad.setBounds(177, 143, 144, 19);
		contentPane.add(pfSenhaCad);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login = new TelaLogin();
				
				login.usuario1 = tfUsuarioCad.getText();
				login.senha1 = pfSenhaCad.getText();
				
				JOptionPane.showMessageDialog(null, "Bem Vindo!!!\n" + tfNomeCad.getText(), "Tela Bem Vindo", 1);
				
				login.setVisible(true);
			
			}
		});
		btCadastrar.setBounds(156, 197, 85, 21);
		contentPane.add(btCadastrar);
	}
}
