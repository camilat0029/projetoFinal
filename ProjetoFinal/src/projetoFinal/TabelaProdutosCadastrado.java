package projetoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TabelaProdutosCadastrado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected JTable tabela;
	
	private DefaultTableModel modeloTabela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabelaProdutosCadastrado frame = new TabelaProdutosCadastrado();
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
	public TabelaProdutosCadastrado() {
		setTitle("Tela dos Produtos Cadastrados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 38, 785, 515);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Código", "Preço", "Quantidade", "Uni. de Med.", "Marca", "Data de Valid.", "Classificação", "Grupo Alvo" 
			}
		));
		scrollPane.setViewportView(tabela);
		
		JButton btAlterar = new JButton("Alterar");
		btAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btAlterar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btAlterar.setBounds(241, 623, 85, 21);
		contentPane.add(btAlterar);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btExcluir.setBounds(545, 623, 85, 21);
		contentPane.add(btExcluir);
		
		modeloTabela = (DefaultTableModel) tabela.getModel(); 


	}
		
	public void AdicionarProdutos(Object[] informacoes) {
		modeloTabela.addRow(informacoes);
	}
}
