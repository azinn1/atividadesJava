package roteiro4.parte3;

public class Main {
    public static void main(String[] args) {

//                Chamando o construtor da classe Aluno:

        Aluno aluno01 = new Aluno(202401,"Cauan","CCP",2024);

        System.out.println("Matrícula: "+aluno01.getMatricula());
        System.out.println("Nome: "+aluno01.getNome());
        System.out.println("Curso: "+aluno01.getCurso());
        System.out.println("Ano Ingresso: "+aluno01.getAnoIngresso());

        aluno01.setMatricula(202402);

        System.out.println("Matrícula: "+aluno01.getMatricula());
        System.out.println("Nome: "+aluno01.getNome());
        System.out.println("Curso: "+aluno01.getCurso());
        System.out.println("Ano Ingresso: "+aluno01.getAnoIngresso());

    }
}