package view;

import javax.swing.JFrame;

public class VentanaLogin extends JFrame {
    public PanelLogin miPanelLogin;

    public VentanaLogin() {
        miPanelLogin = new PanelLogin();
        miPanelLogin.setBounds(0, 0, 852, 480);

        this.setTitle("Login");
        this.setSize(852, 480);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.add(miPanelLogin);
    }
}
