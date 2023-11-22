package Strings;

public class EjemploStringConcatenacion {

    public static void main(String[] args) {
    	String curso = "Programacion Java";
    	String profesor = "John Doe";
    	
    	String detalle = curso +" con instructor "+ profesor;
    	System.out.println(detalle);
    	
    	int numeroA = 10;
    	int numeroB = 5;
    	
    	//precede el String , por lo que concatena 
    	//infiere que es una cadena en vez de sumar
    	//es necesario usar paréntesis
    	System.out.println(detalle + (numeroA + numeroB));
    	
    	//concatena el string al resultado de la suma
    	System.out.println(numeroA+numeroB+detalle);
    	
    	//es mejor usar concat, es mas eficiente que el operador +
    	// ya que el operador crea instancias del StringBuilder
    	String detalle2 = curso.concat(" con ".concat(profesor));
    	//los string son inmutables,no cambian,
    	//de manera que retorna otra instancia
    	System.out.println(detalle2);
    
    }

}
