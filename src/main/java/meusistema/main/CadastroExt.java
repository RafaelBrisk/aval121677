package meusistema.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.List;

import javax.swing.JOptionPane;

import meusistema.cadastro.Cadastro;

public class CadastroExt extends Cadastro {
	
	private Produto selecionado;
	private Model modelo;
	private List<Produto> lista;

	public CadastroExt() {
		configuraTabela();
		configuraBotoes();
	}
	

	private void configuraTabela() {
		ProdutoDao produtoDao = new ProdutoDao();
		lista = produtoDao.getAll();
		
		modelo = new Model(lista);
		
		super.table.setModel(modelo);
		
		super.table.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					int idx = table.getSelectedRow();
					if (idx < 0) {
						System.out.println("Não há linha selecionada");
					} else {
						carregarLinha(idx);
					}
				}
			}
		});
	}


	private void configuraBotoes() {
		super.btnSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				salvar();
			}
		});
		
		super.btnDeletar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				deletar();
			}
		});
		
		super.btnCancelar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
	}


	protected void limparCampos() {
		super.nome.setText("");
		super.valor.setText("");
		super.dataVencimento.setText("");
	}


	protected void deletar() {
		if (selecionado == null) {
			JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
		} else {
			ProdutoDao produtoDao = new ProdutoDao();
			produtoDao.deletar(selecionado.getId());
			
			fireTable();
		}
	}


	protected void salvar() {
		ProdutoDao produtoDao = new ProdutoDao();
		if (selecionado != null) {
			
			selecionado.setNome(super.nome.getText().trim());
			selecionado.setValor(new BigDecimal(super.valor.getText().trim()));
			selecionado.setDataVencimanto(super.dataVencimento.getText().trim());
			
			produtoDao.atualizar(selecionado);
		} else {
			Produto p = new Produto();
			p.setNome(super.nome.getText().trim());
			p.setValor(new BigDecimal(super.valor.getText().trim()));
			p.setDataVencimanto(super.dataVencimento.getText().trim());
			
			produtoDao.inserir(p);
		}
		
		fireTable();
	}
	
	private void fireTable() {
		ProdutoDao produtoDao = new ProdutoDao();
		lista = produtoDao.getAll();
		modelo.setLista(lista);
		modelo.fireTableDataChanged();
	}
	
	protected void carregarLinha(int idx) {
		Produto p = this.modelo.getProduto(idx);
		this.selecionado = p;
		
		super.nome.setText(p.getNome());
		super.valor.setText(String.valueOf(p.getValor()));
		super.dataVencimento.setText(p.getDataVencimanto());
		
	}
	
}
