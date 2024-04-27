package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class Tela {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Turma 2P3LDS1...");

        JPanel painel = new JPanel();
        painel.setBackground(new Color(147, 219, 237));
        painel.setLayout(new BorderLayout());
        JPanel painelTitulo = new JPanel();
        painelTitulo.setBackground(new Color(232, 222, 200));

        JPanel painel3 = new JPanel();
        painelTitulo.setBackground(new Color(232, 222, 200));

        JLabel tit = new JLabel("Título do formulário");
        tit.setFont(new Font("sanserif", Font.ITALIC, 30));
        painelTitulo.add(tit);

        JButton primeiro = new JButton("Primeiro");
        JButton segundo = new JButton("Segundo");

        segundo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int res = JOptionPane.showConfirmDialog(null, "Tem certeza?");

            }

        });

        painel3.add(primeiro);
        painel3.add(segundo);

        painel.add(BorderLayout.NORTH, painelTitulo);

        painel.add(BorderLayout.SOUTH, painel3);

        janela.add(painel);
        janela.setSize(600, 500);
        janela.setVisible(true);
    }
}
