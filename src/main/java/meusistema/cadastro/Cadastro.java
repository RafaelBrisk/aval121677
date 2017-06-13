package meusistema.cadastro;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Cadastro extends JPanel {

	private static final long serialVersionUID = -8130237880716977449L;
	protected JTextField nome;
	protected JTextField valor;
	protected JTextField dataVencimento;
	protected JTable table;
	protected JButton btnSalvar;
	protected JButton btnDeletar;
	protected JButton btnCancelar;

	public Cadastro() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		add(lblNome, gbc_lblNome);
		
		nome = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		add(nome, gbc_textField);
		nome.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		GridBagConstraints gbc_lblValor = new GridBagConstraints();
		gbc_lblValor.insets = new Insets(0, 0, 5, 5);
		gbc_lblValor.gridx = 0;
		gbc_lblValor.gridy = 1;
		add(lblValor, gbc_lblValor);
		
		valor = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		add(valor, gbc_textField_1);
		valor.setColumns(10);
		
		JLabel lblDataVencimento = new JLabel("Data Vencimento");
		GridBagConstraints gbc_lblDataVencimento = new GridBagConstraints();
		gbc_lblDataVencimento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataVencimento.gridx = 0;
		gbc_lblDataVencimento.gridy = 2;
		add(lblDataVencimento, gbc_lblDataVencimento);
		
		dataVencimento = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		add(dataVencimento, gbc_textField_2);
		dataVencimento.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.anchor = GridBagConstraints.EAST;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 1;
		gbc_btnCancelar.gridy = 3;
		add(btnCancelar, gbc_btnCancelar);
		
		btnSalvar = new JButton("Salvar");		
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 5, 5);
		gbc_btnSalvar.gridx = 2;
		gbc_btnSalvar.gridy = 3;
		add(btnSalvar, gbc_btnSalvar);
		
		btnDeletar = new JButton("Deletar");
		GridBagConstraints gbc_btnDeletar = new GridBagConstraints();
		gbc_btnDeletar.insets = new Insets(0, 0, 5, 0);
		gbc_btnDeletar.gridx = 3;
		gbc_btnDeletar.gridy = 3;
		add(btnDeletar, gbc_btnDeletar);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 4;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}

}
