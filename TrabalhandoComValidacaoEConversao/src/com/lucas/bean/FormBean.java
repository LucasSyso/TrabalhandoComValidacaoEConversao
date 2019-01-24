package com.lucas.bean;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.lucas.enumeration.Opcao;
import com.lucas.model.Endereco;

@SuppressWarnings("serial")
@Named("form") //Faz com que o CDI crie este objeto e o guarde em seu container
@RequestScoped
public class FormBean implements Serializable{
	
	private Integer numeroInteiro;
	private Double numeroDecimal;
	private Character caractere;
	private Date data;
	private Opcao opcao;
	private Endereco endereco;
	private String nome;
	private String idade;
	
	public FormBean() {
		setNumeroInteiro(1);
		setNumeroDecimal(1.1);
		setCaractere('A');
		setData(new Date());
		setOpcao(Opcao.OP_1);
		
		endereco = new Endereco();
		endereco.setRua("Odilon Araújo");
		endereco.setNumero("8");
	}
	
	public String processar() {
		System.out.println("Número inteiro: " + numeroInteiro);
		System.out.println("Número decimal: " + numeroDecimal);
		System.out.println("Caracter: " + caractere);
		System.out.println("Data: " + data);
		System.out.println("Opção: " + opcao);
		System.out.println("Endereço: " + endereco.getRua() + endereco.getNumero());
	
		return "result";
	}
	
	public Integer getNumeroInteiro() {
		return numeroInteiro;
	}
	public void setNumeroInteiro(Integer numeroInteiro) {
		this.numeroInteiro = numeroInteiro;
	}
	public Double getNumeroDecimal() {
		return numeroDecimal;
	}
	public void setNumeroDecimal(Double numeroDecimal) {
		this.numeroDecimal = numeroDecimal;
	}
	public Character getCaractere() {
		return caractere;
	}
	public void setCaractere(Character caractere) {
		this.caractere = caractere;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Opcao getOpcao() {
		return opcao;
	}
	public void setOpcao(Opcao opcao) {
		this.opcao = opcao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	
}
