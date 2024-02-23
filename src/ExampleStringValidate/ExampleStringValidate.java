package ExampleStringValidate;


public class ExampleStringValidate {

    public static void main(String[] args) {
        
    
    String curse = null;

    boolean isNull = curse == null;

    System.out.println("isNull = "+isNull);

    if(isNull){
        curse = "";

    }   
    boolean isEmpty = curse.length() == 0;
    System.out.println("isEmpty = " + isEmpty);

    boolean isEmpty2 = curse.isEmpty();
    System.out.println("isEmpty2 = "+ isEmpty2);

    boolean isBlank = curse.isBlank();
    System.out.println("isBlank = "+ isBlank);

    if(isBlank==false){

    System.out.println(curse.toUpperCase());
    
    System.out.println("Welcome to curse" + curse);
    }
}



    
}
