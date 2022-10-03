package view;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.Border;

public class VentanaPrincipal extends JFrame {
    private JMenuBar mbBarra;
    private JMenu mArchivo;
    private JMenu mEditar;
    private JMenu mVer;
    private JMenu mHerramientas;
    private JMenu mAyuda;
    private JMenuItem miSalir;
    public PanelDatosClase miPanelDatosClase;
    public PanelAsistencia miPanelAsistencia;

    public VentanaPrincipal() {
        this.setTitle("Asistencia Estudiantes");
        this.setSize(1920, 1080);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.decode("#8ba98a"));

        Border bordeNegro = BorderFactory.createLineBorder(Color.black, 3);
        miPanelDatosClase = new PanelDatosClase();
        miPanelDatosClase.setBounds(20, 20, 1880, 220);
        miPanelDatosClase.setBorder(bordeNegro);
        this.add(miPanelDatosClase);

        mbBarra = new JMenuBar();
        this.setJMenuBar(mbBarra);

        // Menú archivo
        mArchivo = new JMenu("Archivo");
        mbBarra.add(mArchivo);
        miSalir = new JMenuItem("Salir");
        mArchivo.add(miSalir);
        miSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Menú editar
        mEditar = new JMenu("Editar");
        mbBarra.add(mEditar);

        // Menú ver
        mVer = new JMenu("Ver");
        mbBarra.add(mVer);

        // Menú herramientas
        mHerramientas = new JMenu("Herramientas");
        mbBarra.add(mHerramientas);

        // Menú ayuda
        mAyuda = new JMenu("Ayuda");
        mbBarra.add(mAyuda);

        miPanelAsistencia = new PanelAsistencia();
        miPanelAsistencia.setBounds(20, 270, 1880, 720);
        this.add(miPanelAsistencia);
    }
}
