/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteador;

import java.util.Scanner;

/**
 *
 * @author clodbrasilino
 */
public class Sorteador {
    
    public static int numero1 = 0;
    public static int numero2 = 0;
    public static int qtdeSorteios = 1;
    public static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true){
            System.out.println(" --- SORTEADOR ---");
            System.out.println("");
            System.out.println("Escolha uma opção:");
            System.out.println(" a - Definir primeiro limite");
            System.out.println(" b - Definir segundo limite");
            System.out.println(" c - Definir numero de sorteios");
            System.out.println(" d - Sortear");
            System.out.println(" e - Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = teclado.next();
            switch(opcao){
                case "a":
                    Sorteador.escolherNumero1();
                    break;
                case "b":
                    Sorteador.escolherNumero2();
                    break;
                case "c":
                    Sorteador.escolherQtdeRepeticoes();
                    break;
                case "d":
                    Sorteador.sortear();
                    break;
                case "e":
                    return;
                default:
                    System.out.println("Opção inválida.\n");
            }
        }
    }

    private static void escolherNumero1() {
        System.out.println(" --- PRIMEIRO LIMITE ---\n");
        System.out.print("Primeiro limite: ");
        Sorteador.numero1 = teclado.nextInt();
        teclado.nextLine();
    }

    private static void escolherNumero2() {
        System.out.println(" --- SEGUNDO LIMITE ---\n");
        System.out.print("Segundo limite: ");
        Sorteador.numero2 = teclado.nextInt();
        teclado.nextLine();
    }

    private static void escolherQtdeRepeticoes() {
        System.out.println(" --- REPETICOES ---\n");
        System.out.print("Quantidade de sorteios: ");
        Sorteador.qtdeSorteios = teclado.nextInt();
        teclado.nextLine();
    }

    private static void sortear() {
        int sorteiosRealizados = 0;
        System.out.println(" --- SORTEIO ---");
        System.out.print("Numeros premiados: ");
        while(sorteiosRealizados < Sorteador.qtdeSorteios){
            ++sorteiosRealizados;
            System.out.print(Sorteador.sortearUmNumero());
            if(sorteiosRealizados < Sorteador.qtdeSorteios){
                System.out.print(" - ");
            }
        }
        System.out.println();
    }

    private static int sortearUmNumero() {
        return (int) (Math.random() * Math.abs(numero1-numero2) + Math.min(numero1, numero2));
    }
}
