package model;

import java.sql.*;

public class BaseDeDatos {
    public static ResultSet getResultSet(String query) {
        ResultSet miResultSet = null;
        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/asistencia_estudiantes",
                    "root", "");
            Statement miStatement = miConexion.createStatement();
            miResultSet = miStatement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return miResultSet;
    }

    public static void setData(String query) {
        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/asistencia_estudiantes",
                    "root", "");
            Statement miStatement = miConexion.createStatement();
            miStatement.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
