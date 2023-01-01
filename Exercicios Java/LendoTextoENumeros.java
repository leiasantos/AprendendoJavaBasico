import java.util.Scanner;
public class LendoTextoENumeros {
    
    public static void main(String[] args){

      
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Digite o seu nome: ");
            String  nome = in.nextLine();

             System.out.println("Digite a sua idade: ");
            int idade = in.nextInt();
            
            System.out.println("Digite a sua cidade: ");
            String cidade = in.next();

            System.out.print("Olá. Meu nome é " + nome);
            System.out.print(", sou natural de " +  cidade );
            System.out.print(" tenho " + idade);
        }
         
        System.out.print(" anos, estou aprendendo a programar em java.");





    }
}
