package desenho;

import javax.swing.JFrame;

public class Quadro extends JFrame {

    public Quadro() {
        super("Nosso Título");
        
        this.add(new Painel());

        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    
    public static void main(String[] args) {
        new Quadro();
    }

}
