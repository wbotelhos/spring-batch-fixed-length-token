package br.com.wbotelhos.spring.batch.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.wbotelhos.spring.batch.model.Pagamento;

@Repository
public class PagamentoDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(propagation = Propagation.REQUIRED)
	public void salvar(final Pagamento pagamento) {
		String sql = "insert into pagamento (depositante, codigo, tipo, data, valor, comentario) values(?, ?, ?, ?, ?, ?)";

		jdbcTemplate.update(sql, new PreparedStatementSetter() {

			public void setValues(PreparedStatement stmt) throws SQLException {
				stmt.setString(1, pagamento.getDepositante());
				stmt.setInt(2, pagamento.getCodigo());
				stmt.setString(3, pagamento.getTipo());
				stmt.setDate(4, new java.sql.Date(pagamento.getData().getTime()));
				stmt.setDouble(5, pagamento.getValor());
				stmt.setString(6, pagamento.getComentario());
			}

		});
	}

}