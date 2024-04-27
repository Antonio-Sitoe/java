/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeii.Controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import testeii.Model.Candidato;
import testeii.Model.Municipio;
import testeii.Model.Voto;

public class ContagemDeVotos {

    DB database = new DB();
    ArrayList candidatos = new ArrayList<Candidato>();

    public void atualizaJtable(JTable JTable1, String itemSelecionado) {
        var novoArray = this.filterCandidatos(itemSelecionado);

        DefaultTableModel model = (DefaultTableModel) JTable1.getModel();

        if (novoArray != null) {
            model.setNumRows(0);
            novoArray.forEach(data -> {
                model.addRow(new Object[] { data.getNome(), data.getBI(), data.getVotos(),
                        data.municipio.getNome() });
            });
        }
    }

    public double VotarUmCandidato(Candidato canditadoAreceberOvoto) {
        canditadoAreceberOvoto.setVotos(false, true);
        database.atualizar(canditadoAreceberOvoto);
        return canditadoAreceberOvoto.getVotos();
    }

    public double VotoNulo(Candidato canditadoAreceberOvoto) {
        System.out.println("Candidato a receber votot nulo" + canditadoAreceberOvoto);
        canditadoAreceberOvoto.setVotos(true, false);
        database.atualizar(canditadoAreceberOvoto);
        return canditadoAreceberOvoto.getVotos();
    }

    public ArrayList<Candidato> filterCandidatos(String itemSelecionado) {
        ArrayList<Candidato> candidatos = database.getDados();
        ArrayList<Candidato> candidtosFiltrados = new ArrayList<Candidato>();

        if (candidatos == null) {
            return null;
        }

        for (Candidato candidato : candidatos) {
            if (candidato.municipio.getNome().equals(itemSelecionado)) {
                candidtosFiltrados.add(candidato);
            }
        }

        return candidtosFiltrados;
    }

    public void setCandidatos(String nome, double bi, String municipie) {
        Municipio Municipio = this.CriaMunicipio(municipie);

        Candidato candidatoApresidente = new Candidato(nome, bi, Municipio);
        candidatos.add(candidatoApresidente);
        try {
            var n = database.salvar(candidatoApresidente);
            System.out.println(n);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public Municipio CriaMunicipio(String nome) {

        Municipio Municipio = new Municipio();
        Municipio.setNome(nome);

        return Municipio;
    }

    private void abirPainelDeCanditos(ArrayList<Candidato> listaObjetos) {
        // Criando o modelo da tabela
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nome");
        model.addColumn("Numero de BI");
        model.addColumn("Votos");
        model.addColumn("Municipio");
        model.setRowCount(0);

        // Preenchendo o modelo com os dados da lista de objetos
        for (Candidato objeto : listaObjetos) {
            model.addRow(
                    new Object[] { objeto.getNome(), objeto.getBI(), objeto.getVotos(), objeto.municipio.getNome() });
        }

        JTable table = new JTable(model);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(new JScrollPane(table));
        frame.pack();
        frame.setVisible(true);
    }

    public void mostrarCandidatos() {
        ArrayList<Candidato> CANDIDATOSLIDOS = database.getDados();
        System.out.println(CANDIDATOSLIDOS);
        abirPainelDeCanditos(CANDIDATOSLIDOS);
    }

    public Candidato mostrarOCandidato(String nome) {
        ArrayList<Candidato> candidatos = database.getDados();
        Candidato candidatofiltrado = null;
        for (Candidato candidato : candidatos) {
            if (candidato.getNome().equals(nome)) {
                candidatofiltrado = candidato;
            }
        }
        return candidatofiltrado;
    }

    public double totaldevotosSegundoUmMunicipio(String nomeMunicipio) {
        ArrayList<Candidato> CANDIDATOSLIDOS = database.getDados();
        double todosVotados = 0;
        for (Candidato candidato : CANDIDATOSLIDOS) {
            if (candidato.municipio.getNome().equals(nomeMunicipio)) {
                System.out.println(candidato.municipio.getQuantidadeDeRecenciado());
                todosVotados = todosVotados + candidato.getVotos();
            }
        }
        return todosVotados;
    }

    public double totaldevotosbranco() {
        try {
            ArrayList<Candidato> CANDIDATOSLIDOS = database.getDados();
            double todosVotados = 0;
            for (Candidato candidato : CANDIDATOSLIDOS) {
                for (Voto voto : candidato.votosTotal()) {
                    System.out.println(voto.isNull);
                    if (voto.isNull) {
                        todosVotados = todosVotados + 1;
                    }
                }
            }
            return todosVotados;
        } catch (Exception e) {
            System.out.println("Erro");
            return 0;
        }
    }

}
