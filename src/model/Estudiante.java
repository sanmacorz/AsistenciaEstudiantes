package model;

public class Estudiante {
        private Integer idEstudiante;
        private String nombres;
        private String materia;
        private String grupo;
        private Boolean matriculado;

        public Estudiante(Integer idEstudiante, String nombres, String materia, String grupo, Boolean matriculado) {
                this.idEstudiante = idEstudiante;
                this.nombres = nombres;
                this.materia = materia;
                this.grupo = grupo;
                this.matriculado = matriculado;
        }

        public Estudiante() {
                this.idEstudiante = 0;
                this.nombres = "";
                this.materia = "";
                this.grupo = "";
                this.matriculado = false;
        }

        public Integer getIdEstudiante() {
                return idEstudiante;
        }

        public String getNombres() {
                return nombres;
        }

        public String getMateria() {
                return materia;
        }

        public String getGrupo() {
                return grupo;
        }

        public Boolean getMatriculado() {
                return matriculado;
        }

        public void setIdEstudiante(Integer idEstudiante) {
                this.idEstudiante = idEstudiante;
        }

        public void setNombres(String nombres) {
                this.nombres = nombres;
        }

        public void setMateria(String materia) {
                this.materia = materia;
        }

        public void setGrupo(String grupo) {
                this.grupo = grupo;
        }

        public void setMatriculado(Boolean matriculado) {
                this.matriculado = matriculado;
        }
}
