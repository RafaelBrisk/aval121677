package meusistema.main;

import java.math.BigDecimal;

public class Produto {
	
	private Long id;
	
	private String nome;
	
	private BigDecimal valor;
	
	private String dataVencimanto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDataVencimanto() {
		return dataVencimanto;
	}

	public void setDataVencimanto(String dataVencimanto) {
		this.dataVencimanto = dataVencimanto;
	}
	
}
