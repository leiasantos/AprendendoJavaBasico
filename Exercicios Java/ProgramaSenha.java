import java.util.Scanner;

public class ProgramaSenha {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Login");
            String login = in.nextLine();

            System.out.println("Senha");
            String senha = in.nextLine();

            if (login.equals("leia") && senha.equals("1234")) {
                System.out.printf("usuário %s logado com sucesso.", login);
            } else {
                System.out.println("Login ou senha inválidos!");
            }
        }

    }
}