package Loops;
import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;
        
        do {

            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;

            if(numero > maior){
                maior = numero;
            }

            count = count + 1;

        }while(count < 5);

        System.out.println("O maior número: " + maior);
        System.out.println("\nA média: " + soma/5);
        scan.close();
    }
}