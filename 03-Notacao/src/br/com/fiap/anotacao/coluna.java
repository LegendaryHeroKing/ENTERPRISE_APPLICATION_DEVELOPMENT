package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//anotação estará presente até a execução
@Retention(RetentionPolicy.RUNTIME)
//onde é possivel colocar a anotação
@Target(ElementType.FIELD)
public @interface coluna {
	
	String nome();
	boolean Obrigatorio();

}
