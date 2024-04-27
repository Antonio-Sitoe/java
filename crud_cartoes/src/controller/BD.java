package controller;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.CartaoSIM;

public class BD {

    private Vector<CartaoSIM> dados;

    public BD() {
        this.dados = new Vector<>();
        this.setDados(this.refresh());
    }

    public boolean salvar(CartaoSIM card) {
        Vector<CartaoSIM> todos = refresh();
        this.apagarCriar();
        try {
            FileOutputStream file = new FileOutputStream("Cartao.txt");
            ObjectOutputStream obj = new ObjectOutputStream(file);
            todos.add(card);
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
        File file = new File("Cartao.txt");
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar ficheiro");
        }
    }

    public boolean actualizar(CartaoSIM card) {
        Vector<CartaoSIM> todos = refresh();
        this.remover(todos, card.getNumero());
        this.apagarCriar();
        try {
            FileOutputStream file = new FileOutputStream("Cartao.txt");
            ObjectOutputStream obj = new ObjectOutputStream(file);
            todos.add(card);
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

    public Vector<CartaoSIM> refresh() {
        Vector<CartaoSIM> todos = new Vector<CartaoSIM>();
        try {
            FileInputStream f = new FileInputStream("Cartao.txt");
            ObjectInputStream objStream = new ObjectInputStream(f);

            todos = (Vector<CartaoSIM>) objStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException eo) {

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return todos;
    }

    public boolean remover(CartaoSIM card) {
        Vector<CartaoSIM> todos = refresh();
        this.remover(todos, card.getNumero());
        this.apagarCriar();
        try {
            FileOutputStream file = new FileOutputStream("Cartao.txt");
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

    private boolean remover(Vector<CartaoSIM> todos, String num) {
        for (CartaoSIM g : todos) {
            if (g.getNumero().equalsIgnoreCase(num)) {
                return todos.remove(g);
            }
        }
        return false;
    }

    public CartaoSIM pesquisar(String num) {
        for (CartaoSIM a : this.getDados()) {
            if (a.getNumero().equalsIgnoreCase(num)) {
                return a;
            }
        }
        return null;
    }

    public Vector<CartaoSIM> getDados() {
        return dados;
    }

    public void setDados(Vector<CartaoSIM> dados) {
        this.dados = dados;
    }

}
