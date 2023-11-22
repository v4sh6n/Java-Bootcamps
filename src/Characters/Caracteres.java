package Characters;

public class Caracteres {

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

        System.out.println("tipo char corresponde en byte a " + Character.BYTES);
        System.out.println("tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("valor máx de un char " + Character.MAX_VALUE);
        System.out.println("valor min de un char " + Character.MIN_VALUE);
        
        
    }

}
