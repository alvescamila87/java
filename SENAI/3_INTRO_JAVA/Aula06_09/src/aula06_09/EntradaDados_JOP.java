
package aula06_09;

import javax.swing.JOptionPane;

/**
 *
 * @author camila_alves3
 */
public class EntradaDados_JOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados utilizando JOptionPane
        
        String nome = JOptionPane.showInputDialog("Informe um nome: ");
        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo, " + nome);
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade: "));
        JOptionPane.showMessageDialog(null, "A idade é: " + idade);
        
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso: "));
        JOptionPane.showMessageDialog(null, "O peso é: " + peso);
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário R$ "));
        JOptionPane.showMessageDialog(null, "O salário é de R$" + salario);     
        
        
    }
    
}
