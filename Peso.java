package peso;

import java.util.Scanner;

public class Peso {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double peso, alt, imc;

        System.out.println("Digite seu peso:");
        peso = ler.nextDouble();

        System.out.println("Digite sua altura:");
        alt = ler.nextDouble();

        imc = peso / Math.pow(alt, 2);

        System.out.printf("Seu IMC é: %.2f \n", imc);

        if (imc < 20) {
            System.out.println("abaixo do peso");
        } else if (imc >= 20 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobre Peso");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Obeso");
        } else {
            System.out.println("Obeso Mórbido");
        }

    }

}
