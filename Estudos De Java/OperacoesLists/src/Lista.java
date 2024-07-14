public class Lista {
    //atributo
    private String descricao;

    public Lista(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao;


    }
}
