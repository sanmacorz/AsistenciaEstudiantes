package main;

import controller.Controlador;
import model.Login;
import view.VentanaLogin;
import view.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        Login miLogin = new Login();
        VentanaLogin miVentanaLogin = new VentanaLogin();
        new Controlador(miVentanaLogin, miLogin);
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
    }
}
