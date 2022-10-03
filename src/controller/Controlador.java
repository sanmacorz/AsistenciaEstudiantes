package controller;

import model.BaseDeDatos;
import model.Login;
import view.VentanaLogin;
import view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
    private VentanaLogin miVentanaLogin;
    private Login miLogin;

    public Controlador(VentanaLogin miVentanaLogin, Login miLogin) {
        this.miVentanaLogin = miVentanaLogin;
        this.miLogin = miLogin;
        this.miVentanaLogin.miPanelLogin.btnAccionLogin.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        if (comando.equals("accionLogin") && BaseDeDatos.verificarLogin()) {
            JOptionPane.showMessageDialog(null, "Login exitoso!");
            VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
            miVentanaPrincipal.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Login fallido!");
        }
    }
}
