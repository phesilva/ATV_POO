import controller.ImpostoBH;
import controller.ImpostoSC;
import controller.ImpostoSP;
import controller.ImpostoStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    try {
        ImpostoStrategy iptu = new ImpostoSP();
        iptu.calcularImposto();

        iptu = new ImpostoBH();
        iptu.calcularImposto();

        iptu = new ImpostoSC();
        iptu.calcularImposto();
    }catch (Exception e){
        System.out.println(" não foi digitado valor!");
        return;
    }
    }
}