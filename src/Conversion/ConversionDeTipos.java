package Conversion;

public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "58";
        // var a partir de java 10 se puede usar el tipo dinamico var
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "9757,48";
        // Reemplaza la coma por un punto
        realStr = realStr.replace(',', '.');
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("OtroNumeroInt = " + otroNumeroInt);
        
        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
    }
}
