package Characters;

public class PrimitivosCaracteres {

    public static void main(String[] args) {
        char caracter = '\u0040'; //unicode character
        char decimal = 64;
        char caracterer2 = '0';
        char caracterer3 = 'A';
        char simbolo = '@';

        System.out.println("Simbolo = " + simbolo);
        System.out.println("Caracter = " + caracterer3);
        System.out.println("Caracter = " + caracterer2);
        System.out.println("Caracter = " + caracter);
        System.out.println("Caracter = " + decimal);
        System.out.println("decimal == caracter : " + (decimal == caracter));
        char espacio = ' ';
        char espacio2 = '\u0020'; //espacio en unicode
        char retroceso = '\b'; //backspace
        char tabulador = '\t'; // tabulador
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("tipo char corresponde en byte a:"+ retroceso + retroceso + tabulador + espacio + nuevaLinea + Character.BYTES);
        System.out.println("tipo char corresponde en bites a: " + retornoCarro + espacio2 + Character.SIZE);
        System.out.println("valor máx de un char :" + System.getProperty("line separator") + retroceso + Character.MAX_VALUE);
        System.out.println("valor min de un char " + tabulador + Character.MIN_VALUE);
        
        
    }

}
