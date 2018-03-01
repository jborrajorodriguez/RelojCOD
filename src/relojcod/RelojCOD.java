package relojcod;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class RelojCOD {

    public static void main(String[] args) {
        int m=0;
        do {   m=Integer.parseInt(JOptionPane.showInputDialog("Opcion"));
            switch (m) {
                case 1:
                    RelojFun.tiempo();
                    break;
                case 2:
                    RelojFun.Alarma();
                    break;    
                    
                    
                default:
                    throw new AssertionError();
            }
            
        }
        while (m!=0);
      
      
        
        
    }

}
