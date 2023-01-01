import java.util.Scanner;

public class aula0003 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual o seu nome: ");
        String nome = entrada.next();
        System.out.println("Seja bem vindo " + nome + "!");

        System.out.println("Digite um número");
        Scanner in = new Scanner(System.in); 
        System.out.println(in.nextLine());
    }

}
