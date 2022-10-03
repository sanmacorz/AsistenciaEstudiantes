package model;

import java.sql.*;
import view.PanelLogin;

public class BaseDeDatos {
    private static String codigoProfesor;

    public static void setCodigoProfesor(String usuario) {
        codigoProfesor = usuario;
    }

    public static String getCodigoProfesor() {
        return codigoProfesor;
    }

    public static boolean verificarLogin() {
        boolean estadoLogin = false;
        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/asistencia_estudiantes",
                    "root", "");
            Statement miStatement = miConexion.createStatement();
            ResultSet miResultSet = miStatement.executeQuery("SELECT id_profesor, contraseña FROM usuarios");

            while (miResultSet.next()) {
                String usuario = miResultSet.getString("id_profesor");
                String contrasena = miResultSet.getString("contraseña");
                if (usuario.equals(PanelLogin.getTfUsuario()) && contrasena.equals(PanelLogin.getPfContrasenaLogin())) {
                    estadoLogin = true;
                    setCodigoProfesor(usuario);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return estadoLogin;
    }
}
