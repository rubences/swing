import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Frame10 extends JFrame implements ActionListener {
    private JPanel panel = new JPanel(); private JButton azul, rosa, amarillo, verde;
    public Frame10() { 
        setTitle("Hola!!!"); 
        setSize(500, 400);
        addWindowListener(new manejador10()); 
        Container contentpane = getContentPane(); 
        panel.setLayout(new BorderLayout());
        azul = new JButton("Azul"); 
        azul.addActionListener(this); 
        Dimension d = new Dimension(); 
        d.height = 40;
        d.width = 100; azul.setPreferredSize(d);
        verde = new JButton("Verde"); verde.addActionListener(this); verde.setPreferredSize(d);
        amarillo = new JButton("Amarillo"); amarillo.addActionListener(this); amarillo.setPreferredSize(d);
        // Removed invalid line
        rosa = new JButton("Rosa"); rosa.addActionListener(this); rosa.setPreferredSize(d); panel.add(azul, BorderLayout.SOUTH); panel.add(verde, BorderLayout.NORTH); panel.add(amarillo, BorderLayout.EAST); panel.add(rosa, BorderLayout.WEST);
        contentpane.add(panel); panel.setBackground(Color.red);
    }
    @Override
    public void actionPerformed(ActionEvent e) { Object source = e.getSource();
    if (source == azul) { panel.setBackground(Color.blue);
    }
    if (source == verde) { panel.setBackground(Color.green);
    }
    if (source == amarillo) { panel.setBackground(Color.yellow);
    }
    if (source == rosa) { panel.setBackground(Color.pink);
    }
        
    }
}
