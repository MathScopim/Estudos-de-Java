
public class Loja {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();

        Xerox xerox = new Xerox();

        Impressora impressora = new DeskJet();
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = xerox;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
