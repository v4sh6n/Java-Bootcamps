public class PrimitivoFloat {
    static float varFlotante; //por defecto es valor 0.0
    public static void main(String[] args) {
        
        float realFloat = 0.00000000000000120f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo Float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo Float corresponde en bites a " + Float.SIZE);
        System.out.println("valor máx de un Float " + Float.MAX_VALUE);
        System.out.println("valor min de un Float " + Float.MIN_VALUE);
        
        double realDouble = 3.487487;
        System.out.println("realFloat = " + realDouble);
        System.out.println("tipo Double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo Double corresponde en bites a " + Double.SIZE);
        System.out.println("valor máx de un Double " + Double.MAX_VALUE);
        System.out.println("valor min de un Double " + Double.MIN_VALUE);

        //var varFlotante = 3.1416f; // cuando es local la variable debe inicializarse  siempre
        System.out.println("varFlotante = " + varFlotante);

    }
}