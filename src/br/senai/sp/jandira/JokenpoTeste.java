package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class JokenpoTeste {

	public static void main(String[] args) {

		// declarar variaveis que iremos utilizar
		Random sorteio = new Random();
		Scanner leitor = new Scanner(System.in);
		int escolhaJogador, escolhaComputador;

		// mostrar as opções ao usuario
		System.out.println("*** J O K E N P Ô");
		System.out.println();
		System.out.println("1 - pedra");
		System.out.println("2 - papel");
		System.out.println("3 - tesoura");
		System.out.println("----------------");
		System.out.println();
		System.out.print("Faça a sua escolha (1-3): ");

		// receber a escolha do jogador
		escolhaJogador = leitor.nextInt();

		// gerar escolha do computador
		escolhaComputador = sorteio.nextInt(1, 4);

		// mostrar as escolhas de cada jogador
		if (escolhaJogador == 1) {
			System.out.println("Você escolheu PEDRA!");
		}

		if (escolhaJogador == 2) {
			System.out.println("Você escolheu PAPEL!");
		}

		if (escolhaJogador == 3) {
			System.out.println("Você escolheu TESOURA!");
		}

		if (escolhaComputador == 1) {
			System.out.println("Computador escolheu PEDRA!");
		}

		if (escolhaComputador == 2) {
			System.out.println("Computador escolheu PAPEL!");
		}

		if (escolhaComputador == 3) {
			System.out.println("Computador escolheu TESOURA!");
		}

		// Determinar o ganhador
		if (escolhaJogador == 1) {
			if (escolhaComputador == 1) {
				System.out.println("O jogo empatou");
			}
			if (escolhaComputador == 2) {
				System.out.println("O computador empatou!!");
			}

			if (escolhaComputador == 3) {
				System.out.println("você ganhou!");
			}
		}
		
		if (escolhaJogador == 2) {
			if (escolhaComputador == 1) {
				System.out.println("você ganhou ");
			}
			if (escolhaComputador == 2) {
				System.out.println("O jogo empatou!!");
			}

			if (escolhaComputador == 3) {
				System.out.println("O computador ganhou!");
			}
		}
		
		if (escolhaJogador == 3) {
			if (escolhaComputador == 1) {
				System.out.println("O computador ganhou!");
			}
			if (escolhaComputador == 2) {
				System.out.println("Você ganhou!!");
			}

			if (escolhaComputador == 3) {
				System.out.println("O jogo empatou!");
			}
		}

	}

}
