
package hn.uth.pa.interfaz.grafica.login;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

public class PanelLogin extends JPanel{
    private final JLabel lblUsername = new JLabel("Ingrese su Usuario:");
    private final JTextField txtUsername = new JTextField(10);
    private final JLabel lblPassword = new JLabel("Ingrese su Password:");
    private final JPasswordField txtPassword = new JPasswordField(10);
    private final JButton btnIngresar = new JButton("Ingresar");

    public PanelLogin() {
        super(new GridBagLayout());
        
        GridBagConstraints gridConstraints = new GridBagConstraints();
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(10,10,10,10);
        
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        add(lblUsername, gridConstraints);
        
        gridConstraints.gridx = 1;
        add(txtUsername, gridConstraints);
        
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;        
        add(lblPassword, gridConstraints);
        
        gridConstraints.gridx = 1;
        add(txtPassword,gridConstraints);
        
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        gridConstraints.gridwidth = 2;
        gridConstraints.anchor = GridBagConstraints.CENTER;
        add(btnIngresar,gridConstraints);
       
        TitledBorder borderConTitulo = new TitledBorder(BorderFactory.createEtchedBorder(), "Login");
        //borderConTitulo.setTitlePosition(1);
        borderConTitulo.setTitleJustification(2);
        
        //this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login"));
        this.setBorder(borderConTitulo);
        
        
        
    }
    
    
    
    
}
