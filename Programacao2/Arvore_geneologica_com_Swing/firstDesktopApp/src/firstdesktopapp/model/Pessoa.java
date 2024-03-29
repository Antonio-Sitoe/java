/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstdesktopapp.model;

/**
 *
 * @author antoniositoe
 */
import java.util.ArrayList;
public class Pessoa {
	private String nome, genero;
	private int idade;
        public Pessoa pai;
        public Pessoa mae;
    
    public Pessoa(String nome, int idade, String genero,Pessoa pai,Pessoa mae) {
    	this.nome=nome;
    	this.idade=idade;
    	this.genero=genero;
    	this.pai=pai;
    	this.mae=mae;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Pessoa getPai() {
		return pai;
	}

	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public Pessoa getMae() {
		return mae;
	}

	public void setMae(Pessoa mae) {
		this.mae = mae;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", genero=" + genero + ", idade=" + idade + ", pai=" + pai + ", mae=" + mae
				+ "]";
	}

	
}