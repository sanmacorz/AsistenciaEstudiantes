package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelLogin extends JPanel {
    private JLabel lbTituloLogin;
    private JLabel lbUsuarioLogin;
    private JLabel lbContrasenaLogin;
    private JTextField tfUsuarioLogin;
    private JPasswordField pfContrasenaLogin;
    public JButton btnAccionLogin;

    public PanelLogin() {
        this.setLayout(null);
        this.setBackground(Color.decode("#ff0000"));
        this.setVisible(true);

        lbTituloLogin = new JLabel("INICIO DE SESIÓN", SwingConstants.CENTER);
        lbTituloLogin.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTituloLogin.setForeground(Color.BLACK);
        lbTituloLogin.setBounds(200, 50, 480, 30);
        this.add(lbTituloLogin);

        lbUsuarioLogin = new JLabel("Nombre de usuario: ", SwingConstants.CENTER);
        lbUsuarioLogin.setFont(new Font("Verdana", Font.PLAIN, 20));
        lbUsuarioLogin.setForeground(Color.BLACK);
        lbUsuarioLogin.setBounds(40, 100, 480, 30);
        this.add(lbUsuarioLogin);

        lbContrasenaLogin = new JLabel("Contraseña: ", SwingConstants.CENTER);
        lbContrasenaLogin.setFont(new Font("Verdana", Font.PLAIN, 20));
        lbContrasenaLogin.setForeground(Color.BLACK);
        lbContrasenaLogin.setBounds(80, 140, 480, 30);
        this.add(lbContrasenaLogin);

        tfUsuarioLogin = new JTextField();
        tfUsuarioLogin.setFont(new Font("Verdana", Font.PLAIN, 20));
        tfUsuarioLogin.setForeground(Color.BLACK);
        tfUsuarioLogin.setBounds(390, 100, 200, 30);
        this.add(tfUsuarioLogin);

        pfContrasenaLogin = new JPasswordField();
        pfContrasenaLogin.setFont(new Font("Verdana", Font.PLAIN, 20));
        pfContrasenaLogin.setForeground(Color.BLACK);
        pfContrasenaLogin.setBounds(390, 140, 200, 30);
        this.add(pfContrasenaLogin);

        btnAccionLogin = new JButton("Iniciar sesión");
        btnAccionLogin.setFont(new Font("Verdana", Font.PLAIN, 20));
        btnAccionLogin.setForeground(Color.BLACK);
        btnAccionLogin.setBounds(340, 200, 180, 40);
        btnAccionLogin.setActionCommand("accionLogin");
        this.add(btnAccionLogin);
    }
}