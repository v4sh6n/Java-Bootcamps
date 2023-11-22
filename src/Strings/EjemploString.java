package Strings;

public class EjemploString {

    public static void main(String[] args) {
        // tipp String especial no primitivo
        // es un objeto String que se asigna a la variable curso como si hiceramos new
        // es una novedad que se creó para dinamizar
        // los objetos string se crean asi, de manera especial
        String curso = "Programación JAva"; // se crea de forma implicita

        // otra forma es crear una instancia de la clase string, es decir un objeto y se
        // lo asignamos a la variable curso2
        // aunque tengan el mismo contenido son objetos diferentes en memoria, en java
        // cada objeto es distinto y unico
        // con su indentificador propio
        String curso2 = new String("Programación JAva"); // se crea de forma explicita
        
        boolean esIgual = curso == curso2;
        //rara vez usaremos la comparación de instancias
        //objetos distintos, tienen referencias distintas
        //compara la referencia del objeto
        System.out.println(esIgual);
        
        //como compara por el valor
        //es la forma mas comun de uso con equals
        //siempre comparar por el valor
        esIgual = curso.equals(curso2);
        //retorna un boolean true al comparar los valores de las variables
        //compara el valor del String
        System.out.println(esIgual);
        
        //existe una version que ignora las mayusculas y minusculas
        esIgual = curso.equalsIgnoreCase(curso2);
        
        //para optimizar asigna la referencia del curso a curso3 
        //para no crear tantos objetos en memoria
        //detecta de forma automatica que tiene el mismo valor 
        //asi se ahorra una instancia en la aplicación
        String curso3 = "Programación JAva";
        esIgual = curso == curso3;
        System.out.println(esIgual);
        
        
    }

}
