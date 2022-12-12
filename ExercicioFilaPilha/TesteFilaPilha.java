package ExercicioFilaPilha;

import java.util.Scanner;

import static java.lang.System.exit;

public class TesteFilaPilha {

    public static void imprimeMenu(String[] opcoes){
        System.out.print("\n\n\n\n Testando Fila e Pilha\n\n\n\n\n");
        for (String opcao : opcoes){
            System.out.println(opcao);
        }
    }

    public static void main(String[] args) {
        String[] opcoes = {"1- Manipulação de Fila",
                            "2- Manipulação de Pilha",
                            "3- Sair",
        };
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao = 1;
            while (opcao!=3){
                imprimeMenu(opcoes);
                try {
                    opcao = scanner.nextInt();
                    switch (opcao){
                        case 1: opcao1(); break;
                        case 2: opcao2(); break;
                        case 3: exit(0);
                    }
                }
                catch (Exception ex){
                    System.out.println("Por favor, escolha um valor entre " + opcoes.length);
                    scanner.next();
                }
            }
        }
    }

// Options
    private static void opcao1() {
        Fila fila = new Fila(100);
        System.out.println("Thanks for choosing option 1");
        String[] opcoesFila = {"1- Adicionar elemento",
                            "2- Remover elemento",
                            "3- Listar",
                            "4- Sair",
        };
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao = 1;
            while (opcao!=4){
                imprimeMenu(opcoesFila);
                try {
                    opcao = scanner.nextInt();
                    switch (opcao){
                        case 1: opcaoFila1(fila); break;
                        case 2: opcaoFila2(fila); break;
                        case 3: opcaoFila3(fila); break;
                        case 4: exit(0);
                    }
                }
                catch (Exception ex){
                    System.out.println(" Fila Por favor, escolha um valor entre " + opcoesFila.length);
                    scanner.next();
                }
            }
        }
    
    }
    private static void opcaoFila1(Fila fila) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o dado a ser adicionado: \n");
        String dado = scanner.nextLine();
        System.out.println("Inserindo " + dado);
        fila.adicionarItem(dado);
        }

    private static void opcaoFila2(Fila fila) throws Exception {
        System.out.println("Removendo " + fila.getPrimeiro());
        fila.removerItem();
        }

    private static void opcaoFila3(Fila fila) throws Exception {
        Fila.ImprimirFila(fila);
    }





    private static void opcao2() {
        Pilha pilha = new Pilha(100);
        System.out.println("Thanks for choosing option 1");
        String[] opcoes = {"1- Adicionar elemento",
                            "2- Remover elemento",
                            "3- Listar",
                            "4- Sair",
        };
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao = 1;
            while (opcao!=4){
                imprimeMenu(opcoes);
                try {
                    opcao = scanner.nextInt();
                    switch (opcao){
                        case 1: opcaoPilha1(pilha); break;
                        case 2: opcaoPilha2(pilha); break;
                        case 3: opcaoPilha3(pilha); break;
                        case 4: exit(0);
                    }
                }
                catch (Exception ex){
                    System.out.println("Por favor, escolha um valor entre " + opcoes.length);
                    scanner.next();
                }
            }
        }
    
    }

    
    private static void opcaoPilha1(Pilha pilha) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o dado a ser adicionado: \n");
        String dado = scanner.nextLine();
        System.out.println("Inserindo " + dado);
        pilha.adicionarItem(dado);
        }

    private static void opcaoPilha2(Pilha pilha) throws Exception {
        System.out.println("Removendo " + pilha.getTopo());
        pilha.removerItem();
        }

    private static void opcaoPilha3(Pilha pilha) throws Exception {
            Pilha.ImprimirPilha(pilha);
        }
    }
