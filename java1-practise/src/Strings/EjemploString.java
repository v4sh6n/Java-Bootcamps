public class EjemploString {

    public static void main(String[] args) {
        // tipp String especial no primitivo
        // es un objeto String que se asigna a la variable curso como si hiceramos new
        // es una novedad que se creó para dinamizar
        // los objetos string se crean asi, de manera especial
        String curso = "Programación JAva";

        // otra forma es crear una instancia de la clase string, es decir un objeto y se
        // lo asignamos a la variable curso2
        // aunque tengan el mismo contenido son objetos diferentes en memoria, en java
        // cada objeto es distinto y unico
        // con su indentificador propio
        String curso2 = new String("Programación JAva");
        boolean esIgual = curso == curso2;
        System.out.println(esIgual);
    }

}
