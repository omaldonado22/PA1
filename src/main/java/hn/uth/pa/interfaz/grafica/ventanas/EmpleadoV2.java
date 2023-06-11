package hn.uth.pa.interfaz.grafica.ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;


public class EmpleadoV2
{
    private JPanel panel;
    private JLabel nombreLabel,edadLabel, apellidoLabel;
    private JTextField nombreTextField, apellidoTextField;
    private JButton agregarButton;
    private JComboBox edadComboBox;
    private JCheckBox estudianteJCheckBox;
    
    
    public EmpleadoV2()
    {
        crearComponentes();
        configurarContenedor();
        configurarVentana();
    }

    private void crearComponentes()
    {
        //Crear componentes
        nombreLabel = new JLabel("Nombre:");
        apellidoLabel = new JLabel("Apellido:");
        nombreTextField = new JTextField(25);
        apellidoTextField = new JTextField(25);
        agregarButton = new JButton("Agregar"); 
        edadComboBox = new JComboBox();
        edadLabel= new JLabel("Edad: ");
       String rangoEdadString[] = {"<20","20-30",">30"};
        edadComboBox = new JComboBox(rangoEdadString);
        estudianteJCheckBox = new JCheckBox("¿Estudias?");
    }    
    
    
    private void configurarContenedor()
    {
        //Configurar el contenedor aqui es donde importa el lugar donde lo ubico
        panel = new JPanel();
        panel.add(nombreLabel);
        panel.add(nombreTextField);
        panel.add(apellidoLabel);
         panel.add(apellidoTextField);
         panel.add(edadComboBox);
         panel.add(edadComboBox);
         panel.add(estudianteJCheckBox);
        panel.add(agregarButton);        
    }
 
        
    private void configurarVentana()
    {
        //Configurar la ventana
        JFrame frame = new JFrame("Agregar Empleado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);        
    }
    
    
}
