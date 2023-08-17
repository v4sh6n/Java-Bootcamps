import java.net.Socket;

public class PrimitivosBoolean {
    public static void main(String[] args) {
        
        boolean datoLogico = false;
        System.out.println("datoLogico = " +datoLogico);
        
        double d = 98765.43e-3; //98.765
        float f = 1.2345e2f; //123.45
        System.out.println(d);
        System.out.println(f);
        datoLogico = d<f;
        System.out.println(datoLogico);

        boolean esIgual = (3-3 == 1);
        System.out.println(esIgual);
    }
    
}
