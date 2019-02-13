package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//anota��o estar� presente at� a execu��o
@Retention(RetentionPolicy.RUNTIME)
//onde � possivel colocar a anota��o
@Target(ElementType.FIELD)
public @interface coluna {
	
	String nome();
	boolean Obrigatorio();

}
