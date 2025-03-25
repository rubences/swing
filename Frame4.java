import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame4 extends JFrame {
	public Frame4() {
		setTitle("Hola!!!");
		setSize(300, 200);
		addWindowListener(new manejador4());
		Container contentpane = getContentPane();
		JPanel panel = new JPanel();
		contentpane.add(panel);
		panel.setBackground(Color.red);
	}
}
