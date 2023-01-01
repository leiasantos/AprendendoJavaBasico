import java.util.Scanner;

public class aula0007 {
    public static void main(String[] args){
        int num;
        System.out.println("Digite o número 1!");

        try (Scanner in = new Scanner(System.in)) {
            num = in.nextInt();
        }

        if(num == 1){
            System.out.println("Obrigado por digitar o um.");
        }else{
            System.out.println("O número digitado não é igual a um...");
        }
    }
}
