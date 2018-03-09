package relojcod;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class RelojFun {
    
 private static int h, m, s;
    private static Date d;

    /**
     * Metodo tiempo
     * 
     * Este metodo se encarga de contar el tiempo
     */
    public static void tiempo(){
        
        do{
            try{
                d=new Date();
                h=d.getHours();
                m=d.getMinutes();
                s=d.getSeconds();
                Display.mostrar(h, m, s);
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                Logger.getLogger(RelojFun.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while(1==1);

    }
    /**
     * metodo que añade la hora
     * @return 
     */
    public static int alarmaHora(){
        int hor=Integer.parseInt(JOptionPane.showInputDialog("Añade la hora"));
        return hor;
    }
    
    /**
     * Metodo que añade los minutos para la alarma
     * @return 
     */
     public static int alarmaMin(){
        int min=Integer.parseInt(JOptionPane.showInputDialog("Añade los min"));
        return min;
    }
   
    
}
