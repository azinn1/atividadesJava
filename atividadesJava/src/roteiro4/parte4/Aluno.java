package roteiro4.parte4;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;

//    Construtor:

    public Aluno(String pCurso, int pMatricula, String pNome, int pAnoIngresso) {
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
    }

//    Métodos:

    public int estaMatriculado(int qtdDisciplinas) {
        if(qtdDisciplinas <= 0){
            System.out.println("Situação: Não matriculado");
        }else{
            System.out.println("Situação: Matriculado em " + qtdDisciplinas + " disciplinas");
        }
        return qtdDisciplinas;
    }

// Getters & Setters:

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int pMatricula) {
        matricula = pMatricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String pNome) {
        nome = pNome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String pCurso) {
        curso = pCurso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int pAnoIngresso) {
        anoIngresso = pAnoIngresso;
    }
}
