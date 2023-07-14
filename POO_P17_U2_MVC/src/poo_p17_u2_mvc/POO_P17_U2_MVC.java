
package poo_p17_u2_mvc;

import Control.Control;
import Modelo.Modelo;
import Vista.Vista;


public class POO_P17_U2_MVC {

    
    public static void main(String[] args) {
        Modelo mod =new Modelo();
        Vista vis = new Vista();
        Control cont =new Control (vis,mod);
        
        vis.setVisible(true);
        
    }
    
}
