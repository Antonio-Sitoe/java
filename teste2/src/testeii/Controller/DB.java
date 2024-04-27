/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeii.Controller;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import testeii.Model.Candidato;

public class DB {
    private ArrayList<Candidato> dados;

    public DB() {
        this.dados = new ArrayList<>();
        this.setDados(this.refresh());
    }

    public boolean salvar(Candidato candidato) {
        ArrayList<Candidato> todos = refresh();
        this.apagarCriar();
        try {
            FileOutputStream file = new FileOutputStream("candidatos.txt");
            ObjectOutputStream obj = new ObjectOutputStream(file);
            todos.add(candidato);
            obj.writeObject(todos);
            obj.flush();
            obj.close();
            this.setDados(this.refresh());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void apagarCriar() {
        File file = new File("candidatos.txt");
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("Erro ao criar ficheiro");
        }
    }

    public boolean substituir(int indice, Candidato novoCandidato) {
        ArrayList<Candidato> todos = refresh();

        if (indice >= 0 && indice < todos.size()) {
            todos.remove(indice);
            todos.add(indice, novoCandidato);
            apagarCriar();
            try {
                FileOutputStream file = new FileOutputStream("Candidato.txt");
                ObjectOutputStream obj = new ObjectOutputStream(file);
                obj.writeObject(todos);
                obj.flush();
                obj.close();
                this.setDados(this.refresh());
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    public boolean atualizar(Candidato candidato) {
        ArrayList<Candidato> todos = refresh();
        this.remover(todos, candidato.getNome());
        this.apagarCriar();
        try {
            FileOutputStream file = new FileOutputStream("candidatos.txt");
            ObjectOutputStream obj = new ObjectOutputStream(file);
            todos.add(candidato);
            obj.writeObject(todos);
            obj.flush();
            obj.close();
            this.setDados(this.refresh());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Candidato> refresh() {
        ArrayList<Candidato> todos = new ArrayList<>();
        try {
            FileInputStream f = new FileInputStream("candidatos.txt");
            ObjectInputStream objStream = new ObjectInputStream(f);

            todos = (ArrayList<Candidato>) objStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException eo) {

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.out.println("hhghj");
        }
        return todos;
    }

    public boolean remover(Candidato candidato) {
        ArrayList<Candidato> todos = refresh();
        this.remover(todos, candidato.getNome());
        this.apagarCriar();
        try {
            FileOutputStream file = new FileOutputStream("candidatos.txt");
            ObjectOutputStream obj = new ObjectOutputStream(file);
            obj.writeObject(todos);
            obj.flush();
            obj.close();
            this.setDados(this.refresh());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean remover(ArrayList<Candidato> todos, String num) {
        for (Candidato candidato : todos) {
            if (candidato.getNome().equalsIgnoreCase(num)) {
                return todos.remove(candidato);
            }
        }
        return false;
    }

    public Candidato pesquisar(String num) {
        for (Candidato candidato : this.getDados()) {
            if (candidato.getNome().equalsIgnoreCase(num)) {
                return candidato;
            }
        }
        return null;
    }

    public ArrayList<Candidato> ler() {
        ArrayList<Candidato> todos = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream("candidatos.txt");
            ObjectInputStream obj = new ObjectInputStream(file);
            todos = (ArrayList<Candidato>) obj.readObject();
            obj.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return todos;
    }

    public ArrayList<Candidato> getDados() {
        return this.ler();
    }

    public void setDados(ArrayList<Candidato> dados) {
        this.dados = dados;
    }
}
