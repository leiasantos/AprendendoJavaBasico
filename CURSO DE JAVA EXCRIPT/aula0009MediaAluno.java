import java.util.Scanner;

public class aula0009MediaAluno {
    
    public static void main(String[] args){
        
        try (Scanner in = new Scanner(System.in)) {
            double nota1, nota2, nota3, nota4;



            System.out.println("Digite a sua nota: ");
            nota1 = in.nextDouble();

            System.out.println("Digite a sua nota: ");
            nota2 = in.nextDouble();

            System.out.println("Digite a sua nota: ");
            nota3 = in.nextDouble();

            System.out.println("Digite a sua nota: ");
            nota4 = in.nextDouble();

            double soma = nota1 + nota2 + nota3 + nota4;
            soma = soma / 4;

            //System.out.println(soma);

            if(soma >= 7){
                System.out.println("Você foi aprovado, a sua média foi de: " +  soma) ;
            } else{
                System.out.println("Você foi reprovado, a sua média foi de : " + soma);
            }
        }




    }
}
