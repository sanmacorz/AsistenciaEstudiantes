package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class PanelLogin extends JPanel {
    private JLabel lbTituloLogin;
    private JLabel lbUsuarioLogin;
    private JLabel lbContrasenaLogin;
    private JLabel lbImagen;
    private ImageIcon iImagen; 
    private static JTextField tfUsuarioLogin;
    private static JPasswordField pfContrasenaLogin;
    public final JButton btnAccionLogin;

    public PanelLogin() {

        iImagen = new ImageIcon(getClass().getResource("/imgs/logouis.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(695,0,125,61);
        add(lbImagen);

        lbTituloLogin = new JLabel("INICIO DE SESIÓN", SwingConstants.CENTER);
        lbTituloLogin.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTituloLogin.setForeground(Color.BLACK);
        lbTituloLogin.setBounds(200, 100, 480, 30);

        lbUsuarioLogin = new JLabel("Nombre de usuario: ", SwingConstants.CENTER);
        lbUsuarioLogin.setFont(new Font("Verdana", Font.PLAIN, 20));
        lbUsuarioLogin.setForeground(Color.BLACK);
        lbUsuarioLogin.setBounds(40, 150, 480, 30);

        lbContrasenaLogin = new JLabel("Contraseña: ", SwingConstants.CENTER);
        lbContrasenaLogin.setFont(new Font("Verdana", Font.PLAIN, 20));
        lbContrasenaLogin.setForeground(Color.BLACK);
        lbContrasenaLogin.setBounds(80, 190, 480, 30);

        tfUsuarioLogin = new JTextField();
        tfUsuarioLogin.setFont(new Font("Verdana", Font.PLAIN, 20));
        tfUsuarioLogin.setForeground(Color.BLACK);
        tfUsuarioLogin.setBounds(390, 150, 200, 30);

        pfContrasenaLogin = new JPasswordField();
        pfContrasenaLogin.setFont(new Font("Verdana", Font.PLAIN, 20));
        pfContrasenaLogin.setForeground(Color.BLACK);
        pfContrasenaLogin.setBounds(390, 190, 200, 30);

        btnAccionLogin = new JButton("Iniciar sesión");
        btnAccionLogin.setFont(new Font("Verdana", Font.PLAIN, 20));
        btnAccionLogin.setForeground(Color.BLACK);
        btnAccionLogin.setBounds(340, 300, 180, 40);
        btnAccionLogin.setActionCommand("accionLogin");

        this.setLayout(null);
        this.setBackground(Color.decode("#8CF739"));
        this.setVisible(true);
        this.add(lbTituloLogin);
        this.add(lbUsuarioLogin);
        this.add(lbContrasenaLogin);
        this.add(tfUsuarioLogin);
        this.add(pfContrasenaLogin);
        this.add(btnAccionLogin);
    }

    public static String getTfUsuario() {
        return tfUsuarioLogin.getText();
    }

    public static String getPfContrasenaLogin() {
        return String.valueOf(pfContrasenaLogin.getPassword());
    }
}
