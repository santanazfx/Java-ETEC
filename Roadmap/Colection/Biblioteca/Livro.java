package Colection.Biblioteca;

import java.util.*;

public class Livro {
    private Integer isbn;
    private String titulo;
    private String autor;
    private Set<String> categorias = new HashSet<>();

    public Livro(Integer isbn, String titulo, String autor) {
        setIsbn(isbn);
        this.titulo = titulo;
        this.autor = autor;
    }

    public Integer getIsbn() {
        return isbn;

    }

    public void setIsbn(Integer isbn) {
        if(isbn == null) throw new NullPointerException("ISBN nao pode ser nulo");
        String isbnS = Integer.toString(isbn);

        isbnS = isbnS.replaceAll("\\s*", "");

        if (isbnS.matches("^\\d{4}$")){
            this.isbn = Integer.parseInt(isbnS);
        }else { throw new IllegalArgumentException("<Isbn invalida>");}
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Set<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<String> categorias) {
        this.categorias = categorias;
    }

    public void adicionarCategoria(String categoria) {
        if (categorias.contains(categoria)) { throw new IllegalArgumentException("Categoria ja adicionada");
        }else{ categorias.add(categoria);}
    }

    public void removerCategoria(String categoria){
            if (categorias.contains(categoria)){
                categorias.remove(categoria);
            }else{ throw new IllegalArgumentException("Categoria invalida"); }
        }




    @Override
    public String toString() {
        return "Livro{" +
                "isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categorias=" + categorias +
                '}'+"\n";
    }
    }


