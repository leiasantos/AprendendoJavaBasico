import java.util.Scanner;

public class aula0012Constante {
    
    public static void main(String[] args){

        /*
         *Os daddos de uma constante nunca serão alterados
         uma constante tem o seu endereço protegido
         nunca será desalocada
         declaramos uma vex, utilizamos varias vezes
         */

         final double vsom = 340.28;

         System.out.println("Digite o espaço de tempo: ");

         try (Scanner in = new Scanner(System.in)) {
            int tempo = in.nextInt();

             System.out.println("A distância seria de: " + tempo * vsom + "metros percorridos");

             System.out.println("A distância km: " + (tempo * vsom) / 1000 + " km percorridos" );
        }

    
    }
}
