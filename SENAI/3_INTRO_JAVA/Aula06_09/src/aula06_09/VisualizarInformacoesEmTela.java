
package aula06_09;

import javax.swing.JOptionPane;

/**
 *
 * @author camila_alves3
 */
public class VisualizarInformacoesEmTela {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe um nome: ");
       
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Peso (kg): "));
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário R$"));
        
        JOptionPane.showMessageDialog(null, "Nome: " + nome
            + "\nIdade: " + idade
            + "\nPeso: " + peso
            + "\nSalário R$" + salario);
    }
    
}
