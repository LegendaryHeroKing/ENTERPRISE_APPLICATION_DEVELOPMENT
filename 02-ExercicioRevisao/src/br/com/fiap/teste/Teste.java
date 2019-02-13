package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.beans.ContaCorrente;
import br.com.fiap.beans.ContaPoupanca;
import br.com.fiap.beans.TipoConta;

public class Teste {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar data = new GregorianCalendar(2018,Calendar.DECEMBER,13);
		
		ContaPoupanca p = new ContaPoupanca(01, 01, data, 2000, 2);
        ContaCorrente c = new ContaCorrente(01, 02, data, 100.99,TipoConta.COMUM);
        
        List<ContaCorrente> lista = new ArrayList<ContaCorrente>();
        
        lista.add(new ContaCorrente(01, 99, data, 300.99,TipoConta.COMUM));
        lista.add(new ContaCorrente(01, 777, data, 111111,TipoConta.PREMIUM));
        lista.add(new ContaCorrente(97, 1810, data, 0,TipoConta.ESPECIAL));
        
        for (ContaCorrente cc : lista) {
        	System.out.println(cc);
        	
        
        	
			
		}
        
	}

}
