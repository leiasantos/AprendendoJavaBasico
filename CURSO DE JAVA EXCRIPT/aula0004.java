import java.util.Scanner;
public class aula0004 {

    public static void main(String[] args){
     
        System.out.println("Informe a idade do seu cachorro: ");
        try (Scanner in = new Scanner(System.in)) {
            int idadeCachorro = in.nextInt();
            idadeCachorro = idadeCachorro * 7;

            System.out.println("O seu cachorro tem " + idadeCachorro + "anos");
        }

    }

}
