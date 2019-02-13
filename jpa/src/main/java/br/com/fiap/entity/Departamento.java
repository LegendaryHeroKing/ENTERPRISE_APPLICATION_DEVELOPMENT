package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_DEPARTAMENTO")
@SequenceGenerator(name="dep",sequenceName="SQ_T_DEPARTAMENTO",allocationSize=1)
public class Departamento {
	
	@Id
	@Column(name="cd_departamento",nullable=false)
	@GeneratedValue(generator="dep",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_departamento",nullable=true)
	private String nome;
	
	@Column(name="dt_criacao",nullable=true,updatable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dataCriacao;
	
	@Column(name="ds_tipo",nullable=true)
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	@Column(name="vl_orcamento",nullable=true)
	private double orcamento;
	
	@Column(name="fl_contrato",nullable=true)
	private byte contrato;

	
	
	
	
	public Departamento(String nome, Calendar dataCriacao, Tipo tipo, double orcamento, byte contrato) {
		super();
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.tipo = tipo;
		this.orcamento = orcamento;
		this.contrato = contrato;
	}
	
	
	

	public Departamento() {
		super();
	}




	public Departamento(int codigo, String nome, Tipo tipo, double orcamento, byte contrato) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
		this.orcamento = orcamento;
		this.contrato = contrato;
	}




	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}

	public byte getContrato() {
		return contrato;
	}

	public void setContrato(byte contrato) {
		this.contrato = contrato;
	}
	
	

}
