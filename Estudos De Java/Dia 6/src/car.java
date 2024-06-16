public class car {

    private String marca;
    private String modelo;
    private int ano;
    private int valor;

    
    

    car(String marca, String modelo, int ano, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;

        
    }
    public double valorVenda() {
        double valorFinal = (valor * 0.1) + valor;
        return valorFinal;
    }
    //getter

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public double getValor() {
        return valor;
    }

    
    // setter
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }



}
