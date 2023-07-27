public class HolaMundo {
    
    public static void main(String[] args) {
        String saludar = "Hola Mundo";
        System.out.println(saludar);
        System.out.println("saludar = "+ saludar.toUpperCase());

        int numero = 10;
        System.out.println("numero = "+ numero);
        boolean valor = true;
        int numero2 = 5;

        if(valor){
            System.out.println("numero = "+ numero2);
        }

        // tipo flexible integer
        var numero3 = 15;

        // tipo flexible  String al ir en comillas 
        var numero4 = "15";

        String nombre;
        nombre = "Andres";
        if(numero>8){
            nombre="Juan";
        }
        System.out.println("nombre = "+ nombre);


    }

}