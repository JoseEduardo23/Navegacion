import javax.swing.*;
import java.awt.*;

import static sun.tools.jconsole.inspector.XDataViewer.dispose;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("VEHICULOS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para cerrar el frame
        frame.setContentPane(new Form1().MainPanel1);
        frame.setSize(800, 600);
        frame.setPreferredSize(new Dimension(550, 300));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}