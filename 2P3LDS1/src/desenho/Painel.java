package desenho;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class Painel extends JPanel {

    public Painel() {
        this.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawLine(100, 300, 500, 20);
        g.setColor(Color.GREEN);
        g.drawRect(200, 200, 300, 300);
        g.fillRect(200, 200, 300, 300);
        g.drawArc(100, 60, 300, 150, 30, 300);

        Polygon p = new Polygon();
        p.addPoint(300, 50);
        p.addPoint(450, 350);
        p.addPoint(150, 350);

        g.drawPolygon(p);

    }

}
