package Semana07;

public class Atribuicao {
	//atributos
    private Professor professor;
    private Disciplina disciplina;

    //contrutor
    public Atribuicao(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
    }

    //metodos de acesso
    public Professor getProfessor() {
        return professor;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }

    //metodos modificadores
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getDados() {
        return professor.getDados() + "\n" + disciplina.getDados();
    }
}
