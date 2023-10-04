/*Faça um programa para ler dois valores
inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa*/

import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();
        
        soma = A + B;
        
        System.out.println("Soma =" + soma);
    }

}
