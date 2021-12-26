package aprendizagem.exemplos3;

import java.util.Scanner;

/*Esse programa le dois conjuntos de valores,
oprimeiro representa o nome de um aluno e o segundo dua idade.
O programa é encerrado se for digitado o valor 0 no campo nome.
 */
public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Olá usuário, por favor, digite seu nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Por favor usuário, digite sua idade: ");
            idade = scan.nextInt();
        }


    }
}
