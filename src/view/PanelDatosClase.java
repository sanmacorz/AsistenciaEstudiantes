package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import controller.Controlador;
import java.awt.Color;
import java.awt.Font;

public class PanelDatosClase extends JPanel {
        private JLabel lbTituloLogin;
        private JLabel lbNumeroGrupos;
        private JLabel lbMaterias;
        private JLabel lbGrupos;

        public PanelDatosClase() {
                lbTituloLogin = new JLabel("Datos de la clase: ", SwingConstants.CENTER);
                lbTituloLogin.setFont(new Font("Verdana", Font.BOLD, 20));
                lbTituloLogin.setForeground(Color.BLACK);
                lbTituloLogin.setBounds(-290, 0, 1920, 50);

                lbNumeroGrupos = new JLabel("Tiene " + Controlador.getNumeroGrupos() + " grupos asignados: ");
                lbNumeroGrupos.setFont(new Font("Verdana", Font.PLAIN, 20));
                lbNumeroGrupos.setForeground(Color.BLACK);
                lbNumeroGrupos.setBounds(10, 50, 400, 50);

                lbMaterias = new JLabel(Controlador.getMaterias());
                lbMaterias.setFont(new Font("Verdana", Font.PLAIN, 20));
                lbMaterias.setForeground(Color.BLACK);
                lbMaterias.setBounds(10, 90, 1200, 50);

                lbGrupos = new JLabel(Controlador.getGrupos());
                lbGrupos.setFont(new Font("Verdana", Font.PLAIN, 20));
                lbGrupos.setForeground(Color.BLACK);
                lbGrupos.setBounds(10, 120, 1200, 50);

                this.setLayout(null);
                this.setBackground(Color.decode("#fffd98"));
                this.setVisible(true);
                this.add(lbTituloLogin);
                this.add(lbNumeroGrupos);
                this.add(lbMaterias);
                this.add(lbGrupos);
        }
}
