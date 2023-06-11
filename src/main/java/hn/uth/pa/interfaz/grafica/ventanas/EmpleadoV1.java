
package hn.uth.pa.interfaz.grafica.ventanas;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;

public class EmpleadoV1 {

    public EmpleadoV1() {
        //crear componentes
        JLabel nombreLabel = new JLabel("Nombre");
        JTextField nombreTextField =  new JTextField(25); //Es para crear textos 
        JButton agregarButton = new JButton("Agregar");
        
        
        // configurar contenedor  
        JPanel panel = new JPanel();
        panel.add(nombreLabel);
        panel.add(nombreTextField);
        panel.add(agregarButton);
        
        //configurar la ventana
        JFrame frame = new JFrame("AGREGAR EL EMPLEADO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.add(panel);
         frame.pack();
         frame.setLocale(null);
          frame.setVisible(true);
    }
    
    
}
