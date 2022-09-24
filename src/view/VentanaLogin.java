package view;

import javax.swing.JFrame;

public class VentanaLogin extends JFrame {
    public PanelLogin miPanelLogin;

    public VentanaLogin() {
        this.setTitle("Login");
        this.setSize(852, 480);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);

        miPanelLogin = new PanelLogin();
        miPanelLogin.setBounds(0, 0, 852, 480);
        this.add(miPanelLogin);
    }
}