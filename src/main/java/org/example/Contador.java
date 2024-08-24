package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Contador {
    public static void main(String[] args) {

        System.out.println("Digite 'sair' para terminar, digite qualquer outra para continuar");
        String opcao = inputScanner();
        while (!opcao.equalsIgnoreCase("sair")) {

            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = Integer.parseInt(inputScanner());
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = Integer.parseInt(inputScanner());

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) {
                System.out.println(exception.getMessage());
            }

            System.out.println("Digite 'sair' para terminar");
            opcao = inputScanner();
        }




    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro!\n");

        for (int i=(parametroDois - parametroUm); i > 0; i--){
            System.out.print("Imprimindo o número 1: "+parametroUm);
            System.out.println("\t|\tImprimindo o número 2: " +parametroDois);
        }
    }

    private static String inputScanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }

}