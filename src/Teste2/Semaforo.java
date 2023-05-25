package Teste2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Semaforo extends JPanel {

	
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        Color red = Color.RED;
        Color yellow = Color.YELLOW;
        Color green = Color.GREEN;
        
        int width = 100;
        int height = 300;
        
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);
        
        g.setColor(red);
        g.fillOval(20, 20, 60, 60);
        
        g.setColor(yellow);
        g.fillOval(20, 100, 60, 60);
        
        g.setColor(green);
        g.fillOval(20, 180, 60, 60);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Semaforo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(120, 340);
        
        Semaforo semaforo = new Semaforo();
        frame.add(semaforo);
        
        frame.setVisible(true);
    }
}

