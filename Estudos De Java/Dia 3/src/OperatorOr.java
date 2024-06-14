public class OperatorOr {
    public static void main(String[] args) {
        boolean temEmprego = true;
        boolean temEmpresa = true;
        boolean tem50k = false;
        boolean saldoBancario = true;
        boolean podeFinanciar = (temEmprego || temEmpresa) && (tem50k || saldoBancario);
        System.out.println(podeFinanciar);
    }
}
