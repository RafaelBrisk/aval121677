package meusistema.main;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Produto {
	
	private Long id;
	
	private String nome;
	
	private BigDecimal valor;
	
	private LocalDateTime dataVencimanto;

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

	public LocalDateTime getDataVencimanto() {
		return dataVencimanto;
	}

	public void setDataVencimanto(LocalDateTime dataVencimanto) {
		this.dataVencimanto = dataVencimanto;
	}
	
}
