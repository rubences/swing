import javax.swing.*;
import java.awt.*;
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

}
