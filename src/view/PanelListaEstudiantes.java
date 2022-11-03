package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;

public class PanelListaEstudiantes extends JPanel {
        private Object[] nombresColumnas = { "Código", "Nombre completo", "01", "02", "03", "04", "05" };
        private Object[][] datosEstudiantes = {
                        { "2224503", "Santiago Macías Corzo", "X", "-", "X", "X", "-" }
        };

        public PanelListaEstudiantes() {
                JTable tTablaEstudiantes = new JTable(datosEstudiantes, nombresColumnas);
                tTablaEstudiantes.getTableHeader().setReorderingAllowed(false);
                tTablaEstudiantes.getTableHeader().setResizingAllowed(false);

                JScrollPane spTablaEstudiantes = new JScrollPane();
                spTablaEstudiantes.setViewportView(tTablaEstudiantes);
                spTablaEstudiantes.setBounds(0, 0, 1860, 690);

                this.setLayout(null);
                this.setBackground(Color.decode("#ffffff"));
                this.setVisible(true);
                this.add(spTablaEstudiantes);

                // TODO Arreglar esta cosa!
        }
}
