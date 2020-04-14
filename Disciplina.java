package Semana07;

public class Disciplina {
	//atributos
    private String materia;
    private boolean pratica;

    //construtor
    public Disciplina(String materia, boolean pratica) {
        this.materia = materia;
        this.pratica = pratica;
    }

    //metodos de acesso
    public String getMateria() {
        return materia;
    }
    public boolean getPratica() {
        return  pratica;
    }

    //metodos modificadores
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void setPratica(boolean pratica) {
        this.pratica = pratica;
    }

    //metodo getDados
    public String getDados() {
        return "Disciplina: " + materia + ", Pratica: " + pratica;
    }
    
}
