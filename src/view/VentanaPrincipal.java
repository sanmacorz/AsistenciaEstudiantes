package view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.Border;

public class VentanaPrincipal extends JFrame {
    public JMenuBar mbBarra;
    public JMenu mArchivo;
    public JMenu mEditar;
    public JMenu mVer;
    public JMenu mHerramientas;
    public JMenu mAyuda;
    public JMenuItem miSalir;
    public JMenuItem miAcercaDe;
    public PanelDatosClase miPanelDatosClase;
    public PanelAsistencia miPanelAsistencia;
    public static DialogoAcercaDe miDialogoAcercaDe;

    public VentanaPrincipal() {
        Border bordeNegro = BorderFactory.createLineBorder(Color.BLACK, 3);
        miPanelDatosClase = new PanelDatosClase();
        miPanelDatosClase.setBounds(20, 20, 1233, 200);
        miPanelDatosClase.setBorder(bordeNegro);

        mbBarra = new JMenuBar();

        mArchivo = new JMenu("Archivo");
        mbBarra.add(mArchivo);

        miSalir = new JMenuItem("Salir");
        miSalir.setActionCommand("salirVentana");
        mArchivo.add(miSalir);

        mEditar = new JMenu("Editar");
        mbBarra.add(mEditar);

        mVer = new JMenu("Ver");
        mbBarra.add(mVer);

        mHerramientas = new JMenu("Herramientas");
        mbBarra.add(mHerramientas);

        mAyuda = new JMenu("Ayuda");
        mbBarra.add(mAyuda);

        miAcercaDe = new JMenuItem("Acerca de Asistencia de Estudiantes");
        miAcercaDe.setActionCommand("abrirVentanaAcercaDe");
        mAyuda.add(miAcercaDe);

        miPanelAsistencia = new PanelAsistencia();
        miPanelAsistencia.setBounds(20, 240, 1233, 405);

        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imgs/logo.png"));
        this.setTitle("Asistencia de Estudiantes");
        this.setSize(1280, 720);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.decode("#8ba98a"));
        this.add(miPanelDatosClase);
        this.setJMenuBar(mbBarra);
        this.add(miPanelAsistencia);
    }

    public static void crearDialogoAcercaDe() {
        miDialogoAcercaDe = new DialogoAcercaDe();
    }

}
