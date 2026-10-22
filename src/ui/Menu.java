package ui;

import controller.ControllerMenu;

public abstract class Menu {

    private static ControllerMenu controllerMenu = new ControllerMenu();


    public static void exibirMenuInicial(){
        
        TerminalUI.limparTela(40);
        TerminalUI.exibirLinha("=", 100);
        TerminalUI.limparTelaLateral(42);

        System.out.println("The 100 Days");
        TerminalUI.limparTela(5);

        TerminalUI.limparTelaLateral(40);
        System.out.println("1 -> START\n");

        TerminalUI.limparTelaLateral(40);
        System.out.println("2 -> TUTORIAL");
        TerminalUI.limparTela(5);
        TerminalUI.exibirLinha("=", 100);

        controllerMenu.menuInicialController(TerminalUI.escolha(1, 2));

    }
}
