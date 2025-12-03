package projetoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;

public class TelaCarrinhoDeCompras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected JTextArea taCompras;
	private JMenu mnMenu1;
	private JMenuItem mnLogin;
	private JMenuItem mniProdutos;
	private JMenuItem mniSair;
	
	private TelaLogin login;
	private TelaProdutos produtos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarrinhoDeCompras frame = new TelaCarrinhoDeCompras();
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
	public TelaCarrinhoDeCompras() {
		setTitle("Tela de Carrinho de Compras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 406);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMenu1 = new JMenu("");
		mnMenu1.setIcon(new ImageIcon("C:\\Users\\Camila\\Desktop\\Camila\\PDS\\icons8-cardápio-50_2.png"));
		menuBar.add(mnMenu1);
		
		login = new TelaLogin();
		produtos = new TelaProdutos();
		
		mnLogin = new JMenuItem("Login");
		mnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login.setVisible(true);
				
			}
		});
		mnLogin.setIcon(new ImageIcon("C:\\Users\\Camila\\Desktop\\Camila\\PDS\\icons8-access-50_2.png"));
		mnMenu1.add(mnLogin);
		
		mniProdutos = new JMenuItem("Continuar Comprando");
		mniProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				produtos.setVisible(true);
				
			}
		});
		mniProdutos.setIcon(new ImageIcon("C:\\Users\\Camila\\Desktop\\Camila\\PDS\\icons8-shopping-bag-50 (1).png"));
		mnMenu1.add(mniProdutos);
		
		mniSair = new JMenuItem("Sair");
		mniSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		mniSair.setIcon(new ImageIcon("C:\\Users\\Camila\\Desktop\\Camila\\PDS\\icons8-x-50.png"));
		mnMenu1.add(mniSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Suas Compras");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setBounds(154, 23, 137, 18);
		contentPane.add(lblNewLabel);
		
		taCompras = new JTextArea();
		taCompras.setBounds(43, 63, 362, 228);
		contentPane.add(taCompras);
		
		JButton btFinalCompras = new JButton("Finalizar Compra");
		btFinalCompras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Compra Finalizada com Sucesso! \nVolte Sempre!", 
						"Tela de Notificação", JOptionPane.INFORMATION_MESSAGE); 
				
			}
		});
		btFinalCompras.setBackground(new Color(184, 185, 245));
		btFinalCompras.setFont(new Font("Tahoma", Font.BOLD, 14));
		btFinalCompras.setBounds(147, 312, 160, 21);
		contentPane.add(btFinalCompras);
	}
}
