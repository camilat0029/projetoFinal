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
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNomeCad;
	private JTextField tfUsuarioCad;
	private JPasswordField pfSenhaCad;
	
	private TelaLogin login;
	private JComboBox cbIdentfCad;
	private JLabel lblNewLabel;
	private Usuario usuario;

	
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(213, 213, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome Completo");
		lbNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbNome.setBounds(61, 51, 120, 13);
		contentPane.add(lbNome);
		
		JLabel lbUsuario = new JLabel("Usuário");
		lbUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbUsuario.setBounds(61, 78, 57, 13);
		contentPane.add(lbUsuario);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbSenha.setBounds(61, 107, 45, 13);
		contentPane.add(lbSenha);
		
		tfNomeCad = new JTextField();
		tfNomeCad.setBounds(177, 49, 144, 19);
		contentPane.add(tfNomeCad);
		tfNomeCad.setColumns(10);
		
		tfUsuarioCad = new JTextField();
		tfUsuarioCad.setBounds(177, 75, 144, 19);
		contentPane.add(tfUsuarioCad);
		tfUsuarioCad.setColumns(10);
		
		pfSenhaCad = new JPasswordField();
		pfSenhaCad.setBounds(177, 104, 144, 19);
		contentPane.add(pfSenhaCad);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btCadastrar.setBackground(new Color(184, 185, 245));
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login = new TelaLogin();
				
				login.usuario1 = tfUsuarioCad.getText();
				login.senha1 = pfSenhaCad.getText();
				login.identif1 = cbIdentfCad.getSelectedItem().toString();
				
				JOptionPane.showMessageDialog(null, "Bem Vindo!!!\n" + tfNomeCad.getText(), "Tela Bem Vindo", 1);
				
				login.setVisible(true);
			
			}
		});
		btCadastrar.setBounds(156, 197, 106, 21);
		contentPane.add(btCadastrar);
		
		cbIdentfCad = new JComboBox();
		cbIdentfCad.setModel(new DefaultComboBoxModel(new String[] {"Cliente", "Profissional"}));
		cbIdentfCad.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbIdentfCad.setBounds(177, 133, 144, 21);
		contentPane.add(cbIdentfCad);
		
		lblNewLabel = new JLabel("Identificação");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(61, 137, 106, 13);
		contentPane.add(lblNewLabel);
	}
}
