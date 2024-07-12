import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    public JPanel MainPanel1;
    public JButton B1;
    public JTextField Usuario;
    public JPasswordField Password;

    public Form1() {
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = "JoseLincango23";
                String password = "J.eduardo23";

                // Obtener el texto ingresado por el usuario
                String inputUsuario = Usuario.getText();
                String inputPassword = new String(Password.getPassword());

                // Comparar las credenciales ingresadas con las credenciales correctas
                if (usuario.equals(inputUsuario) && password.equals(inputPassword)) {
                    JOptionPane.showMessageDialog(null, "Ingreso exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }

                // Limpiar los campos después de mostrar el mensaje
                Usuario.setText("");
                Password.setText("");
            }
        });
    }
}
