package roteiro4.parte2;

public class Main {
    public static void main(String[] args) {

//                Chamando o construtor da classe Aluno:

        Aluno aluno01 = new Aluno(202401,"Cauan","CCP",2024);

        System.out.println("Matrícula: "+aluno01.matricula);
        System.out.println("Nome: "+aluno01.nome);
        System.out.println("Curso: "+aluno01.curso);
        System.out.println("Ano Ingresso: "+aluno01.anoIngresso);

        aluno01.matricula = 202402;

        System.out.println("Matrícula: "+aluno01.matricula);
        System.out.println("Nome: "+aluno01.nome);
        System.out.println("Curso: "+aluno01.curso);
        System.out.println("Ano Ingresso: "+aluno01.anoIngresso);
    }
}