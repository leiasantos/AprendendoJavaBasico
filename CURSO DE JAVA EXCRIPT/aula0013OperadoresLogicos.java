import java.util.Scanner;

public class aula0013OperadoresLogicos {
    public static void main(String[] args){
       
    try (Scanner in = new Scanner(System.in)) {
        final int  maiorDeIdade, menorDeIdade;
           maiorDeIdade= 0;
           menorDeIdade= 0;
           System.out.println("Digite sua idade");
        int idade = in.nextInt();

           if(idade >= 18){
            System.out.println("Maior de idade");
           }else{
            if(idade <= 17){
                System.out.println("Menor de idade");
            }
           }
    }
     

    }
}
