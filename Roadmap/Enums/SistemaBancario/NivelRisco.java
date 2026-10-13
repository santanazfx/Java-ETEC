package Enums.SistemaBancario;

public enum NivelRisco {
    BAIXO(0){
        @Override
        String verificaManual() {
            return "Veficacao nao Necessaria"; //passa idependente do valor
        }
    },
    MEDIO(1){
        @Override
        String verificaManual() {
            return "Necessario Verificacao"; // adicionar verificacao de valor for alto
        }
    },
    ALTO(2){
        @Override
        String verificaManual() {
            return "Necessario Verificacao"; //idependente de valor vai pedir verif.
        }
    };

    private final int valoRisco;

    public int getValoRisco() {
        return valoRisco;
    }

    NivelRisco(int valorRisco) {
        this.valoRisco = valorRisco;
    }

    abstract String verificaManual();
}
