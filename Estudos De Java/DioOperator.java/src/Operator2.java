public class Operator2 {
    public static void main(String[] args) {
        int a, b, c;

        a = 10;
        b = 77;
        c = a * b;
        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);
        System.out.println(resultado + " " + (c / a) + (50 * c));
       // String resultado = a==b ? "verdadeiro" : "falso";
        // True or False
    }
}
