/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositoriocontasarray;


public class Main {
    public static void main(String[] args){
        Conta x = new Conta("123-x");
        Conta y = new Conta("33.a");
        Conta z = new Conta("421-1");
        
        Conta w = new Poupanca("test1");
        
        RepositorioContasArray teste = new RepositorioContasArray();
        teste.inserir(x);
        teste.inserir(y);
        teste.inserir(z);
        teste.inserir(w);
        teste.creditarConta("123-x", 500.35);
        teste.creditarConta("33.a", 250.21);
        teste.imprimirContas();
        teste.removerContas("123-x");
        System.out.println("\n\nImpressao Apos remocao");
        teste.debitarConta("33.a", 100.0);
        teste.creditarConta("421-1", 25.0);
        teste.imprimirContas();
    }
}
