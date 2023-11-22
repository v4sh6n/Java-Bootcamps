package Primitivos;

import javax.swing.JOptionPane;

public class SistemasNumericos2 {

    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"ingrese un numero entero");
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        int numeroDecimal = Integer.parseInt(numeroStr);

        System.out.println( "numero binario " +numeroDecimal+" = " + Integer.toBinaryString(numeroDecimal));
         
        int numeroBinario = 0b111110100;
        System.out.println("111110100 de binario a numerico :"+ numeroBinario);
         
        System.out.println("numero hexadecimal de "+ Integer.toHexString(numeroBinario));
        
        int numeroHex = 0x1f4; //hexadecimal to decimal
        System.out.println("numeroHex = "+ numeroHex);
        String mensaje = "numero binario de " + numeroDecimal + "=" + Integer.toBinaryString(numeroDecimal);
        mensaje += "numero octal" + numeroDecimal + "=" + Integer.toString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje); 

    }
    
}
