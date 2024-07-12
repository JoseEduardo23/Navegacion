import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {
    public JPanel MainPanel1;
    public JButton B1;
    public JTextField Usuario;
    public JPasswordField Password;

    public Form1() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(MainPanel1);
        setSize(800, 600);
        setPreferredSize(new Dimension(550, 300));
        setLocationRelativeTo(null);
        pack();

        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = "JoseLincango23";
                String password = "J.eduardo23";

                String inputUsuario = Usuario.getText();
                String inputPassword = new String(Password.getPassword());

                if (usuario.equals(inputUsuario) && password.equals(inputPassword)) {
                    JOptionPane.showMessageDialog(null, "Ingreso exitoso");

                    dispose();

                    Form2 form2 = new Form2();
                    form2.setVisible(true);
                    form2.setSize(800, 600);
                    form2.setPreferredSize(new Dimension(650, 400));
                    form2.pack();
                    form2.setLocationRelativeTo(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
                Usuario.setText("");
                Password.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Form1 form1 = new Form1();
            form1.setVisible(true);
        });
    }
}