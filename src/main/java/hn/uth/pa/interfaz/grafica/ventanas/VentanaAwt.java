
package hn.uth.pa.interfaz.grafica.ventanas;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


public class VentanaAwt extends Frame {

    public VentanaAwt() {
        super();
        this.setTitle("Ventana AWT");
        this.setSize(400, 400);
        this.setVisible(true);
        
        
        
        //Para cerrar las ventanas en Awt
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
            
            
        });        
      
    }
    
    
}
