public class OperatorAnd {
    public static void main(String[] args) {
        // price product = $20
        // comprar somente entre $10 e $15
        int priceProduct = 9;
        boolean buy = priceProduct >= 10 && priceProduct <= 15;
        System.out.println(buy);
    }
}
