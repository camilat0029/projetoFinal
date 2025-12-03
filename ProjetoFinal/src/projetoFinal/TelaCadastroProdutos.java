package projetoFinal;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class TelaCadastroProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNomeProduto;
	private JTextField tfCodigo;
	private JTextField tfPreco;
	private JTextField tfQuantidade;
	private JTextField tfMarca;
	private JTextField tfDataValid;
	
	private JTable tabela;
	private TelaLogin login;
	
	DefaultTableModel tabelaM;
	
	private int linhaAlt = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroProdutos frame = new TelaCadastroProdutos();
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
	public TelaCadastroProdutos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCadastroProdutos.class.getResource("/projetoFinal/Imagem - Logo.png")));
		setTitle("Cadastro de Produtos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 935, 835);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("");
		mnMenu.setIcon(new ImageIcon(TelaCadastroProdutos.class.getResource("/projetoFinal/unnamed (6).png")));
		menuBar.add(mnMenu);
		
		JMenuItem mnLogin = new JMenuItem("Login");
		mnLogin.setIcon(new ImageIcon(TelaCadastroProdutos.class.getResource("/projetoFinal/unnamed (7).png")));
		mnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login = new TelaLogin();
				login.setVisible(true);
				
			}
		});
		mnMenu.add(mnLogin);
		
		JMenuItem mniSair = new JMenuItem("Sair");
		mniSair.setIcon(new ImageIcon(TelaCadastroProdutos.class.getResource("/projetoFinal/unnamed (8).png")));
		mniSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		mnMenu.add(mniSair);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNomeProduto = new JLabel("Nome do Produto");
		lbNomeProduto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbNomeProduto.setBounds(21, 23, 115, 14);
		contentPane.add(lbNomeProduto);
		
		tfNomeProduto = new JTextField();
		tfNomeProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfNomeProduto.setBounds(139, 21, 285, 20);
		contentPane.add(tfNomeProduto);
		tfNomeProduto.setColumns(10);
		
		JLabel lbCodigo = new JLabel("Código");
		lbCodigo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbCodigo.setBounds(466, 23, 46, 14);
		contentPane.add(lbCodigo);
		
		tfCodigo = new JTextField();
		tfCodigo.setBounds(522, 22, 115, 20);
		contentPane.add(tfCodigo);
		tfCodigo.setColumns(10);
		
		JLabel lbPreco = new JLabel("Preço");
		lbPreco.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbPreco.setBounds(679, 23, 46, 14);
		contentPane.add(lbPreco);
		
		tfPreco = new JTextField();
		tfPreco.setToolTipText("");
		tfPreco.setBounds(724, 22, 159, 20);
		contentPane.add(tfPreco);
		tfPreco.setColumns(10);
		
		JLabel lbQuant = new JLabel("Quantidade");
		lbQuant.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbQuant.setBounds(21, 67, 71, 14);
		contentPane.add(lbQuant);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setBounds(102, 66, 86, 20);
		contentPane.add(tfQuantidade);
		tfQuantidade.setColumns(10);
		
		JLabel lbMedidas = new JLabel("Unidade Medida");
		lbMedidas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbMedidas.setBounds(239, 67, 105, 14);
		contentPane.add(lbMedidas);
		
		JComboBox cbUniMed = new JComboBox();
		cbUniMed.setModel(new DefaultComboBoxModel(new String[] {"un", "kg", "g", "m", "cm", "mm", "L", "ml"}));
		cbUniMed.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbUniMed.setBounds(348, 63, 76, 22);
		contentPane.add(cbUniMed);
		
		JLabel lbMarca = new JLabel("Marca");
		lbMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbMarca.setBounds(466, 67, 46, 14);
		contentPane.add(lbMarca);
		
		tfMarca = new JTextField();
		tfMarca.setBounds(522, 66, 115, 20);
		contentPane.add(tfMarca);
		tfMarca.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Escolha o Grupo Alvo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(21, 116, 210, 14);
		contentPane.add(lblNewLabel);
		
		JCheckBox ckMamiferos = new JCheckBox("Mamíferos");
		ckMamiferos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ckMamiferos.setBounds(21, 150, 97, 23);
		contentPane.add(ckMamiferos);
		
		JCheckBox ckReptil = new JCheckBox("Répteis");
		ckReptil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ckReptil.setBounds(139, 150, 97, 23);
		contentPane.add(ckReptil);
		
		JCheckBox ckAnfibios = new JCheckBox("Anfíbios");
		ckAnfibios.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ckAnfibios.setBounds(247, 150, 97, 23);
		contentPane.add(ckAnfibios);
		
		JCheckBox ckPeixes = new JCheckBox("Peixes");
		ckPeixes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ckPeixes.setBounds(364, 150, 97, 23);
		contentPane.add(ckPeixes);
		
		JCheckBox ckAves = new JCheckBox("Aves");
		ckAves.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ckAves.setBounds(483, 150, 97, 23);
		contentPane.add(ckAves);
		
		JLabel lbDataVal = new JLabel("Data de Validade");
		lbDataVal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbDataVal.setBounds(679, 67, 116, 14);
		contentPane.add(lbDataVal);
		
		tfDataValid = new JTextField();
		tfDataValid.setBounds(784, 66, 97, 20);
		contentPane.add(tfDataValid);
		tfDataValid.setColumns(10);
		
		JLabel lbClassiicacao = new JLabel("Classificação:");
		lbClassiicacao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbClassiicacao.setBounds(21, 204, 105, 14);
		contentPane.add(lbClassiicacao);
		
		JRadioButton rbAlimento = new JRadioButton("Alimento");
		rbAlimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbAlimento.setBounds(17, 241, 109, 23);
		contentPane.add(rbAlimento);
		
		JRadioButton rbVestimenta = new JRadioButton("Vestimenta");
		rbVestimenta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbVestimenta.setBounds(139, 241, 109, 23);
		contentPane.add(rbVestimenta);
		
		JRadioButton rbAcessorio = new JRadioButton("Acessório");
		rbAcessorio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbAcessorio.setBounds(253, 241, 109, 23);
		contentPane.add(rbAcessorio);
		
		JRadioButton rbMedicamento = new JRadioButton("Medicamentos");
		rbMedicamento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbMedicamento.setBounds(364, 241, 109, 23);
		contentPane.add(rbMedicamento);
		
		JRadioButton rbHigBel = new JRadioButton("Higiene e Beleza");
		rbHigBel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbHigBel.setBounds(483, 241, 126, 23);
		contentPane.add(rbHigBel);
		
		ButtonGroup classificacao = new ButtonGroup();
		
		classificacao.add(rbAlimento);
		classificacao.add(rbVestimenta);
		classificacao.add(rbAcessorio);
		classificacao.add(rbMedicamento);
		classificacao.add(rbHigBel);
		
		
		JButton btCadastrarProd = new JButton("Cadastrar");
		btCadastrarProd.setBackground(new Color(184, 185, 245));
		btCadastrarProd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btCadastrarProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabelaM = (DefaultTableModel) tabela.getModel();
				
				
				String nome = tfNomeProduto.getText();
				String codigo = tfCodigo.getText();
				String preco = tfPreco.getText();
				String quant = tfQuantidade.getText();
				
				String uniMedida = (String) cbUniMed.getSelectedItem();
				String marca = tfMarca.getText();
				String dataValid = tfDataValid.getText();
				String classificacao2 = "";
				String grupoAlvo = "";
				
				if (linhaAlt >= 0) {
					
					linhaAlt = -1;
					
				} else {
					if (rbAlimento.isSelected()) {
						classificacao2 = rbAlimento.getText();
					}
					if (rbVestimenta.isSelected()) {
						classificacao2 = rbVestimenta.getText();
					}
					if (rbAcessorio.isSelected()) {
						classificacao2 = rbAcessorio.getText();
					}
					if (rbMedicamento.isSelected()) {
						classificacao2 = rbMedicamento.getText();
					}
					if (rbHigBel.isSelected()) {
						classificacao2 = rbHigBel.getText();
					}
					
					if (ckMamiferos.isSelected()) {
						grupoAlvo = ckMamiferos.getText();
					} else if(ckReptil.isSelected()) {
						grupoAlvo = ckReptil.getText();
					} else if(ckAnfibios.isSelected()) {
						grupoAlvo = ckAnfibios.getText();
					} else if(ckPeixes.isSelected()) {
						grupoAlvo = ckPeixes.getText();
					} else if(ckAves.isSelected()) {
						grupoAlvo = ckAves.getText();
					}
					
					Object[] informacoes  = {nome, codigo, preco, quant, uniMedida, marca, dataValid, classificacao2, grupoAlvo};
					
					tabelaM.addRow(informacoes);
					
					
					limpaCampos(ckMamiferos, ckReptil, ckAnfibios, ckPeixes, ckAves, classificacao);
					
				}
				
			}
		});
		btCadastrarProd.setBounds(122, 663, 109, 23);
		contentPane.add(btCadastrarProd);
		
		JList list = new JList();
		list.setBounds(343, 345, 1, 1);
		contentPane.add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 302, 862, 307);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Nome", "Código", "Preço(R$)", "Quantidade", "Uni. de Med.", "Marca", "Data de Valid.", "Classificação", "Grupo Alvo"
			}
		));
		scrollPane.setViewportView(tabela);
		
		
		
		tabela.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				
				if (tabela.getSelectedRow() != -1) {
					
					tfNomeProduto.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
					tfCodigo.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
					tfPreco.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
					tfQuantidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
					tfMarca.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
					cbUniMed.setSelectedItem(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
					tfDataValid.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
					
					if ((tabela.getValueAt(tabela.getSelectedRow(), 7).toString()).equals("Alimento")) {
						rbAlimento.setSelected(true);
					}
					else if ((tabela.getValueAt(tabela.getSelectedRow(), 7).toString()).equals("Vestimenta")) {
						rbVestimenta.setSelected(true);
					}
					else if ((tabela.getValueAt(tabela.getSelectedRow(), 7).toString()).equals("Acessório")) {
						rbAcessorio.setSelected(true);
					}
					else if ((tabela.getValueAt(tabela.getSelectedRow(), 7).toString()).equals("Medicamentos")) {
						rbMedicamento.setSelected(true);
					}
					else if ((tabela.getValueAt(tabela.getSelectedRow(), 7).toString()).equals("Higiene e Beleza")) {
						rbHigBel.setSelected(true);
					}
					
					
					
					if ((tabela.getValueAt(tabela.getSelectedRow(), 8).toString()).equals("Mamíferos")) {
						ckMamiferos.setSelected(true);
					}
					else if ((tabela.getValueAt(tabela.getSelectedRow(), 8).toString()).equals("Répteis")) {
						ckReptil.setSelected(true);
					}
					else if ((tabela.getValueAt(tabela.getSelectedRow(), 8).toString()).equals("Anfíbios")) {
						ckAnfibios.setSelected(true);
					}
					else if ((tabela.getValueAt(tabela.getSelectedRow(), 8).toString()).equals("Peixes")) {
						ckPeixes.setSelected(true);
					}
					else if ((tabela.getValueAt(tabela.getSelectedRow(), 8).toString()).equals("Aves")) {
						ckAves.setSelected(true);
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Selecione uma opção", "Atenção", JOptionPane.WARNING_MESSAGE);
				}
				
			}
			
			
		});
		
		
		
		
		
		JButton btAlterar = new JButton("Alterar");
		btAlterar.setBackground(new Color(184, 185, 245));
		btAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tabela.getSelectedRow() != -1) {
					
					tabela.setValueAt(tfNomeProduto.getText(), tabela.getSelectedRow(), 0);
					tabela.setValueAt(tfCodigo.getText(), tabela.getSelectedRow(), 1);
					tabela.setValueAt(tfPreco.getText(), tabela.getSelectedRow(), 2);
					tabela.setValueAt(tfQuantidade.getText(), tabela.getSelectedRow(), 3);
					tabela.setValueAt(cbUniMed.getSelectedItem(), tabela.getSelectedRow(), 4);
					tabela.setValueAt(tfMarca.getText(), tabela.getSelectedRow(), 5);
					tabela.setValueAt(tfDataValid.getText(), tabela.getSelectedRow(), 6);
					
					if(rbAlimento.isSelected()) {
						tabela.setValueAt(rbAlimento.getText(), tabela.getSelectedRow(), 7);
					}
					else if(rbVestimenta.isSelected()) {
						tabela.setValueAt(rbVestimenta.getText(), tabela.getSelectedRow(), 7);
					}
					else if(rbAcessorio.isSelected()) {
						tabela.setValueAt(rbAcessorio.getText(), tabela.getSelectedRow(), 7);
					}
					else if(rbMedicamento.isSelected()) {
						tabela.setValueAt(rbMedicamento.getText(), tabela.getSelectedRow(), 7);
					}
					else if(rbHigBel.isSelected()) {
						tabela.setValueAt(rbHigBel.getText(), tabela.getSelectedRow(), 7);
					}
					
					if (ckMamiferos.isSelected()) {
						tabela.setValueAt(ckMamiferos.getText(), tabela.getSelectedRow(), 8);
					}
					else if (ckReptil.isSelected()) {
						tabela.setValueAt(ckReptil.getText(), tabela.getSelectedRow(), 8);
					}
					else if (ckAnfibios.isSelected()) {
						tabela.setValueAt(ckAnfibios.getText(), tabela.getSelectedRow(), 8);
					}
					else if (ckPeixes.isSelected()) {
						tabela.setValueAt(ckPeixes.getText(), tabela.getSelectedRow(), 8);
					}
					else if (ckAves.isSelected()) {
						tabela.setValueAt(ckAves.getText(), tabela.getSelectedRow(), 8);
					}
					
					limpaCampos(ckMamiferos, ckReptil, ckAnfibios, ckPeixes, ckAves, classificacao);
					
				}
				
			}
		});
		
		btAlterar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btAlterar.setBounds(407, 664, 85, 21);
		contentPane.add(btAlterar);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.setBackground(new Color(184, 185, 245));
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int linhaSelecionada = tabela.getSelectedRow();
				
				if (linhaSelecionada >= 0) {
					tabelaM.removeRow(linhaSelecionada);
				}
				else {
					JOptionPane.showMessageDialog(null, "Selecione uma linha para Excluir!");
				}
				
				limpaCampos(ckMamiferos, ckReptil, ckAnfibios, ckPeixes, ckAves, classificacao);
				
			}
		});
		btExcluir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btExcluir.setBounds(640, 664, 85, 21);
		contentPane.add(btExcluir);
		
	}
	
	public void limpaCampos(JCheckBox ckMamiferos, JCheckBox ckReptil, JCheckBox ckAnfibios, JCheckBox ckPeixes,
			JCheckBox ckAves, ButtonGroup classificacao) {
		tfNomeProduto.setText("");
		tfCodigo.setText("");
		tfPreco.setText("");
		tfQuantidade.setText("");
		tfMarca.setText("");
		tfDataValid.setText("");
		classificacao.clearSelection();
		ckReptil.setSelected(false);
		ckMamiferos.setSelected(false);
		ckAnfibios.setSelected(false);
		ckPeixes.setSelected(false);
		ckAves.setSelected(false);
	}
}
