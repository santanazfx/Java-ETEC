package Colection.Formula1;


import java.util.*;

public class Piloto {
    public enum Categoria {ROOKIE, EXPERIENTE,CAMPEAO}

    private Integer numero;
    private String nome;
    private String equipe;
    private Integer pontos;
    private Set<Categoria> categorias = new HashSet<>();


    public Piloto(Integer numero, String nome, String equipe, Integer pontos, Categoria categoria) {
        this.numero = numero;
        this.nome = nome;
        this.equipe = equipe;
        this.pontos = pontos;
        this.categorias.add(categoria);
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

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<Categoria> categorias) {
        this.categorias = categorias;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Piloto piloto = (Piloto) o;
        return Objects.equals(numero, piloto.numero) && Objects.equals(nome, piloto.nome) && Objects.equals(categorias, piloto.categorias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, nome, categorias);
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", equipe='" + equipe + '\'' +
                ", pontos=" + pontos +
                ", categorias=" + categorias +
                '}';
    }
}
