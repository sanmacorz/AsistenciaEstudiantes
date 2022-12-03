package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import model.BaseDeDatos;
import model.Login;

import java.awt.Color;
import java.sql.ResultSet;

public class PanelListaEstudiantes extends JPanel {
        private Object[] nombresColumnas = { "ID", "Código", "01", "02", "03", "04", "05" };

        public PanelListaEstudiantes() {
                ResultSet miResultSet = BaseDeDatos.getResultSet("SELECT * FROM `asistencias_22951_a1`" + ";");
                DefaultTableModel modeloOriginalTabla = new DefaultTableModel(nombresColumnas, 0) {
                        @Override
                        public boolean isCellEditable(int row, int col) {
                                return true;
                        }
                };
                JTable tTablaEstudiantes = new JTable(modeloOriginalTabla);
                tTablaEstudiantes.getTableHeader().setReorderingAllowed(false);
                tTablaEstudiantes.getTableHeader().setResizingAllowed(false);

                JScrollPane spTablaEstudiantes = new JScrollPane();
                spTablaEstudiantes.setViewportView(tTablaEstudiantes);
                spTablaEstudiantes.setBounds(0, 0, 1213, 385);

                try {
                        DefaultTableModel modeloTabla = (DefaultTableModel) tTablaEstudiantes.getModel();
                        modeloTabla.setRowCount(0);
                        while (miResultSet.next()) {
                                Object[] datos = { miResultSet.getInt("id_asistencia"),
                                                miResultSet.getInt("id_estudiante"),
                                                miResultSet.getInt("asistencia_1"),
                                                miResultSet.getInt("asistencia_2"),
                                                miResultSet.getInt("asistencia_3"),
                                                miResultSet.getInt("asistencia_4"),
                                                miResultSet.getInt("asistencia_5") };
                                modeloTabla.addRow(datos);
                        }
                        tTablaEstudiantes.getModel().addTableModelListener(new TableModelListener() {
                                @Override
                                public void tableChanged(TableModelEvent e) {
                                        int row = e.getFirstRow();
                                        int column = e.getColumn();
                                        TableModel model = (TableModel) e.getSource();
                                        Object data = model.getValueAt(row, column);
                                        Login.setDataTabla(Integer.toString(row + 1), Integer.toString(column - 1),
                                                        data.toString());
                                }
                        });
                } catch (Exception e) {
                        e.printStackTrace();
                }

                this.setLayout(null);
                this.setBackground(Color.decode("#ffffff"));
                this.setVisible(true);
                this.add(spTablaEstudiantes);
        }
}
