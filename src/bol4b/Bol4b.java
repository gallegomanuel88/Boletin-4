package bol4b;

import javax.swing.JOptionPane;

/**
 *
 * @author manu
 */
public class Bol4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     consumo obj = new consumo ();     
     obj.setLitros(50);
     obj.setpGas(1.57f);
     
     consumo obj2 = new consumo ();
     obj2.setLitros(50);
     obj2.setpGas(1.57f);
     String respuesta = JOptionPane.showInputDialog("Introduce velocidad media: ");
     obj2.setvMed(Float.parseFloat(respuesta));
     String respuesta1 = JOptionPane.showInputDialog("Introduce distancia");
     obj2.setKm(Float.parseFloat(respuesta1));
     
     JOptionPane.showMessageDialog(null,"Consumo medio:" + obj2.getConsumoMedio());
     
    }
    
}
