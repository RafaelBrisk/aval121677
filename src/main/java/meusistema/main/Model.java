package meusistema.main;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class Model extends AbstractTableModel {
	
	private List<Produto> lista;
	
	public Model(List<Produto> lista) {
		this.lista = lista;
	}
	
	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}

	public int getColumnCount() {
		return Produto.class.getDeclaredFields().length;
	}

	public int getRowCount() {
		return lista.size();
	}

	public Object getValueAt(int r, int c) {
		
		switch (c) {
		case 0:
			return lista.get(r).getId();
		case 1:
			return lista.get(r).getNome();
		case 2:
			return lista.get(r).getValor();
		case 3:
			return lista.get(r).getDataVencimanto();
		}
		
		return null;
	}

	@Override
	public String getColumnName(int c) {

		switch (c) {
		case 0:
			return "id";
		case 1:
			return "nome";
		case 2:
			return "valor";
		case 3:
			return "data";
		}
		
		return null;
		
	}
	
	public Produto getProduto(int idx) {
		return lista.get(idx);
	}

}
