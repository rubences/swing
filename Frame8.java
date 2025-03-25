import javax.swing.*;
import java.awt.*;

public class Frame8 extends JFrame {
    public Frame8() {
        setSize(400,250);
        Container container = this.getContentPane(); 
        container.setLayout(new BorderLayout(2,2));
        String[] borderConsts = { BorderLayout.NORTH,
        BorderLayout.SOUTH, BorderLayout.EAST, BorderLayout.WEST, BorderLayout.CENTER };
        String[] buttonNames = { "North Button", "South Button",
        "East Button", "West Button", "Center Button" };
        for (int i=0; i<borderConsts.length; i++) { 
            JButton button = new JButton(buttonNames[i]); 
            container.add(button, borderConsts[i]);
        }
    }
}
