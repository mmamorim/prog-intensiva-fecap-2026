package Encontro10ABR;

import java.util.Scanner;

public class Prog02 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();

        System.out.println("Boa tarde "+nome+"! Tudo bem com vc?");

    }
}
