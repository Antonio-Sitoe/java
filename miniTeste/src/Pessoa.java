import java.util.ArrayList;
import java.util.Scanner;
public class Pessoa {
	private String nome, genero;
	private int idade;
    public Pessoa pai;
    public Pessoa mae;
	private ArrayList<String> listFilhos= new ArrayList<>();
    
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

	public  ArrayList<String> getListNomes(){
		return listFilhos;
	}
	public  ArrayList<String> setListNomes(String nome){
		listFilhos.add(nome);
		return listFilhos;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", genero=" + genero + ", idade=" + idade + ", pai=" + pai + ", mae=" + mae
				+ "]";
	}
     public static void mostrarFilhos(ArrayList<Pessoa> pessoas, Pessoa pai) {
		for(Pessoa pessoa:pessoas ){

			if(pessoa.getPai() != null){
				if(pessoa.getPai().getNome() == pai.getPai().getNome()){
					System.out.println(pessoa.getNome());
				}
			}
		}
	 }
	
}
