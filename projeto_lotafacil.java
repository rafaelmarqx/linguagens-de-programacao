package br.newtonpaiva;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class projeto_lotafacil {

        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int choice;
            int subChoice;
            int numero;
            int numerorandom;
            int numpi;
            int numpiramdom = 0;

            char letraPremiada = 'R';
            char letra;

            do {
                System.out.println("ACESSAR MENU LOTAFÁCIL");
                System.out.println("1. Acessar");
                System.out.println("0. Sair");

                System.out.print("Escolha uma opção: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Você acaba de acessar o MENU LOTAFÁCIL");

                        do {
                            System.out.println("Menu LOTOFÁCIL:");
                            System.out.println("1. Apostar de 0 a 100");
                            System.out.println("2. Apostar de A à Z");
                            System.out.println("3. Apostar em par ou ímpar");
                            System.out.println("0. Voltar");

                            System.out.print("Escolha uma opção: ");
                            subChoice = scanner.nextInt();

                            switch (subChoice) {
                                case 1:
                                    System.out.println("Você escolheu APOSTAR DE 0 A 100!!\nInsira um número entre 0 e 100, boa sorte!!");
                                    numero = scanner.nextInt();
                                    numerorandom = random.nextInt(101);

                                    if (numero >= 0 && numero <= 100) {
                                        System.out.println("Número válido! Boa sorte!\nAguarde...");
                                        if (numerorandom == numero) {
                                            System.out.println("Parabéns!! Você ganhou R$ 1.000,00 reais!!\nIremos te retornar para o Menu LOTAFÁCIL.");
                                        } else {
                                            System.out.printf("Infelizmente não foi desta vez. Que pena! O número sorteado foi: %d\nIremos te retornar para o Menu LOTAFÁCIL.\n", numerorandom);
                                        }
                                    } else {
                                        System.out.println("Número fora do intervalo válido, tente novamente, iremos te retornar para o Menu LOTAFÁCIL.");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Você escolheu APOSTAR DE A à Z!!\nInsira uma letra entre A e Z, boa sorte!!");

                                    letra = (char) System.in.read();
                                    letra = Character.toUpperCase(letra);

                                    if (Character.isLetter(letra)) {
                                        System.out.printf("Boa, %c \nLetra válida! Boa sorte!\nAguarde...\n", letra);
                                        if (letra == letraPremiada) {
                                            System.out.println("Parabéns, Você ganhou R$ 500,00!!\nIremos te retornar para o Menu LOTAFÁCIL.");
                                        } else {
                                            System.out.printf("Infelizmente não foi desta vez. Que pena! A letra sorteada foi: %c\nIremos te retornar para o Menu LOTAFÁCIL.\n", letraPremiada);
                                        }
                                    } else {
                                        System.out.println("Letra fora do intervalo válido, tente novamente.");
                                    }
                                    break;

                                case 3:
                                    System.out.println("Você escolheu APOSTAR EM PAR OU ÍMPAR!!\nInsira um número e boa sorte!!");
                                    numpi = scanner.nextInt();


                                    if (numpi % 2 == 0) {


                                            System.out.printf("Você escolheu um número par!\nAguarde... \nParabéns!! Você ganhou R$ 100,00 reais!!\nIremos te retornar para o Menu LOTAFÁCIL.\n");
                                        } else {
                                            System.out.printf("Que pena! O número digitado foi um número ímpar e a premiação foi para números pares.\nIremos te retornar para o Menu LOTAFÁCIL.\n");
                                        }


                                    break;

                                case 0:
                                    System.out.println("Saindo do menu LOTOFÁCIL.");
                                    break;

                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                            }
                        } while (subChoice != 0);
                        break;

                    case 0:
                        System.out.println("Até a próxima :(");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (choice != 0);

            scanner.close();
        }
    }