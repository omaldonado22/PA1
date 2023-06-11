
package hn.uth.pa.interfaz.grafica.login;

import javax.swing.JFrame;

public class FrmLogin extends JFrame {

    public FrmLogin() {
        super("Ingreso de Usuario");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PanelLogin panelLogin = new PanelLogin();
        add(panelLogin);
        pack();
        setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    
    
}
