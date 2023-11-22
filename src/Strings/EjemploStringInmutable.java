package Strings;

public class EjemploStringInmutable {

    public static void main(String[] args) {
    	String curso = "Programacion Java";
    	String profesor = "John Doe";
    	
    	String resultado = curso.concat(profesor);
    	System.out.println(resultado);
    	
    	String resultado2 = curso.transform(c -> {
    		return c + " con " + profesor;
    	});
    	System.out.println(curso);
    	System.out.println(resultado2);
    
    }
    
    //cualquier cambio que recibe el string
    //retorna nueva instancia se tiene que guardar en otra variable
    //la original no cambia, se mantiene intacta
   

}
