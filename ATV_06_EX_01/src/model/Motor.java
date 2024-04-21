package model;

public class Motor {
    private int qtdPistoes;
    private int potenciaCV;

    public Motor() {
        super();
    }

    public int getQtdPistoes() {
        return this.qtdPistoes;
    }

    public final void setQtdPistoes(int qtdPistoes) {
        this.qtdPistoes = qtdPistoes;
    }

    public int getPotenciaCV() {
        return this.potenciaCV;
    }

    public final void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
}
