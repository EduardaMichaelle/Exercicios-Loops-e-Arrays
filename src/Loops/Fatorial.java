package Loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int multiplicacao = 1;

        System.out.println("Entre com o número que deseja saber o fatorial: ");
        int fatorial = scan.nextInt();

        for(int i=fatorial;i>=1;i--){

            multiplicacao = multiplicacao * i;

        }

        System.out.println(fatorial + "! = " + multiplicacao);
        scan.close();

    }
}
