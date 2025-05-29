package principal;

import interfacee.InterfaceBiblioteca;

/**
 * Classe principal que inicia o sistema de biblioteca
 * Esta é a classe de entrada do programa
 */
public class Main {
    
    /**
     * Método main - ponto de entrada do programa
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        try {
            System.out.println("Iniciando Sistema de Biblioteca...");
            
            // Criar e executar a interface do sistema
            InterfaceBiblioteca interfaceBiblioteca = new InterfaceBiblioteca();
            interfaceBiblioteca.executar();
            
        } catch (Exception e) {
            System.err.println("Erro ao executar o sistema: " + e.getMessage());
            e.printStackTrace();
        }
    }
}