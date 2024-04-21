import javafx.scene.SubScene;
import model.Conta;

public class Teste {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setConta(1);
        conta.setLimite(10);
        conta.setCodigo(1);
        conta.setSaldo(100);

        try {
            boolean operacaoSucesso = conta.deposita(109.12F);
            if (operacaoSucesso){
                System.out.println("valor depositado com sucesso!");
            }
            operacaoSucesso = conta.saca(109.11F);
            if (operacaoSucesso){
                System.out.println("Valor sacado com sucesso!");
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}