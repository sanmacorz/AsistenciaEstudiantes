package model;

public class AsistenciaEstudiantes {
        private Profesor profesor;
        private Integer numeroGrupos;

        public AsistenciaEstudiantes(Profesor profesor, Integer numeroGrupos) {
                this.profesor = profesor;
                this.numeroGrupos = numeroGrupos;
        }

        public AsistenciaEstudiantes() {
                this.profesor = null;
                this.numeroGrupos = 0;
        }

        public void setNumeroGrupos(Integer numeroGrupos) {
                this.numeroGrupos = numeroGrupos;
        }

        public Integer getNumeroGrupos() {
                return numeroGrupos;
        }

        public void setProfesor(Profesor profesor) {
                this.profesor = profesor;
        }

        public Profesor getProfesor() {
                return profesor;
        }
}
