import java.util.Scanner;

public class aula0005 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1, num2, soma, subtracao, multiplicacao, divisao;

        System.out.println("Insira um número: ");
        num1 = in.nextInt();

        System.out.println("Insira um número: ");
        num2 = in.nextInt();

        soma = num1 + num2;
        System.out.println("O resultado da soma é: " + soma);

        subtracao = num1 - num2;
        System.out.println("O resultado da subtraçãoo é: " + subtracao);

        multiplicacao = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + multiplicacao);

        divisao = num1 / num2;
        System.out.println("O resultado da divisão é: " + divisao);

    }
}
