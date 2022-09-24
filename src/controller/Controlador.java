package controller;

import model.Login;
import view.VentanaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
    private VentanaLogin miVentanaLogin;

    public Controlador(VentanaLogin miVentanaLogin, Login modelo) {
        this.miVentanaLogin = miVentanaLogin;
        this.miVentanaLogin.miPanelLogin.btnAccionLogin.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        if (comando.equals("accionLogin")) {
            model.BaseDeDatos.conectarBaseDeDatos();
            JOptionPane.showMessageDialog(null, "Login exitoso!");
        }
    }
}