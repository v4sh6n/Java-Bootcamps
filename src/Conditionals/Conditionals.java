package Conditionals;

public class Conditionals {
    public static void main(String[] args) {
    int a = 11;
    //&& operator
    //range between 0 & 10
    int minValue = 0, maxValue = 10;
    //declare boolean variable
    //check if a is in range
    boolean result = a >= minValue && a <= maxValue;

    System.out.println("result "+result);
    
    // || operator
    //check if someone has vacations
    boolean vacations = true;
    boolean dayOfRest = false;
    if (vacations || dayOfRest){
        System.out.println(" Someone has Vacations or day of rest");
    } else{
        System.out.println("someone has to work");
    }

    }

    
}
