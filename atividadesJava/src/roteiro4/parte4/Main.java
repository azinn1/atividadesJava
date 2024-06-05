package roteiro4.parte4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//                Chamando o construtor da classe Aluno:

        Scanner sc = new Scanner(System.in);
        Aluno aluno01 = new Aluno("CCP",202401,"Cauan",2024);

//        Entrada de dados:

        System.out.println("Digite o número da matrícula: ");
        int matricula = sc.nextInt();
        aluno01.setMatricula(matricula);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.next();
        aluno01.setNome(nome);

        System.out.println("Digite o curso do aluno: ");
        String curso = sc.next();
        aluno01.setCurso(curso);

        System.out.println("Digite o ano de ingresso do aluno: ");
        int ano = sc.nextInt();
        aluno01.setAnoIngresso(ano);

        System.out.println("Digite a quantidade de disciplinas");
        int quantidade = sc.nextInt();
        aluno01.estaMatriculado(quantidade);

//        Saída dos dados inseridos:

        System.out.println("Matrícula: " + aluno01.getMatricula());
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano Ingresso: " + aluno01.getAnoIngresso());

    }
}