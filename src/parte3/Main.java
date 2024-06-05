package parte3;

public class Main {
    public static void main(String[] args) {
        Loja lojaA = new Loja("Loja do Bidu","Bidu Variedades","0878766420001/75");
        Loja lojaB = new Loja("Loja da Marta","Marta Bananas","0878762320001/75");

        lojaA.setValorFat(10000.00);
        lojaB.setValorFat(20000.00);



        System.out.println("******* Comparando com método estático *******");

        Loja.compararFat_static(lojaA, lojaB);

        System.out.println("******* Comparando com método NÃO estático *******");
        lojaA.compararFat_naoStatic(lojaA, lojaB);
    }
}
