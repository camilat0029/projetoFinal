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
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class TelaCadastroProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNomeProduto;
	private JTextField tfCodigo;
	private JTextField tfPreco;
	private JTextField tfQuantidade;
	private JTextField tfMarca;
	private JTextField tfDataValid;
	
	private TabelaProdutosCadastrado produtosCad;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Camila\\Desktop\\Camila\\Design Gráfico\\Projeto Telas\\Patinha2.png"));
		setTitle("Cadastro de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNomeProduto = new JLabel("Nome do Produto");
		lbNomeProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbNomeProduto.setBounds(21, 23, 105, 14);
		contentPane.add(lbNomeProduto);
		
		tfNomeProduto = new JTextField();
		tfNomeProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfNomeProduto.setBounds(139, 21, 285, 20);
		contentPane.add(tfNomeProduto);
		tfNomeProduto.setColumns(10);
		
		JLabel lbCodigo = new JLabel("Código");
		lbCodigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbCodigo.setBounds(21, 69, 46, 14);
		contentPane.add(lbCodigo);
		
		tfCodigo = new JTextField();
		tfCodigo.setBounds(77, 66, 86, 20);
		contentPane.add(tfCodigo);
		tfCodigo.setColumns(10);
		
		JLabel lbPreco = new JLabel("Preço");
		lbPreco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbPreco.setBounds(206, 69, 46, 14);
		contentPane.add(lbPreco);
		
		tfPreco = new JTextField();
		tfPreco.setToolTipText("");
		tfPreco.setBounds(248, 66, 86, 20);
		contentPane.add(tfPreco);
		tfPreco.setColumns(10);
		
		JLabel lbQuant = new JLabel("Quantidade");
		lbQuant.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbQuant.setBounds(21, 120, 71, 14);
		contentPane.add(lbQuant);
		
		JSpinner spQuant = new JSpinner();
		spQuant.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spQuant.setBounds(201, 203, 40, 20);
		contentPane.add(spQuant);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setBounds(95, 117, 86, 20);
		contentPane.add(tfQuantidade);
		tfQuantidade.setColumns(10);
		
		JLabel lbMedidas = new JLabel("Unidade Medida");
		lbMedidas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbMedidas.setBounds(206, 120, 105, 14);
		contentPane.add(lbMedidas);
		
		JComboBox cbUniMed = new JComboBox();
		cbUniMed.setModel(new DefaultComboBoxModel(new String[] {"un", "kg", "g", "m", "cm", "mm", "L", "ml"}));
		cbUniMed.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbUniMed.setBounds(318, 117, 125, 22);
		contentPane.add(cbUniMed);
		
		JLabel lbMarca = new JLabel("Marca");
		lbMarca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbMarca.setBounds(21, 173, 46, 14);
		contentPane.add(lbMarca);
		
		tfMarca = new JTextField();
		tfMarca.setBounds(66, 170, 115, 20);
		contentPane.add(tfMarca);
		tfMarca.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Escolha o Grupo Alvo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(21, 222, 210, 14);
		contentPane.add(lblNewLabel);
		
		JCheckBox ckMamiferos = new JCheckBox("Mamíferos");
		ckMamiferos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ckMamiferos.setBounds(16, 255, 97, 23);
		contentPane.add(ckMamiferos);
		
		JCheckBox ckReptil = new JCheckBox("Répteis");
		ckReptil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ckReptil.setBounds(171, 255, 97, 23);
		contentPane.add(ckReptil);
		
		JCheckBox ckAnfibios = new JCheckBox("Anfíbios");
		ckAnfibios.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ckAnfibios.setBounds(311, 255, 97, 23);
		contentPane.add(ckAnfibios);
		
		JCheckBox ckPeixes = new JCheckBox("Peixes");
		ckPeixes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ckPeixes.setBounds(16, 297, 97, 23);
		contentPane.add(ckPeixes);
		
		JCheckBox ckAves = new JCheckBox("Aves");
		ckAves.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ckAves.setBounds(171, 297, 97, 23);
		contentPane.add(ckAves);
		
		JLabel lbDataVal = new JLabel("Data de Validade");
		lbDataVal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbDataVal.setBounds(218, 174, 116, 14);
		contentPane.add(lbDataVal);
		
		tfDataValid = new JTextField();
		tfDataValid.setBounds(327, 171, 97, 20);
		contentPane.add(tfDataValid);
		tfDataValid.setColumns(10);
		
		JLabel lbClassiicacao = new JLabel("Classificação:");
		lbClassiicacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbClassiicacao.setBounds(21, 345, 105, 14);
		contentPane.add(lbClassiicacao);
		
		JRadioButton rbAlimento = new JRadioButton("Alimento");
		rbAlimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbAlimento.setBounds(17, 380, 109, 23);
		contentPane.add(rbAlimento);
		
		JRadioButton rbVestimenta = new JRadioButton("Vestimenta");
		rbVestimenta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbVestimenta.setBounds(171, 380, 109, 23);
		contentPane.add(rbVestimenta);
		
		JRadioButton rbAcessorio = new JRadioButton("Acessório");
		rbAcessorio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbAcessorio.setBounds(315, 380, 109, 23);
		contentPane.add(rbAcessorio);
		
		JRadioButton rbMedicamento = new JRadioButton("Medicamentos");
		rbMedicamento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbMedicamento.setBounds(17, 418, 109, 23);
		contentPane.add(rbMedicamento);
		
		JRadioButton rbHigBel = new JRadioButton("Higiene e Beleza");
		rbHigBel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbHigBel.setBounds(171, 418, 126, 23);
		contentPane.add(rbHigBel);
		
		ButtonGroup classificacao = new ButtonGroup();
		
		classificacao.add(rbAlimento);
		classificacao.add(rbVestimenta);
		classificacao.add(rbAcessorio);
		classificacao.add(rbMedicamento);
		classificacao.add(rbHigBel);
		
		
		JButton btCadastrarProd = new JButton("Cadastrar");
		btCadastrarProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				produtosCad = new TabelaProdutosCadastrado();
				
				String nome = tfNomeProduto.getText();
				String codigo = tfCodigo.getText();
				String preco = tfPreco.getText();
				// int preco = Integer.parseInt(tfPreco.getText());
				
				String quant = tfQuantidade.getText();
				// int quant2 = spQuant.getValue().toString().;
				String uniMedida = (String) cbUniMed.getSelectedItem();
				String marca = tfMarca.getText();
				String dataValid = tfDataValid.getText();
				String classificacao = "";
				String grupoAlvo = "";
				
				if (rbAlimento.isSelected()) {
					classificacao = rbAlimento.getText();
				}
				if (rbVestimenta.isSelected()) {
					classificacao = rbVestimenta.getText();
				}
				if (rbAcessorio.isSelected()) {
					classificacao = rbAcessorio.getText();
				}
				if (rbMedicamento.isSelected()) {
					classificacao = rbMedicamento.getText();
				}
				if (rbHigBel.isSelected()) {
					classificacao = rbHigBel.getText();
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
				
				Object[] informacoes  = {nome, codigo, "R$ " + preco, quant, uniMedida, marca, dataValid, classificacao, grupoAlvo};
				
				produtosCad.AdicionarProdutos(informacoes);
				
				produtosCad.setVisible(true);
				
			}
		});
		btCadastrarProd.setBounds(188, 469, 109, 23);
		contentPane.add(btCadastrarProd);
		
		
		JButton btLista = new JButton("Lista");
		
		btLista.setBorderPainted(false);
		
		btLista.setBackground(new Color(216, 166, 253));
		btLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaLogin login = new TelaLogin();
				login.setVisible(true);
				
			}
		});
		btLista.setBounds(474, 53, 89, 23);
		contentPane.add(btLista);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setBackground(new Color(239, 218, 254));
		textArea.setBounds(453, 0, 120, 503);
		contentPane.add(textArea);
		
		JList list = new JList();
		list.setBounds(343, 345, 1, 1);
		contentPane.add(list);
		
	}
}
