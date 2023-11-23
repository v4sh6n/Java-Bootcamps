package Strings;

public class EjemploStringInmutable {

    public static void main(String[] args) {
    	String curso = "Programacion Java";
    	String profesor = "John Doe";
    	
    	String resultado = curso.concat(profesor);
    	System.out.println(resultado);
    	
    	
    	//expresion lamda o funcion anonima
    	//se pasa por argumento C de curso
    	// se retorna el string curso concatenado
    	String resultado2 = curso.transform(c -> {
    		return c + " con " + profesor;
    	});
    	System.out.println("curso "+curso);
    	//concatenacion
    	//curso se mantiene inmutable 
    	//resultado2 sigue conteniendo curso inmutable
    	System.out.println(resultado2);
    	resultado.replace("a", "A");
    	System.out.println(resultado);
    	//se mantiene inmutable
    	//cualquier metodo que modfica el String
    	//retorna una nueva instancia 
    	//se tiene que guardar en otra variable, pero la original
    	//se mantiene inmutable
    	String resultado3=resultado.replace("a", "A");
    	System.out.println(resultado3);
    	
    
    }
    
    //cualquier cambio que recibe el string
    //retorna nueva instancia se tiene que guardar en otra variable
    //la original no cambia, se mantiene intacta
   

}
