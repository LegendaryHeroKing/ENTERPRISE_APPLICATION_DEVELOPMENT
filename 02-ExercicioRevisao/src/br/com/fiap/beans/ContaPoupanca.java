package br.com.fiap.beans;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento {

	private float taxa; 
	
	public static final float RENDIMENTO=0.5f; 
	


	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
		super(agencia, numero, dataAbertura, saldo);
		this.taxa = taxa;
	}
	
	

	public ContaPoupanca() {
		super();
	}



	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public static float getRendimento() {
		return RENDIMENTO;
	}
	
	
		public void retirar(double valor) throws Exception{
			if(saldo-(valor+taxa)<0) {
				throw new Exception();
			}else {
				this.saldo-=(valor+taxa);
			}
			
	}
		public double calcularRetornoInvestimento() {
			return saldo*RENDIMENTO;
		}
	

}
