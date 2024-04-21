package model;

public class Passeio extends VeiculoAutoMotor{
    private int ocupacoes;

    public Passeio() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getOcupacoes() {
        return ocupacoes;
    }
    public final void setOcupacoes(int ocupacoes) {
        this.ocupacoes = ocupacoes;
    }


    @Override
    public float calcVel(float velocMax) {
        return velocMax * 1000; // transformando de km/h para m/h
    }

    @Override
    public String toString() {
        return "Veiculo AutoMotor de Passeio------------\nocupacoes=" + ocupacoes + ", \n Potencia em Cavalos =" + motor.getPotenciaCV() +"\nmotor quantidade de Pistões=" + motor.getQtdPistoes () + ", \n emplacado =" + getPlaca()
                + ", \n marca()=" + getMarca() + ", \n modelo()=" + getModelo() + ", \n cor()=" + getCor()
                + ", \nvelocidade maxima atingida = " + calcVel(getVelocidadeMax()) + "m/h, \n quantidade de eixos =" + getQtdRodas() + "\n";
    }

}
