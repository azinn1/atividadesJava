package parte2;

public class Main {
    public static void main(String[] args) {
        Loja loja1 = new Loja("Loja do Bidu","Bidu Variedades","0878766420001/75");
        Loja loja2 = new Loja("Loja da Marta","","0878762320001/75");
        Loja loja3 = new Loja("Loja do Maicon","maicon planilhas","0878762320001/76");

        loja1.setValorFat(10000.00);
        loja2.setValorFat(20000.00);
        loja3.setValorFat(10000.00);


        System.out.println("**** Teste 1 ****");
        if(loja1.equals(loja2)){
            System.out.println("Estas Lojas são iguais");
        }else{
            System.out.println(loja1.getNomeFantasia()+ " é diferente da " + loja2.getNomeFantasia());
        }

        System.out.println("**** Teste 2 ****");
        if(loja1.equals(loja3)){
            System.out.println("Estas Lojas são iguais");
        }else{
            System.out.println(loja1.getNomeFantasia()+ " é diferente da " + loja2.getNomeFantasia());
        }

        System.out.println("**** Teste 3 ****");
        if(loja1.getValorFat() == loja3.getValorFat()){
            System.out.println("Faturamentos iguais");
        }else{
            System.out.println("Faturamentos diferentes");
        }
    }
}
