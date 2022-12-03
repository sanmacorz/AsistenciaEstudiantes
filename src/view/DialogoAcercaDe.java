package view;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Color;

public class DialogoAcercaDe extends JDialog {
        private JLabel lbDorsalJugador;

        public DialogoAcercaDe() {
                lbDorsalJugador = new JLabel("Asistencia de Estudiante");
                lbDorsalJugador.setBounds(10, 20, 140, 20);

                this.setLayout(null);
                this.getContentPane().setBackground(Color.decode("#32aa96"));
                this.setTitle("Aumentar Goles");
                this.setSize(300, 300);
                this.setLocationRelativeTo(null);
                this.setResizable(false);
                this.setVisible(true);
                this.add(lbDorsalJugador);
        }

        public void cerrarDialogoAcercaDe() {
                this.dispose();
        }
}
