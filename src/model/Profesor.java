package model;

import java.util.ArrayList;

public class Profesor {
        private Integer idProfesor;
        private String nombres;
        private String contrasena;
        private ArrayList<Clase> clases;
        private Integer numeroGrupos;

        public Profesor(Integer idProfesor, String nombres, String contrasena, ArrayList<Clase> clases,
                        Integer numeroGrupos) {
                this.idProfesor = idProfesor;
                this.nombres = nombres;
                this.contrasena = contrasena;
                this.clases = clases;
                this.numeroGrupos = numeroGrupos;
        }

        public Profesor() {
                this.idProfesor = 0;
                this.nombres = "";
                this.contrasena = "";
                this.clases = new ArrayList<>();
                this.numeroGrupos = 0;
        }

        public Integer getIdProfesor() {
                return idProfesor;
        }

        public String getNombres() {
                return nombres;
        }

        public String getContrasena() {
                return contrasena;
        }

        public ArrayList<Clase> getClases() {
                return clases;
        }

        public Integer getNumeroGrupos() {
                return numeroGrupos;
        }

        public void setIdProfesor(Integer idProfesor) {
                this.idProfesor = idProfesor;
        }

        public void setNombres(String nombres) {
                this.nombres = nombres;
        }

        public void setContrasena(String contrasena) {
                this.contrasena = contrasena;
        }

        public void setClases(ArrayList<Clase> clases) {
                this.clases = clases;
        }

        public void setNumeroGrupos(Integer numeroGrupos) {
                this.numeroGrupos = numeroGrupos;
        }
}
