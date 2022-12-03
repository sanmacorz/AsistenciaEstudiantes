package controller;

import model.Login;
import view.VentanaLogin;
import view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
    private VentanaLogin miVentanaLogin;
    private static Login miLogin;

    public Controlador(VentanaLogin miVentanaLogin, Login miLogin) {
        this.miVentanaLogin = miVentanaLogin;
        Controlador.miLogin = miLogin;
        this.miVentanaLogin.miPanelLogin.btnAccionLogin.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        if (comando.equals("accionLogin")) {
            try {
                if (miLogin.verificarLogin()) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso!");
                    VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
                    miVentanaPrincipal.setVisible(true);
                    miVentanaPrincipal.miSalir.addActionListener(this);
                    miVentanaPrincipal.miAcercaDe.addActionListener(this);
                    // Integer idProfesor = Integer.valueOf(miLogin.getUsuario());
                    // String nombres = miLogin.getNombres();
                    // String contrasena = miLogin.getContrasena();
                    // ArrayList<Clase> clases = new ArrayList<>();
                    // Integer numeroGrupos = Integer.valueOf(getNumeroGrupos());
                    // Profesor miProfesor = new Profesor(idProfesor, nombres, contrasena, clases,
                    // numeroGrupos);
                } else {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión fallido!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (comando.equals("salirVentana")) {
            System.exit(0);
        } else if (comando.equals("abrirVentanaAcercaDe")) {
            VentanaPrincipal.crearDialogoAcercaDe();
        }
    }

    public static String getGrupos() {
        return miLogin.getGrupos();
    }

    public static String getNumeroGrupos() {
        return String.valueOf(miLogin.verificarNumeroGrupos());
    }

    public static String getMaterias() {
        return miLogin.getMaterias();
    }
}
