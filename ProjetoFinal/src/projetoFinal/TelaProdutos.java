package projetoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private TelaLogin login;
	private TelaCarrinhoDeCompras compras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProdutos frame = new TelaProdutos();
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
	public TelaProdutos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Camila\\Desktop\\Camila\\Design Gráfico\\Projeto Telas\\Patinha2.png"));
		setTitle("Produtos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 642, 750);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu1 = new JMenu(">");
		menuBar.add(mnMenu1);
		
		JMenuItem mniLogin = new JMenuItem("Login");
		mniLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login = new TelaLogin();
				login.setVisible(true);
				
			}
		});
		mnMenu1.add(mniLogin);
		
		JMenuItem mniSair = new JMenuItem("Sair");
		mniSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		mnMenu1.add(mniSair);
		
		JMenu mnMenu2 = new JMenu("Carrinho");
		menuBar.add(mnMenu2);
		
		JMenuItem mniTerminarCompra = new JMenuItem("Ir para Carrinho");
		mniTerminarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				compras.setVisible(true);
				dispose();
			}
		});
		mnMenu2.add(mniTerminarCompra);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbImagem1 = new JLabel("");
		lbImagem1.setIcon(new ImageIcon("C:\\Users\\aluno\\Downloads\\unnamed.png"));
		lbImagem1.setBounds(35, 93, 150, 145);
		contentPane.add(lbImagem1);
		
		JLabel lbTitulo1 = new JLabel("Bola Cravo para Cães e \r\n");
		lbTitulo1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbTitulo1.setBounds(35, 248, 150, 15);
		contentPane.add(lbTitulo1);
		
		JLabel lbTitulo1_1 = new JLabel("Gatos");
		lbTitulo1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbTitulo1_1.setBounds(35, 266, 45, 13);
		contentPane.add(lbTitulo1_1);
		
		JLabel lbPreco1 = new JLabel("R$ 08,99");
		lbPreco1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbPreco1.setBounds(35, 289, 68, 13);
		contentPane.add(lbPreco1);
		
		compras = new TelaCarrinhoDeCompras();
		
		JButton btComprar2 = new JButton("Comprar Agora");
		btComprar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mensagemNotificacao();
				compras.taCompras.append("Ração para Gatos - Preço: R$ 12,99\n");
				
			}
		});
		btComprar2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btComprar2.setBackground(new Color(213, 213, 255));
		btComprar2.setBounds(252, 323, 129, 21);
		contentPane.add(btComprar2);
		
		JLabel lbImagem2 = new JLabel("");
		lbImagem2.setIcon(new ImageIcon("C:\\Users\\Camila\\Desktop\\Camila\\PDS\\Trabalho Telas - Design Gráfico (20).png"));
		lbImagem2.setBounds(242, 93, 144, 145);
		contentPane.add(lbImagem2);
		
		JLabel lbImagem3 = new JLabel("");
		lbImagem3.setIcon(new ImageIcon("C:\\Users\\Camila\\Desktop\\Camila\\PDS\\Trabalho Telas - Design Gráfico (39).png"));
		lbImagem3.setBounds(440, 103, 150, 120);
		contentPane.add(lbImagem3);
		
		JLabel lbImagem4 = new JLabel("");
		lbImagem4.setIcon(new ImageIcon("C:\\Users\\Camila\\Desktop\\Camila\\PDS\\Trabalho Telas - Design Gráfico (74).png"));
		lbImagem4.setBounds(35, 398, 150, 167);
		contentPane.add(lbImagem4);
		
		JLabel lbImagem5 = new JLabel("");
		lbImagem5.setIcon(new ImageIcon("C:\\Users\\Camila\\Desktop\\Camila\\PDS\\Trabalho Telas - Design Gráfico (41).png"));
		lbImagem5.setBounds(242, 400, 144, 165);
		contentPane.add(lbImagem5);
		
		JLabel lbImagem6 = new JLabel("");
		lbImagem6.setIcon(new ImageIcon("C:\\Users\\Camila\\Desktop\\Camila\\PDS\\Trabalho Telas - Design Gráfico (17).png"));
		lbImagem6.setBounds(440, 398, 144, 167);
		contentPane.add(lbImagem6);
		
		JLabel lbTitulo2 = new JLabel("Ração para Gatos");
		lbTitulo2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbTitulo2.setBounds(242, 250, 144, 13);
		contentPane.add(lbTitulo2);
		
		JLabel lbPreco2 = new JLabel("R$ 50,99");
		lbPreco2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbPreco2.setBounds(242, 291, 75, 13);
		contentPane.add(lbPreco2);
		
		
		JButton btComprar1 = new JButton("Comprar Agora");
		btComprar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mensagemNotificacao();
				compras.taCompras.append("Produto: Bola Cravo para Cães e Gatos - Preço: R$ 08,99\n");
				
			}
		});
		btComprar1.setBackground(new Color(213, 213, 255));
		btComprar1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btComprar1.setBounds(45, 323, 129, 21);
		contentPane.add(btComprar1);
		
		
		JLabel lbTitulo3 = new JLabel("Coleira Rosa para Gatos");
		lbTitulo3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbTitulo3.setBounds(440, 250, 150, 13);
		contentPane.add(lbTitulo3);
		
		JLabel lbPreco3 = new JLabel("R$ 12,99");
		lbPreco3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbPreco3.setBounds(440, 291, 68, 13);
		contentPane.add(lbPreco3);
		
		JButton btComprar3 = new JButton("Comprar Agora");
		btComprar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mensagemNotificacao();
				compras.taCompras.append("Coleira Rosa para Gatos - Preço: R$ 12,99\n");
				
			}
		});
		btComprar3.setBackground(new Color(213, 213, 255));
		btComprar3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btComprar3.setBounds(450, 323, 129, 21);
		contentPane.add(btComprar3);
		
		JLabel lbTitulo4 = new JLabel("Remédio Antipulgas");
		lbTitulo4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbTitulo4.setBounds(35, 575, 150, 13);
		contentPane.add(lbTitulo4);
		
		JLabel lbTitulo4_1 = new JLabel("para Cães");
		lbTitulo4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbTitulo4_1.setBounds(35, 589, 68, 13);
		contentPane.add(lbTitulo4_1);
		
		JLabel lbPreco4 = new JLabel("R$ 64,79");
		lbPreco4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbPreco4.setBounds(35, 612, 68, 13);
		contentPane.add(lbPreco4);
		
		JButton btComprar4 = new JButton("Comprar Agora");
		btComprar4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mensagemNotificacao();
				compras.taCompras.append("Remédio Antipulgas para Cães - Preço: R$ 64,79\n");
				
			}
		});
		btComprar4.setBackground(new Color(213, 213, 255));
		btComprar4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btComprar4.setBounds(45, 645, 129, 21);
		contentPane.add(btComprar4);
		
		JLabel lbTitulo5 = new JLabel("Roupa Verde para Cães");
		lbTitulo5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbTitulo5.setBounds(242, 576, 144, 13);
		contentPane.add(lbTitulo5);
		
		JLabel lbPreco5 = new JLabel("R$ 40,80");
		lbPreco5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbPreco5.setBounds(242, 612, 75, 13);
		contentPane.add(lbPreco5);
		
		JButton btComprar5 = new JButton("Comprar Agora");
		btComprar5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mensagemNotificacao();
				compras.taCompras.append("Roupa Verde para Cães - Preço: R$ 40,80\n");
				
			}
		});
		btComprar5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btComprar5.setBackground(new Color(213, 213, 255));
		btComprar5.setBounds(252, 645, 129, 21);
		contentPane.add(btComprar5);
		
		JLabel lbTitulo6 = new JLabel("Arranhador para Gatos");
		lbTitulo6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbTitulo6.setBounds(440, 575, 150, 13);
		contentPane.add(lbTitulo6);
		
		JLabel lbPreco6 = new JLabel("R$ 130,65");
		lbPreco6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbPreco6.setBounds(440, 614, 88, 13);
		contentPane.add(lbPreco6);
		
		JButton btComprar6 = new JButton("Comprar Agora");
		btComprar6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mensagemNotificacao();
				compras.taCompras.append("Arranhador para Gatos - Preço: R$ 130,65\n");
				
			}
		});
		btComprar6.setBackground(new Color(213, 213, 255));
		btComprar6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btComprar6.setBounds(450, 645, 129, 21);
		contentPane.add(btComprar6);
		
		JLabel lbProdutos = new JLabel("Produtos");
		lbProdutos.setFont(new Font("SansSerif", Font.BOLD, 22));
		lbProdutos.setBounds(264, 27, 104, 29);
		contentPane.add(lbProdutos);
	}
	
	public void mensagemNotificacao() {
		JOptionPane.showMessageDialog(null, "Produto Adicionado ao Carrinho com Sucesso!", 
				"Tela de Notificação", JOptionPane.INFORMATION_MESSAGE);
	}
}
