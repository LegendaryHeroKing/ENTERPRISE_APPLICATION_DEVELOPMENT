package br.com.fiap.beans;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ContaCorrente extends Conta {
	
	private TipoConta tipo;

	public ContaCorrente() {
		super();
		
	}

	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	
	public void retirar(double valor) throws Exception{
		if(saldo-valor<0 && tipo==TipoConta.COMUM) {
			throw new Exception();
		}
			this.saldo-=valor;
		
		
}
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "número "+getNumero()+"\n"+
		       "Agencia "+getAgencia()+"\n"+
		       "tipo Conta "+tipo+"\n"+
		       "saldo "+saldo+"\n"+
		       "data abertura "+sdf.format(getDataAbertura().getTime());
	}
	
	
	

}
