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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;
	
	protected String usuario1 = "Camila";
	protected String senha1 = "1234";
	
	private Usuario usuario;
	private TelaCadastro cadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Camila\\Desktop\\Camila\\Design Gráfico\\Projeto Telas\\Patinha2.png"));
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbUsuario = new JLabel("Usuário");
		lbUsuario.setBounds(90, 87, 46, 14);
		contentPane.add(lbUsuario);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setBounds(90, 143, 46, 14);
		contentPane.add(lbSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(146, 84, 159, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(146, 140, 159, 20);
		contentPane.add(pfSenha);
		
		JLabel lbTexto = new JLabel("Insira o seu usuario e senha para entrar:");
		lbTexto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbTexto.setBounds(90, 39, 259, 14);
		contentPane.add(lbTexto);
		
		JButton btEntrar = new JButton("Entrar");
		
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usuario = new Usuario(tfUsuario.getText(), pfSenha.getText());
				
				if (usuario.getUsuario().equals(usuario1) && usuario.getSenha().equals(senha1)) {
					JOptionPane.showMessageDialog(null, "Acesso Realizado com Sucesso", "Tela de Informação", 1);
				} else {
					JOptionPane.showMessageDialog(null, "Acesso Negado", "Tela de Resposta", 0);
				}
				
				
				tfUsuario.setText("");
				pfSenha.setText("");
				tfUsuario.requestFocus();
				
			}
		});
		btEntrar.setForeground(new Color(0, 0, 0));
		btEntrar.setBackground(new Color(213, 213, 255));
		btEntrar.setBounds(182, 189, 98, 23);
		contentPane.add(btEntrar);
		
		cadastro = new TelaCadastro();
		
		JButton btFazerCadastro = new JButton("Cadastre-se");
		btFazerCadastro.setHorizontalAlignment(SwingConstants.LEFT);
		btFazerCadastro.setForeground(new Color(0, 0, 160));
		btFazerCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadastro.setVisible(true);
				
			}
		});
		btFazerCadastro.setBackground(new Color(255, 255, 255));
		btFazerCadastro.setBounds(242, 222, 106, 23);
		contentPane.add(btFazerCadastro);
		
		btFazerCadastro.setBorderPainted(false);
		
		JLabel lbMensagem = new JLabel("Não tem uma conta ainda?");
		lbMensagem.setBounds(90, 227, 159, 13);
		contentPane.add(lbMensagem);
		
		

	}
}
