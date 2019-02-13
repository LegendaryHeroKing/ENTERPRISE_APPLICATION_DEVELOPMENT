package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;
import br.com.fiap.entity.Nivel;

public class Teste {
	//Criar a fabrica de entity Manager
	public static void main (String[] args) {
	//criando a fabrica de entendide(criar as tabelas)
	EntityManagerFactory f = Persistence.createEntityManagerFactory("cliente");
	/// criar gerenciador de entidades(crud)
	EntityManager em = f.createEntityManager();
	
	//cadastro
	Funcionario func = new Funcionario("Humberto",
			1000,
			new GregorianCalendar(2010,Calendar.APRIL,2),
			null,
			Nivel.ESTAGIO);
	em.persist(func);
	em.getTransaction().begin();
	em.getTransaction().commit();
	
	//pesquisa por codigo
   Funcionario busca = em.find(Funcionario.class, 1);
   System.out.println(busca);
	
   // atualizacao
   busca.setNome("Rodrigo");
   em.getTransaction().begin();
   em.getTransaction().commit();
   
   Funcionario atualizacao = new Funcionario(3,"Alice",10000,Calendar.getInstance(),null,Nivel.SENIOR);
   em.merge(atualizacao);
   em.getTransaction().begin();
   em.getTransaction().commit();
   
   //remocao
   Funcionario remove = em.find(Funcionario.class, 5);
   em.remove(remove);
   em.getTransaction().begin();
   em.getTransaction().commit();
	
 
   
	em.close();
	f.close();
	}
}
