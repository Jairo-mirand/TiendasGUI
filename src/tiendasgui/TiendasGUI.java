package tiendasgui;

import javax.swing.JOptionPane;
import tiendasgui.vista.VCliente;

public class TiendasGUI {
    public static void main(String[] args) {
        VCliente pantallaCliente= new VCliente();
        pantallaCliente.setVisible(true);
        pantallaCliente.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(pantallaCliente, "jeje");
        
    }
    
}
