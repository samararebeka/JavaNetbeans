/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repositoriocontasarray;

/**
 *
 * @author Administrator
 */
public class RepositorioContasArray {
    private Conta[] contas;
    private int indice;
    private final static int MAX = 100;
    
    public RepositorioContasArray(){
        indice = 0;
        contas = new Conta[MAX];
    }
    
    public void inserir(Conta c){
        contas[indice] = c;
        indice++;
    }
    
    private Conta procurarConta(String numero){
        Conta temp = null;
        for(int i=0; i<indice; i++){
            if(contas[i].getNumero().equals(Numero)){
                temp = contas[i];
                break;
            } 
        }
    if(temp == null){
        System.out.println("Conta não encontrada");
    }
    return temp;
    }
   }
  public void removerConta(String numero){
   for(int i=0; i<indice; i++){
     if(contas[i].getNumero().equals(numero)){
         contas[i] = contas[indice-1];
         contas[indice-1] = null;
         indice --;
       }
      }
    }
 public void imprimirContas(){
  for(int i=0; i<indice; i++){
System.out.println("########");
System.out.println("Conta: " + i);
System.out.println("Numero Conta: " + contas[i].getNumero());
System.out.println("Saldo Conta: " + contas[i].getSaldo());
        }
      }
public void creditarConta(String numero, double valor){
   Conta temp = this.procurarConta(numero);
   temp creditar(valor);       
}
 public void debitarConta(String numero, double valor){
    this.procurarConta(numero).debitar(valor);
   }
}

  