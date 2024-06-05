package parte3;

//Desenvolvido por:
//Tiago Santos Cerqueira Pereira
//Cauan Magno Cerqueira do Nascimento
//Estudantes de CCP - 1º Semestre UNIFACS.

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double ValorFat;


    public Loja(String nomeFantasia, String razaoSocial, String cnpj) {

        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
    public Loja(String nomeFantasia, String cnpj){

        this(nomeFantasia, nomeFantasia, cnpj);

    }
//    Getters & Setters classe Loja:

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorFat() {
        return ValorFat;
    }

    public void setValorFat(double valorFat) {
        this.ValorFat = valorFat;
    }

    public static void compararFat_static( Loja lojaA, Loja lojaB ) {

        if(lojaA.getValorFat() > lojaB.getValorFat()){
            System.out.println(lojaA.getNomeFantasia() + " Tem o faturamento maior");
        }else{
            System.out.println(lojaB.getNomeFantasia() + " Tem o faturamento maior");
        }

    }

    public void compararFat_naoStatic(Loja lojaA, Loja lojaB) {
        if(lojaA.getValorFat() > lojaB.getValorFat()){
            System.out.println(lojaA.getNomeFantasia() + " Tem o faturamento maior");
        }else{
            System.out.println(lojaB.getNomeFantasia() + " Tem o faturamento maior");
        }
    }


}
