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

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;
	
	private String usuario1 = "Camila";
	private String senha1 = "1234";
	
	private Usuario usuario;

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
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setResizable(false);
		
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 255));
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
		btEntrar.setBounds(178, 189, 89, 23);
		contentPane.add(btEntrar);

	}
}
