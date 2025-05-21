package com.valcler.curso.conceitos.iniciais;

// --------------------------------------------------------
// EXERCÍCIO 01: SOMA DE DOIS NÚMEROS
// Fonte: Lista de Exercícios de Estrutura Sequencial (Educandoweb)
// URL URI Online Judge: www.urionlinejudge.com.br/judge/pt/problems/view/1003
//
// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.
//
// Exemplos:
// Entrada: 10, 30  | Saída: SOMA = 40
// Entrada: -30, 10 | Saída: SOMA = -20
// Entrada: 0, 0    | Saída: SOMA = 0
// --------------------------------------------------------

import java.util.Scanner;

public class Exercicio01Soma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int x, y, soma;

        System.out.println("Digite o primeiro valor inteiro:");
        x = sc.nextInt();

        System.out.println("Digite o segundo valor inteiro:");
        y = sc.nextInt();

        soma = x + y; 

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}