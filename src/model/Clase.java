package model;

public class Clase {
        private String grupoClase;
        private String nombreClase;
        private Integer idProfesor;
        private String[] estudiantesClase;

        Clase(String grupoClase, String nombreClase, Integer idProfesor, String[] estudiantesClase) {
                this.grupoClase = grupoClase;
                this.nombreClase = nombreClase;
                this.idProfesor = idProfesor;
                this.estudiantesClase = estudiantesClase;
        }

        Clase() {
                this.grupoClase = "";
                this.nombreClase = "";
                this.idProfesor = 0;
                this.estudiantesClase = null;
        }

        public String getGrupoClase() {
                return grupoClase;
        }

        public String getNombreClase() {
                return nombreClase;
        }

        public Integer getIdProfesor() {
                return idProfesor;
        }

        public String[] getEstudiantesClase() {
                return estudiantesClase;
        }

        public void setGrupoClase(String grupoClase) {
                this.grupoClase = grupoClase;
        }

        public void setNombreClase(String nombreClase) {
                this.nombreClase = nombreClase;
        }

        public void setIdProfesor(Integer idProfesor) {
                this.idProfesor = idProfesor;
        }

        public void setEstudiantesClase(String[] estudiantesClase) {
                this.estudiantesClase = estudiantesClase;
        }
}
