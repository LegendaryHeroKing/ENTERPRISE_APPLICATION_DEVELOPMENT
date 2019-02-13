package br.com.fiap.beans;

import java.util.Calendar;

public abstract class Conta {
	
	private int agencia;  
	private int numero ;
	private Calendar dataAbertura; 
	protected double saldo ;
	
	
	
	
	public Conta() {
		
	}

	public Conta(int agencia, int numero, Calendar dataAbertura, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo+=valor;
	}
	
	public void retirar(double valor) throws Exception{
		if(saldo-valor<0) {
			throw new Exception();
		}else {
			this.saldo-=valor;
		}
		
		
	}

}
