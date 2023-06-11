
package hn.uth.pa.interfaz.grafica;
import hn.uth.pa.interfaz.grafica.ventanas.VentanaAwt;
import hn.uth.pa.interfaz.grafica.ventanas.VentanaSwing;
import hn.uth.pa.interfaz.grafica.ventanas.EmpleadoV2;


public class InterfazGrafica {
   private static VentanaAwt ventanaAwt;
   private static VentanaSwing ventanaSwing;
   private static EmpleadoV2 empleadoWindow;

    public static void main(String[] args) {
        
        //ventanaAwt = new VentanaAwt();
        //ventanaSwing = new VentanaSwing();
        empleadoWindow = new EmpleadoV2();
        
    }
}
