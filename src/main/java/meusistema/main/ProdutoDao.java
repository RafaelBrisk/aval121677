package meusistema.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {
	
	private static final String SQL_SELECT = "select * from produto;";
	private static final String SQL_INSERT = "insert into produto(nome, valor, data_vencimento)values(?, ?, ?)";
	private static final String SQL_UPDATE = "update produto set nome = ?, valor = ?, data_vencimento = ? where id = ?;";
	private static final String SQL_DELETE = "delete from produto where id = ?;";
	private Connection con;

	public ProdutoDao() {
		ConexaoDB conexao = ConexaoDB.getInstace();
		con = conexao.getConexao();
	}

	public List<Produto> getAll() {
		List<Produto> retorno = new ArrayList<Produto>();
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(SQL_SELECT);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Produto p = new Produto();
				p.setId(rs.getLong(1));
				p.setNome(rs.getString(2));
				p.setValor(rs.getBigDecimal(3));
				p.setDataVencimanto(rs.getString(4));
				retorno.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return retorno;
	}
	
	public void inserir(Produto p) {
		try {
			PreparedStatement ps = con.prepareStatement(SQL_INSERT);
			ps.setString(1, p.getNome());
			ps.setBigDecimal(2, p.getValor());
			ps.setString(3, p.getDataVencimanto());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Produto p) {
		try {
			PreparedStatement ps = con.prepareStatement(SQL_UPDATE);
			ps.setString(1, p.getNome());
			ps.setBigDecimal(2, p.getValor());
			ps.setString(3, p.getDataVencimanto());
			ps.setLong(4, p.getId());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deletar(Long id) {
		try {
			PreparedStatement ps = con.prepareStatement(SQL_DELETE);
			ps.setLong(1, id);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
