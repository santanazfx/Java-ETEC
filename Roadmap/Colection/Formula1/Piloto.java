package Colection.Formula1;


import java.util.*;

public class Piloto {
    public enum Categoria {ROOKIE,EXPERIENTE,CAMPEAO}
    private Integer numero;
    private String nome;
    private String equipe;
    private Integer pontos;
    private Set<Categoria> categorias = new HashSet<>();

    public Piloto(Integer numero, String nome, String equipe, Integer pontos) {
        this.numero = numero;
        this.nome = nome;
        this.equipe = equipe;
        this.pontos = pontos;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }
}
