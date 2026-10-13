package Enums;

public enum MesesDoAno {
    JANEIRO(1, "Janeiro"){
        @Override
        public String normalize() {
            return JANEIRO.toString().toUpperCase();
        }
    },
    FEVEREIRO(2, "Fevereiro"){
        @Override
        public String normalize() {
            return FEVEREIRO.toString().toUpperCase();
        }
    },
    MARCO(3, "Março"){
        @Override
        public String normalize() {
            return MARCO.toString().toUpperCase();
        }
    };

    private final int valor;
    private final String descricao;

    MesesDoAno(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return this.valor;
    }
    public String getDescricao() {
        return this.descricao;
    }

    public abstract String normalize();
}
