package relojcod;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class RelojFun{

  private static int h, m, s;
    private static Date d;

    public static void tiempo(){
        do{
            
            try {
                d=new Date();
                h=d.getHours();
                m=d.getMinutes();
                s=d.getSeconds();
                Display.mostrar(h, m, s);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(RelojFun.class.getName()).log(Level.SEVERE,null,ex);
            }
            
        }while(1==1);

    }
}



