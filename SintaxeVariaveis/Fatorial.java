package SintaxeVariaveis;

public class Fatorial {
    public static void main(String[] args){
        int Fatorial = 1;
        for (int i = 1; i < 11; i++){
            Fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + Fatorial);
        }
    }
}
