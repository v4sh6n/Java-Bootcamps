import javax.swing.JOptionPane;

public class SistemasNumericos2 {

    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"ingrese un numero entero");
        
        int numeroDecimal = Integer.parseInt(numeroStr);

        System.out.println( "numero binario " +numeroDecimal+" = " + Integer.toBinaryString(numeroDecimal));
         
        int numeroBinario = 0b111110100;
        System.out.println("111110100 de binario a numerico :"+ numeroBinario);
         
        System.out.println("numero hexadecimal de "+ Integer.toHexString(numeroBinario));
        
        int numeroHex = 0x1f4; //hexadecimal to decimal
        System.out.println("numeroHex = "+ numeroHex);

        JOptionPane.showMessageDialog(null, message:""); 
    }
    
}
