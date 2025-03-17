package administrador;

import java.util.Locale;
import java.util.Scanner;

import administrador.sistemaInterno;

public class Usuario { // Nome da classe corrigido para seguir convenção PascalCase

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sistemaInterno calculo = new sistemaInterno();

        int codigo;

        do {
            System.out.println("Digite um número de 1 até 5: ");
            System.out.println("1-Soma   2-Subtração   3-Multiplicação   4-Divisão   5-Encerrar o programa!");
            codigo = sc.nextInt();

            if (codigo >= 1 && codigo <= 4) {
                System.out.print("Digite o primeiro número: ");
                calculo.x = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                calculo.y = sc.nextDouble();

                switch (codigo) {
                    case 1:
                        calculo.soma();
                        System.out.println("O resultado da soma é: " + calculo.resultado);
                        break;
                    case 2:
                        calculo.subtracao();
                        System.out.println("O resultado da subtração é: " + calculo.resultado);
                        break;
                    case 3:
                        calculo.multiplicacao();
                        System.out.println("O resultado da multiplicação é: " + calculo.resultado);
                        break;
                    case 4:
                        if (calculo.y == 0) {
                            System.out.println("Erro: divisão por zero não é permitida.");
                        } else {
                            calculo.divisao();
                            System.out.println("O resultado da divisão é: " + calculo.resultado);
                        }
                        break;
                }
                System.out.println(); // Espaço para melhor visualização no console

            } else if (codigo == 5) {
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Opção inválida! Digite um número de 1 a 5.");
            }

        } while (codigo != 5); // O loop só para quando o usuário digita 5

        sc.close();
    }
}