package Colection.Formula1;

public enum Categoria {
    ROOKIE(1,"Iniciante"),
    EXPERIENTE(2,"Esperiente"),
    CAMPEAO(2,"Campeao");


    private final String descricao;
    public int EXPERIENCIA;

    Categoria(int experiencia, String descricao) {
        this.descricao = descricao;
        this.EXPERIENCIA = experiencia;
    }
}
