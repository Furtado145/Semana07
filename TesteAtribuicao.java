package Semana07;

import javax.swing.JOptionPane;

public class TesteAtribuicao {
	public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Nome do professor(a):");
        int idade = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Idade: ")
        );
        String materia = JOptionPane.showInputDialog(null, "Nome da matéria:");
        boolean pratica = Boolean.parseBoolean(
            JOptionPane.showInputDialog(null, "Pratica? (true/false)")
        );
        
        //Cria o professor
        Professor professor = new Professor(nome, idade);

        //Cria a materia
        Disciplina disciplina = new Disciplina(materia, pratica);
        
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        //Mostra Professor e Disciplina
        JOptionPane.showMessageDialog(null, atribuicao.getDados());
    }
}
