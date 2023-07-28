//package Primitivos;

public class Primitivos {
    public static void main(String[] args) {
        //si pusieramos > 127 daría error porque el tamaño máximo es 127
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor máx de un byte " + Byte.MAX_VALUE);
        System.out.println("valor min de un byte " + Byte.MIN_VALUE);
        
        short numeroShort = 32767;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo Short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo Short corresponde en bites a " + Short.SIZE);
        System.out.println("valor máx de un Short " + Short.MAX_VALUE);
        System.out.println("valor min de un Short " + Short.MIN_VALUE);

        int numeroInt = 2147483647; //hasta 32 bites de almacenamiento
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo Int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo Int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor máx de un Int " + Integer.MAX_VALUE);
        System.out.println("valor min de un Int " + Integer.MIN_VALUE);

        long numeroLong = 922337203685477580L;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo Long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo Long corresponde en bites a " + Long.SIZE);
        System.out.println("valor máx de un Long " + Long.MAX_VALUE);
        System.out.println("valor min de un Long " + Long.MIN_VALUE);

        // java 10 en adelante se pude usar "var"
        var numeroVar = 127; //automaticamente se hace byte
        var numeroVar1 = 922337203685477580F; //automaticamente se autoasigna float
        var numeroVar2 = 922337203685477580D; //automaticamente se autoasigna double


    }
    
}
