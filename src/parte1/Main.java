package parte1;

//Desenvolvido por:
//Tiago Santos Cerqueira Pereira
//Cauan Magno Cerqueira do Nascimento
//Estudantes de CCP - 1º Semestre UNIFACS.

public class Main {
    public static void main(String[] args) {

        Loja loja = new Loja("McDonnagows","McDonnagows Remburguers", "79.212.343/0001-70");
        Loja loja2 = new Loja("BurgurQueen","","79.232.543/0001-68");

//        Saída de valores loja 1, para controle:
        System.out.println("Loja 1");
        System.out.println(loja.getNomeFantasia());
        System.out.println(loja.getRazaoSocial());
        System.out.println(loja.getCnpj());

//        Saída de valores loja 2, para controle:
        System.out.println("Loja 2");
        System.out.println(loja2.getNomeFantasia());
        System.out.println(loja2.getRazaoSocial());
        System.out.println(loja2.getCnpj());

    }
}
