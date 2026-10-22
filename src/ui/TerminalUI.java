package ui;
import java.util.Scanner;

public abstract class TerminalUI {
    

    private static Scanner sc = new Scanner(System.in);

    public static void exibirTexto(String text){
        try {
            for (char c : text.toCharArray()) {
                System.out.println(c);
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void limparTela(int limpar){
        for (int i = 0; i < limpar; i++) {
            System.out.println("\n");
        }
    }

    public static void limparTelaLateral(int limpar){
        for(int i = 0; i < limpar; i++){
            System.out.print(" ");
        }
    }

    public static void exibirLinha(String c, int tamanho){
        for (int i = 0; i < tamanho; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static int escolha(int min, int max){

        while (true) {

            int valor;
            System.out.print("\n-> ");
            if(sc.hasNextInt()){
                valor = sc.nextInt();

                if (valor >= min && valor <= max) {
                    return valor;

                }else{
                    System.out.printf("DIGITE UM VALOR VÁLIDO NO INTERVALO %d E %d.\n", min, max);
                }
            }else{
                sc.nextLine();
                System.out.println("\nPOR FAVOR, DIGITE UMA OPÇÃO VÁLIDA. TENTE NOVAMENTE.\n");
            }
        }
    }
    
    public static void pause(){
        System.out.println("\n[CLIQUE 'ENTER' PARA CONTINUAR...]\n\n");
        sc.nextLine();
    }
}
