package relojcod;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Botonera {
    public static void selector(){
        int m;
        do { 
            m=Integer.parseInt(JOptionPane.showInputDialog("Selecciona lo que quieras :\n1 Hora\n2 Alarma on-off\n3 Poner alarma"));
            
            switch (m) {
                case 1:
                    
                    RelojFun.tiempo();
                    
                    
                    break;
                case 2:Alarma.encendido();
                break;
                case 3:Alarma.Alarma();
                break;
                default:
                    throw new AssertionError();
            }
            
        }
        while (true);
    }
    
    public void añadirAlarma(){
       
        
    }

}
