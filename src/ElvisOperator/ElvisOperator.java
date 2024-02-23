package ElvisOperator;

public class ElvisOperator {

    public static void main(String[] args) {
    //var infers type
    //with variable type Boolean
    //elvis operator simplifies if else
    var result = (3>2) ? true : false;
    //if 3 is greater than 2 result is true
    System.out.println("Result: "+result);

    //with variable type Strings
    var result2 = (3>2) ? "true" : "false";
    System.out.println("Result: "+result2);

    //with both boolean & String
    var result3 = (3>2) ? "true" : false;
    System.out.println("Result: "+result3);

    

}
}
