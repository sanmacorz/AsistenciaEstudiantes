package model;

import view.PanelLogin;
import java.sql.*;

public class Login {
    private Profesor profesor;

    public Login(Profesor profesor) {
        this.profesor = profesor;
    }

    public Login() {
        this.profesor = null;
    }

    Profesor miProfesor = new Profesor();

    public boolean verificarLogin() throws NumberFormatException, SQLException {
        boolean estadoLogin = false;
        ResultSet miResultSet = BaseDeDatos.getResultSet("SELECT id_profesor, contraseña FROM usuarios");
        while (miResultSet.next()) {
            String usuario = miResultSet.getString("id_profesor");
            String contrasena = miResultSet.getString("contraseña");

            if (usuario.equals(PanelLogin.getTfUsuario()) && contrasena.equals(PanelLogin.getPfContrasenaLogin())) {
                estadoLogin = true;
                miProfesor.setIdProfesor(Integer.valueOf(usuario));
            }
        }
        return estadoLogin;
    }

    public String getUsuario() {
        String usuario = "";
        try {
            ResultSet miResultSet = BaseDeDatos.getResultSet("SELECT id_profesor FROM usuarios");
            usuario = miResultSet.getString("id_profesor");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;
    }

    public String getNombres() {
        String nombres = "";
        try {
            ResultSet miResultSet = BaseDeDatos.getResultSet("SELECT nombres FROM usuarios");
            nombres = miResultSet.getString("nombres");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nombres;
    }

    public String getContrasena() {
        String contrasena = "";
        try {
            ResultSet miResultSet = BaseDeDatos.getResultSet("SELECT contraseña FROM usuarios");
            contrasena = miResultSet.getString("contraseña");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contrasena;
    }

    public static void setDataTabla(String idAsistencia, String columnaAsistencia, String data) {
        try {
            BaseDeDatos.setData(
                    "UPDATE `asistencias_22951_a1` SET `asistencia_" + columnaAsistencia
                            + "` = '" + data + "' WHERE `asistencias_22951_a1`.`id_asistencia` = " + idAsistencia
                            + ";");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Integer verificarNumeroGrupos() {
        Integer numeroGrupos = 0;
        ResultSet miResultSet = BaseDeDatos.getResultSet(
                "SELECT COUNT(*) FROM grupos WHERE id_profesor = " + miProfesor.getIdProfesor()
                        + ";");
        try {
            miResultSet.next();
            numeroGrupos = Integer.valueOf(miResultSet.getInt(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        miProfesor.setNumeroGrupos(numeroGrupos);
        return numeroGrupos;
    }

    public String getGrupos() {
        StringBuilder grupos = new StringBuilder();
        ResultSet miResultSet = BaseDeDatos.getResultSet(
                "SELECT `grupo` FROM `grupos` WHERE `id_profesor` = " + miProfesor.getIdProfesor()
                        + ";");
        try {
            while (miResultSet.next()) {
                grupos.append(miResultSet.getString("grupo") + "            ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return grupos.toString();
    }

    public String getMaterias() {
        StringBuilder materias = new StringBuilder();
        ResultSet miResultSet = BaseDeDatos.getResultSet(
                "SELECT DISTINCT `nombre_clase` FROM `grupos` WHERE `id_profesor` = " + miProfesor.getIdProfesor()
                        + ";");
        try {
            while (miResultSet.next()) {
                materias.append(miResultSet.getString("nombre_clase") + "          ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return materias.toString();
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    private static final char[] HEXADECIMAL = "0123456789ABCDEF".toCharArray();

    public static String convertirBytes(byte[] bytes) {
        char[] hexadecimal = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexadecimal[j * 2] = HEXADECIMAL[v >>> 4];
            hexadecimal[j * 2 + 1] = HEXADECIMAL[v & 0x0F];
        }
        return new String(hexadecimal);
    }
}
