package model;

import java.sql.*;

public class AsistenciaEstudiantes {
        private static String numeroGrupos;

        public static String getNumeroGrupos() {
                try {
                        Connection miConexion = DriverManager.getConnection(
                                        "jdbc:mysql://localhost:3306/asistencia_estudiantes",
                                        "root", "");
                        Statement miStatement = miConexion.createStatement();
                        ResultSet miResultSet = miStatement
                                        .executeQuery("SELECT COUNT(*) FROM grupos WHERE id_profesor = "
                                                        + BaseDeDatos.getCodigoProfesor() + ";");
                        miResultSet.next();
                        numeroGrupos = String.valueOf(miResultSet.getInt(1));
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return numeroGrupos;
        }
}
