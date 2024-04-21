package model;

public class Carga extends VeiculoAutoMotor{
    private int cargaMax;
	private int tar;
	public Carga() {
		super();
	}
	public int getCargaMax() {
		return cargaMax;
	}
	public final void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	@Override
	public String toString() {
		return  "Veiculo de Carga AutoMotor-----------\ncargaMax=" + cargaMax + "\nmotorPotencia=" + motor.getPotenciaCV() +"\nmotorQtdPist=" + motor.getQtdPistoes() + ", \ntara=" + tar + ", \ngetPlaca()=" + getPlaca() + ", \ngetMarca()="
				+ getMarca() + ", \ngetModelo()=" + getModelo() + ", \ngetCor()=" + getCor() + ", \ngetVelocMax()="
				+ calcVel(this.getVelocidadeMax()) + "cm/h, \ngetQtdRodas()=" + getQtdRodas() + "\n";
	}

	@Override
	public float calcVel(float velocMax) {
		return 0;
	}

	public int getTar() {
		return tar;
	}
	public final void setTar(int tara) {
		this.tar = tar;
	}

}
