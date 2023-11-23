package Strings;

public class EjemploStringTestRendimientoConcat {

    public static void main(String[] args) {
    	String a ="a";
    	String b ="b";
    	String c = a;
    	
    	//es mutable no como los String que es inmutable
    	//mucho mas eficiente para concatenar String
    	StringBuilder sb = new StringBuilder(a);
    	
    	//implementar iteración
    	
    	long inicio = System.currentTimeMillis();
    	
    	//comienza en 0
    	//finaliza cuando sea mayor que 500
    	// operador postincremento
    	//es igual que hacer i=i+1
    	
    	for(int i=0; i<500; i++) {
    		//c = c.concat(a).concat(b).concat("\n"); 36 milisegundos
    		//System.out.println(c);
    		//c=c+a+b+\n
    		//c += a + b +"\n"; //41 milisegundos
    		sb.append(a).append(b).append("\n"); //1 milisegundo mucho mas eficiente
    		
    	}
    	
    	
    	long fin = System.currentTimeMillis();
    	
    	//tiempo total - inicio
    	System.out.println("tiempo en milisegundos : " + (fin-inicio));
    	System.out.println(c);
    	System.out.println("sb : "+sb.toString());
    	
    	
    
    }

}
