package view;

import javax.swing.JFrame;
import java.awt.Toolkit;

public class VentanaLogin extends JFrame {
    public PanelLogin miPanelLogin;

    public VentanaLogin() {
        miPanelLogin = new PanelLogin();
        miPanelLogin.setBounds(0, 0, 720, 480);

        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imgs/logo.png"));
        this.setTitle("Inicio de sesión");
        this.setSize(720, 480);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.add(miPanelLogin);
    }
}
