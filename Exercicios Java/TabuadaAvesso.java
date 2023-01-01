import java.util.Scanner;

public class TabuadaAvesso {
    
    public static void main(String[] args){

        System.out.println("Digite a tabuada que você deseja: ");

        try (Scanner in = new  Scanner(System.in)) {
            int tabuada = in.nextInt();

            for(int i =10; i >= 1; i--){

                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }
        }

    }
}
