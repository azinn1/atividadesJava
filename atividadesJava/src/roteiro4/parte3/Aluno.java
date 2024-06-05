package roteiro4.parte3;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;

//    Construtor:

    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso) {
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
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