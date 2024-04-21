package controller;
import javax.swing.JOptionPane;

public class ImpostoSP implements ImpostoStrategy{

    @Override
    public void calcularImposto() {

        float areaT = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho da área total: "));
        int numComodos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de comodos: "));
        float imposto = (areaT * 10) + (numComodos * 2);
        System.out.println("O imposto para São Paulo é: R$" + imposto);

    }
}
