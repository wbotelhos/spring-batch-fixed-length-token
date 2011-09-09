package br.com.wbotelhos.spring.batch.model;

import java.util.Date;

public class Pagamento {

	private String depositante;
	private int codigo;
	private String tipo;
	private Date data;
	private Double valor;
	private String comentario;

	public String getDepositante() {
		return depositante;
	}

	public void setDepositante(String depositante) {
		this.depositante = depositante;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Pagamento [depositante=" + depositante + ", codigo=" + codigo + ", tipo=" + tipo + ", data=" + data + ", valor=" + valor + ", comentario=" + comentario + "]";
	}

}