package relojcod;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class RelojFun {

    private static int h, m, s,hor,min;
    private static Date d;
    /**
     * Metodo tiempo
     * 
     * Es un metodo estatico que muestra las horas y actua la alarma.
     */
    public static void tiempo() {
         
       
        do {

            try {
                d=new Date();
                h=d.getHours();
                m=d.getMinutes();
                s=d.getSeconds();
                Display.mostrar(h,m,s);
                
                 if(h==hor&&m==min){
            System.out.println("Alarmaaaaaaaaaa");
        }
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(RelojFun.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
        while (1==1);

    }
    /**
     * Metodo Alarma
     * 
     * Es un metodo estatico encargo de dar valores a las horas y minutos de la alarma.
     */
    public static void Alarma(){
        hor=Integer.parseInt(JOptionPane.showInputDialog("Hora de la alarma"));
        min=Integer.parseInt(JOptionPane.showInputDialog("minutos de la alarma")); 
        
    }
}
