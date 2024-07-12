import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form2 extends JFrame {
    public JPanel MainPanel2;
    private JTextArea Texto;
    private JLabel txt;
    private JButton siguienteButton;

    public Form2() {
        setTitle("BIBLIOGRAFIA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(MainPanel2);
        pack();
        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Form3 form3 = new Form3();
                form3.setVisible(true);
                form3.setSize(800, 600);
                form3.setPreferredSize(new Dimension(850, 500));
                form3.pack();
                form3.setLocationRelativeTo(null);
                dispose();
            }
        });
    }
}

