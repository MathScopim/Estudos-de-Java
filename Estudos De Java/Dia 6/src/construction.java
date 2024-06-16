public class construction {
    public static void main(String[] args) {

        car car = new car("MonzaTubarão", "X1", 1998, 76_000);
        car.setMarca("Fusca");
        car.setModelo("V8");
        System.out.println( car.getMarca() + " " + car.getModelo() + " " + car.getAno());
        System.out.println("Valor de Venda : " + car.valorVenda() );

    }
}
