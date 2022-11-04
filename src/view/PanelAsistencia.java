package view;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class PanelAsistencia extends JPanel {
        public PanelAsistencia() {
                JPanel miPanelListaEstudiantes = new PanelListaEstudiantes();
                JPanel miPanelListaEstudiantes2 = new JPanel();
                JPanel miPanelListaEstudiantes3 = new JPanel();
                JPanel miPanelListaEstudiantes4 = new JPanel();
                JPanel miPanelListaEstudiantes5 = new JPanel();
                JPanel miPanelListaEstudiantes6 = new JPanel();
                JPanel miPanelListaEstudiantes7 = new JPanel();
                JPanel miPanelListaEstudiantes8 = new JPanel();
                JTabbedPane tpPestanas = new JTabbedPane();

                tpPestanas.setBounds(10, 10, 1310, 400);
                tpPestanas.add("S1", miPanelListaEstudiantes);
                tpPestanas.add("S2", miPanelListaEstudiantes2);
                tpPestanas.add("S3", miPanelListaEstudiantes3);
                tpPestanas.add("S4", miPanelListaEstudiantes4);
                tpPestanas.add("A1", miPanelListaEstudiantes5);
                tpPestanas.add("A2", miPanelListaEstudiantes6);
                tpPestanas.add("A3", miPanelListaEstudiantes7);
                tpPestanas.add("A4", miPanelListaEstudiantes8);

                this.setLayout(null);
                this.setBackground(Color.decode("#b3d2b2"));
                this.setVisible(true);
                this.add(tpPestanas);
        }
}
