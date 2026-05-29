import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner leia = new 
    Scanner(System.in);

        double total=0;
        double produto;
        int resposta;

        do{
            System.out.println("Insira o valor do produto: ");
            produto = leia.nextDouble();

            total = total + produto;

            System.out.println("TOTAL: " + total);

            System.out.println("Aperte 1 para CONTINUAR ou 2 para FINALIZAR COMPRAS");
            resposta = leia.nextInt();

            switch (resposta) {
                case 1:
                  // CONTINUAR
                  break;

                case 2:
                System.out.println("TOTAL FINAL: " + total);
                        break;
                default:

                System.out.println("Cancelar Compra");
                     }
        } while (resposta !=2);

        leia.close();
        
    }
}
