package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Service service = new Service();
        boolean exibirMenu = true;
        while (exibirMenu) {
            System.out.println("Escolha \n1-Adicionar Livro \n2-Listar Livros \n3-Atualizar Livro \n4-Deletar Livro \n5-Sair");
            int escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    entrada.nextLine();
                    System.out.println("Nome do  Livro");
                    String nome = entrada.nextLine();
                    System.out.println("Nome do Autor");
                    String nomeAutor = entrada.nextLine();
                    service.addLivros(nome, nomeAutor);
                    break;
                case 2:
                    System.out.println("listando LIvro");
                    service.listarLivros();
                    break;
                case 3:
                    System.out.println("Atualizando LIvro");
                    service.listarLivros();
                    System.out.println("digite o numero do livro");
                    int numero = entrada.nextInt();
                    System.out.println("nome do livro");
                    nome = entrada.nextLine();
                    service.atualizarLivro(numero, nome);
                    break;
                case 4:
                    System.out.println("Deletando LIvro");
                    service.listarLivros();
                    System.out.println("qual numero vc quer escolher ");
                    numero = entrada.nextInt();
                    service.excluirLivro(numero);
                    break;
                case 5:
                    System.out.println("Saindo");
                    exibirMenu = false;
                    break;
                default:
                    System.out.println("Numero Invalido");
            }
        }

    }
}