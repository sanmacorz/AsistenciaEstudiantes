package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.AsistenciaEstudiantes;
import java.awt.Color;
import java.awt.Font;

public class PanelDatosClase extends JPanel {
        private JLabel lbTituloLogin;
        private JLabel lbNumeroGrupos;

        public PanelDatosClase() {
                this.setLayout(null);
                this.setBackground(Color.decode("#fffd98"));
                this.setVisible(true);

                lbTituloLogin = new JLabel("Datos de la clase: ", SwingConstants.CENTER);
                lbTituloLogin.setFont(new Font("Verdana", Font.BOLD, 20));
                lbTituloLogin.setForeground(Color.BLACK);
                lbTituloLogin.setBounds(0, 0, 1920, 50);
                this.add(lbTituloLogin);

                String numeroGrupos = AsistenciaEstudiantes.getNumeroGrupos();
                lbNumeroGrupos = new JLabel("Tiene " + numeroGrupos + " grupos asignados: ");
                lbNumeroGrupos.setFont(new Font("Verdana", Font.PLAIN, 20));
                lbNumeroGrupos.setForeground(Color.BLACK);
                lbNumeroGrupos.setBounds(10, 30, 400, 50);
                this.add(lbNumeroGrupos);

        }
}
