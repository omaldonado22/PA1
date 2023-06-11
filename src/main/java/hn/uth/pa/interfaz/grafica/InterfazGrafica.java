
package hn.uth.pa.interfaz.grafica;
import hn.uth.pa.interfaz.grafica.ventanas.VentanaAwt;
import hn.uth.pa.interfaz.grafica.ventanas.VentanaSwing;
import hn.uth.pa.interfaz.grafica.ventanas.EmpleadoV2;
import hn.uth.pa.interfaz.grafica.login.FrmLogin;


public class InterfazGrafica {
   private static VentanaAwt ventanaAwt;
   private static VentanaSwing ventanaSwing;
   private static EmpleadoV2 empleadoWindow;
    private static FrmLogin frmUsuario;

    public static void main(String[] args) {
        
        //ventanaAwt = new VentanaAwt();
        //ventanaSwing = new VentanaSwing();
        empleadoWindow = new EmpleadoV2();
        frmUsuario = new FrmLogin();
        
    }
}
