package br.com.wbotelhos.spring.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.wbotelhos.spring.batch.dao.PagamentoDAO;
import br.com.wbotelhos.spring.batch.model.Pagamento;

@Component("itemWriter")
public class PagamentoWriter implements ItemWriter<Pagamento> {

	@Autowired
	private PagamentoDAO pagamentoDAO;

	public void write(List<? extends Pagamento> pagamentos) throws Exception {
		for (Pagamento pagamento : pagamentos) {
			pagamentoDAO.salvar(pagamento);
		}
	}

}