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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;
	
	protected String usuario1 = "Camila";
	protected String senha1 = "1234";
	protected String identif1 = "Profissional";
	
	private Usuario usuario;
	private TelaCadastro cadastro;
	private TelaCadastroProdutos cadProdutos;
	private TelaProdutos produtos;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLogin.class.getResource("/projetoFinal/Imagem - Logo.png")));
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(213, 213, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbUsuario = new JLabel("Usuário");
		lbUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbUsuario.setBounds(72, 85, 55, 14);
		contentPane.add(lbUsuario);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbSenha.setBounds(72, 115, 46, 14);
		contentPane.add(lbSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(158, 84, 159, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(158, 114, 159, 20);
		contentPane.add(pfSenha);
		
		JLabel lbTexto = new JLabel("Insira o seu usuario e senha para entrar:");
		lbTexto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbTexto.setBounds(70, 40, 297, 14);
		contentPane.add(lbTexto);
		
		JComboBox cbIdentificacao = new JComboBox();
		cbIdentificacao.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbIdentificacao.setModel(new DefaultComboBoxModel(new String[] {"Cliente", "Profissional"}));
		cbIdentificacao.setBounds(158, 146, 159, 21);
		contentPane.add(cbIdentificacao);
		
		JButton btEntrar = new JButton("Entrar");
		btEntrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadProdutos = new TelaCadastroProdutos();
				produtos = new TelaProdutos();
				usuario = new Usuario(tfUsuario.getText(), pfSenha.getText(), cbIdentificacao.getSelectedItem().toString());
				usuario1 = tfUsuario.getText();
				senha1 = pfSenha.getText();
				
				
				if (usuario.getUsuario().equals(usuario1) && 
						usuario.getSenha().equals(senha1) && 
						usuario.getIdentificacao().equals(identif1) && identif1.equals("Profissional")) {
					JOptionPane.showMessageDialog(null, "Acesso Realizado com Sucesso", "Tela de Informação", 1);
					cadProdutos.setVisible(true);
					dispose();
					
				} else if (usuario.getUsuario().equals(usuario1) && 
						usuario.getSenha().equals(senha1) && 
						usuario.getIdentificacao().equals(identif1) && identif1.equals("Cliente")) {
					JOptionPane.showMessageDialog(null, "Acesso Realizado com Sucesso", "Tela de Informação", 1);
					produtos.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Acesso Negado", "Tela de Resposta", 0);
				}
				
				
				tfUsuario.setText("");
				pfSenha.setText("");
				tfUsuario.requestFocus();
				
			}
		});
		btEntrar.setForeground(new Color(0, 0, 0));
		btEntrar.setBackground(new Color(184, 185, 245));
		btEntrar.setBounds(182, 189, 98, 23);
		contentPane.add(btEntrar);
		
		
		JButton btFazerCadastro = new JButton("Cadastre-se");
		btFazerCadastro.setHorizontalAlignment(SwingConstants.LEFT);
		btFazerCadastro.setForeground(new Color(0, 0, 160));
		btFazerCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadastro = new TelaCadastro();
				cadastro.setVisible(true);
				
			}
		});
		btFazerCadastro.setBackground(new Color(213, 213, 255));
		btFazerCadastro.setBounds(242, 222, 106, 23);
		contentPane.add(btFazerCadastro);
		
		btFazerCadastro.setBorderPainted(false);
		
		JLabel lbMensagem = new JLabel("Não tem uma conta ainda?");
		lbMensagem.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lbMensagem.setBounds(90, 227, 159, 13);
		contentPane.add(lbMensagem);
		
		JLabel lblNewLabel = new JLabel("Identificação");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(72, 149, 79, 13);
		contentPane.add(lblNewLabel);
		
		

	}
}
