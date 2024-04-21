package controller;
import javax.swing.JOptionPane;

public class ImpostoSC implements ImpostoStrategy{
    @Override
    public void calcularImposto() {
        float areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho da área total: "));
        int numComodos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de comodos: "));
        float imposto = (areaTotal * 10) + (numComodos * 2);
        System.out.println("O imposto para de São Carlos é: R$" + imposto);

    }
}
