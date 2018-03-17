package relojcod;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Display {

    /**
     * Metodo estatico que se encarga de mostrar la hora
     *
     * @param a horas
     * @param b minutos
     * @param c segundos
     */
    public static void mostrar(int a, int b, int c) {
//        JOptionPane.showMessageDialog(null,a+":"+b+":"+c);
        System.out.println(a + ":" + b + ":" + c);
    }

}
