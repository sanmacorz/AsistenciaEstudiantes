package model;

import java.sql.*;

public class BaseDeDatos {
    public static void conectarBaseDeDatos() {
        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/asistencia_estudiantes",
                    "root", "");
            Statement miStatement = miConexion.createStatement();
            ResultSet miResultSet = miStatement.executeQuery("SELECT id_profesor, contraseña FROM usuarios");

            while (miResultSet.next()) {
                String usuario = miResultSet.getString("id_profesor");
                String contrasena = miResultSet.getString("contraseña");
                System.out.println(usuario + "\n" + contrasena);
                // if texto caja == usuario
                /// miVentanaPrincipals
            }
        } catch (Exception e) {
            System.out.println("Error de conexión!");
            e.printStackTrace();

        }
    }
}