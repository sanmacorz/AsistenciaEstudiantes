package view;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class PanelAsistencia extends JPanel {
        public PanelAsistencia() {
                JPanel miPanelListaEstudiantesS1 = new PanelListaEstudiantes();
                JPanel miPanelListaEstudiantesS2 = new PanelListaEstudiantes();
                JPanel miPanelListaEstudiantesS3 = new PanelListaEstudiantes();
                JPanel miPanelListaEstudiantesS4 = new PanelListaEstudiantes();
                JPanel miPanelListaEstudiantesA1 = new PanelListaEstudiantes();
                JPanel miPanelListaEstudiantesA2 = new PanelListaEstudiantes();
                JPanel miPanelListaEstudiantesA3 = new PanelListaEstudiantes();
                JPanel miPanelListaEstudiantesA4 = new PanelListaEstudiantes();
                JTabbedPane tpPestanas = new JTabbedPane();

                tpPestanas.setBounds(10, 10, 1213, 385);
                tpPestanas.add("S1", miPanelListaEstudiantesS1);
                tpPestanas.add("S2", miPanelListaEstudiantesS2);
                tpPestanas.add("S3", miPanelListaEstudiantesS3);
                tpPestanas.add("S4", miPanelListaEstudiantesS4);
                tpPestanas.add("A1", miPanelListaEstudiantesA1);
                tpPestanas.add("A2", miPanelListaEstudiantesA2);
                tpPestanas.add("A3", miPanelListaEstudiantesA3);
                tpPestanas.add("A4", miPanelListaEstudiantesA4);

                this.setLayout(null);
                this.setBackground(Color.decode("#b3d2b2"));
                this.setVisible(true);
                this.add(tpPestanas);
        }
}
