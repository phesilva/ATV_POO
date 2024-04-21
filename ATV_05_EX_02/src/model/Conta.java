package model;

public class Conta {
    private int conta;
    private int codigo;
    private int saldo;
    private float limite;

    public Conta(){
        //msm sem declarar super o java adiciona;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public boolean deposita(float deposito){
        try {
            this.setSaldo((int) (this.getSaldo() + deposito));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean saca(float valor){
        if (valor > ( this.getSaldo() + this.getLimite())){
            return false;
        }else{
            saldo-= valor;
            return true;
        }
    }
}
