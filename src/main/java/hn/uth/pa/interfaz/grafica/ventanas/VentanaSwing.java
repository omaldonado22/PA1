package hn.uth.pa.interfaz.grafica.ventanas;
import javax.swing.JFrame;
import javax.swing.JButton;
 import java.awt.Container;

public class VentanaSwing extends JFrame
{
    private JButton b2;
    public VentanaSwing()

    {
        super();
        this.setTitle("Ventana con Swing");
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b2 = new JButton("PRUEBA");
        Container contenedor = this.getContentPane();
        contenedor.add(b2);
  }

    

}
