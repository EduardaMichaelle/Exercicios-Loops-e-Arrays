package Loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Entre com a quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do{

            System.out.print("Insira um número: ");
            numero = scan.nextInt();

            if(numero%2 == 0) quantPares++;
            else quantImpares++;

            count++;

        }while(count < quantNumeros);

        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números ímpares: " + quantImpares);

        scan.close();

    }
}
