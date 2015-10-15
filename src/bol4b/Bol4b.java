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
     
     float litros = 50 , pGas = 1.57f, vMed, distancia;
     String respuesta = JOptionPane.showInputDialog("Introduce velocidad media: ");
     vMed = Float.parseFloat(respuesta);
     String respuesta1 = JOptionPane.showInputDialog("Introduce distancia");
     distancia = Float.parseFloat(respuesta1);
     
     consumo obj2 = new consumo (distancia, litros, vMed, pGas);
     
     JOptionPane.showMessageDialog(null, + obj2.getConsumoMedio(litros, distancia));
     
    }
    
}
