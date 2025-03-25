import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;   
import javax.swing.JFrame;

public class Frame5 extends JFrame {
    public Frame5() {
        setTitle("Hola!!!");
        setSize(500, 400);
        addWindowListener(new manejador5());
        Container contentpane = getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JButton boton = new JButton();
        boton.setBounds(300, 200, 50, 90);
        panel.add(boton);
        contentpane.add(panel);
        panel.setBackground(Color.red);
    }

    public static void main(String[] args) {
        Frame5 frame = new Frame5();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
