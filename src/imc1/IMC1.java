
package imc1;

import javax.swing.JFrame;

/**
 *
 * @author Rita Melo
 */
public class IMC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Imcc imc1 = new Imcc ();
        
        imc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imc1.setSize(300,200);
        imc1.setVisible(true);
    }
    
}
