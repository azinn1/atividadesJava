package roteiro4.parte1;

public class Principal {
    public static void main(String[] args) {
//        Criando o objeto:
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

//        Especificações do objeto:

        aluno1.matricula = 202411;
        aluno1.nome = "James";
        aluno1.curso = "Ciência Da Computação";
        aluno1.AnoIngresso = 2024;

        aluno2.matricula = 202412;
        aluno2.nome = "Jose";
        aluno2.curso = "ADS - Análise e desenvolvimento de sistemas";
        aluno2.AnoIngresso = 2023;

//        Saída das atribuições do objeto:

        System.out.println("Matrícula: " + aluno1.matricula);
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Curso: " + aluno1.curso);
        System.out.println("Ano de Ingresso: " + aluno1.AnoIngresso);
        System.out.println("\n");
        System.out.println("Matrícula: " + aluno2.matricula);
        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Curso: " + aluno2.curso);
        System.out.println("Ano de Ingresso: " + aluno2.AnoIngresso);

    }
}
