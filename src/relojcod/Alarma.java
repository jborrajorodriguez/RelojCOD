package relojcod;

import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Alarma extends TimerTask {

    private static int h, m, s, hor, min;
    private static boolean al=false;

    /**
     * Metodo Alarma
     *
     * Es un metodo estatico encargo de dar valores a las horas y minutos de la
     * alarma.
     */
    public static void Alarma() {
        hor=Integer.parseInt(JOptionPane.showInputDialog("Hora de la alarma"));
        min=Integer.parseInt(JOptionPane.showInputDialog("minutos de la alarma"));

    }

    /**
     * metodo que compara las horas
     *
     * @param a
     */
    public static void activar(boolean a) {
        try {
            if (RelojFun.h==hor&&RelojFun.m==min&&a==true) {
                System.out.println("Alarmaaaaaaaaaa");

                Thread.sleep(5000);

            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Alarma.class.getName()).log(Level.SEVERE,null,ex);
        }

    }

    /**
     * metodo que activa la alarma.
     *
     * @return
     */
    public static boolean encendido() {
        if(al==false){
            al=true;
        }else{
            al=false;
        }
        return al;
    }

    @Override
    public void run() {
        Alarma.activar(al);
    }

}
