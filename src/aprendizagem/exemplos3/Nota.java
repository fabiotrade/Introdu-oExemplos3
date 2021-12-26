package aprendizagem.exemplos3;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Olá usuário, por favor, digite uma nota entre 0 e 10: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

    }
}
