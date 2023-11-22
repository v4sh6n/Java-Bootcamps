package HolaMundo;

public class HolaMundo {
    //buena práctica : clases siempre empiezan con Mayus
    
    public static void main(String[] args) {
        String saludar = "Hola Mundo";
        System.out.println(saludar);
        System.out.println("saludar = "+ saludar.toUpperCase());
        //buena practica para los métodos al igual que las variables, camelCase primera minúscula segunda Mayus

        int numero = 11;
        System.out.println("numero = "+ numero);
        boolean valor = true;
        int numero2 = 5;

        if(valor){
            System.out.println("numero = "+ numero2);
        }

        // tipo flexible "integer"
        var numero3 = 15;

        // tipo flexible  "String" al ir en comillas 
        var numero4 = "15";

        String nombre;
        nombre = "Andres";
        if(numero>10){
            nombre="Juan";
        }
        System.out.println("nombre = "+ nombre);

        int edadPersona = 5;
        //buena practica camelCase primera minúscula segunda Mayus

    }

}