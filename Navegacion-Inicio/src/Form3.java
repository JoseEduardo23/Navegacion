import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form3 extends JFrame {
    public JPanel MainPanel3;
    public JButton regresarButton;

    public Form3() {
        setTitle("HOBBIES");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(MainPanel3);
        pack();
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Form2 form2 = new Form2();
                form2.setVisible(true);
                form2.setSize(800, 600);
                form2.setPreferredSize(new Dimension(650, 400));
                form2.pack();
                form2.setLocationRelativeTo(null);
                dispose();
            }
        });
    }
}

