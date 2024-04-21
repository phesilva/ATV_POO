import model.Carga;
import model.Motor;
import model.Passeio;

public class Main {
    public static void main(String[] args) {
        Passeio carro = new Passeio();
        Motor motor = new Motor();

        motor.setPotenciaCV(200);
        motor.setQtdPistoes(4);
        carro.setCor("Prata - Predonimante");
        carro.setMarca("Volkswagen");
        carro.setModelo("Saveiro");
        carro.setMotor(motor);
        carro.setPlaca("AFG-89J0");
        carro.setOcupacoes(3);
        carro.setQtdRodas(4);
        carro.setVelocidadeMax(200);

        carro.calcVel(carro.getVelocidadeMax());

        System.out.println(carro.toString());

        Carga carga = new Carga();
        Motor motorC = new Motor();

        carga.setCargaMax(1000);
        carga.setCor("Cinza - Predonimante");
        carga.setMarca("Volkswagen");
        carga.setModelo("Toco");
        carga.setMotor(motor);
        carga.setPlaca("FRE-43I0");
        carga.setQtdRodas(4);
        carga.setTar(1200);
        carga.setVelocidadeMax(100);

        carga.calcVel(carga.getVelocidadeMax());
        System.out.println(carga.toString());




    }
}