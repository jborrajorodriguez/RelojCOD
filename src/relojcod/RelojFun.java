package relojcod;

import java.util.Date;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class RelojFun {

    protected static int h, m, s, hor, min;
    private static Date d;

    /**
     * Metodo tiempo
     *
     * Es un metodo estatico que muestra las horas y actua la alarma.
     */
    public static void tiempo() {
        Timer time = new Timer();

        do {

            try {
                d = new Date();
                h = d.getHours();
                m = d.getMinutes();
                s = d.getSeconds();
                Display.mostrar(h, m, s);
                time.schedule(new Alarma(), 0, 1000);
                Thread.sleep(1000);

            } catch (InterruptedException ex) {
                Logger.getLogger(RelojFun.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (1 == 1);

    }

}
