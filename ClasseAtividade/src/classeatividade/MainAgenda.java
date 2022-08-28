/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeatividade;

import java.util.Scanner;



public class MainAgenda {
     public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
       
        
       RepositorioAtividades atividades = new RepositorioAtividades();

       
      
        
        String taref, event, aul, quick;
        String lembre;
        String Nomativ, descri, local, SN;
        int cont=0 ;
        double Horai, Horaf;
        
        do{
        System.out.println("\nDigite nome da atividade: ");
        Nomativ = entrada.next();
        System.out.println("Descricao: ");
        descri = entrada.next();
        System.out.println("Local: ");
        local = entrada.next();
        System.out.println("Hora de inicio: ");
        Horai = entrada.nextDouble();
        System.out.println("Hora final: ");
        Horaf = entrada.nextDouble();
        
        
        System.out.println("\nLembrete: ");
        lembre = entrada.next();
        
        
        
        System.out.println("\nTipo da atividade:  ");
        taref = entrada.next();
        System.out.println("Evento : ");
        event = entrada.next();
        System.out.println("Aula: ");
        aul = entrada.next();
        System.out.println("\nQuick-Meeting:  ");
        quick = entrada.next();
        
    
        TiposAtividade tiposatividade = new TiposAtividade(taref,  event, aul, quick);
        Lembretes lembretes = new Lembretes(lembre);
        ClasseAtividade atividade = new ClasseAtividade(tiposatividade, lembretes, Nomativ, descri, local, lembre, Horai, Horaf);        
       
       atividades.inserir(atividade);
        
        cont++;
        }while(cont!=2);
        System.out.println("\nDeseja procurar alguma atividade?\n S=para sim\n N= para nao\n");
        SN=entrada.next();
        if(SN.equals("S")|| SN.equals("s")){ 
        System.out.println("\nDigite o nome da atividade: \n");
        taref = entrada.next();
        atividades.procurarAtividade(taref);
         }  
        atividades.print();    
        
        System.out.println("\nDeseja remover alguma atividade?\n S=para sim\n N= para nao\n");
        SN=entrada.next();
        if(SN.equals("S")|| SN.equals("s")){ 
        System.out.println("\nDigite o nome da atividade: \n");
        taref = entrada.next();
        atividades.remover(taref);
        System.out.println("\nAtividade deletada \n");
        atividades.print();    
        } 
         System.out.println("\nDeseja alterar alguma atividade?\n S=para sim\n N= para nao\n");
        SN=entrada.next();
        if(SN.equals("S")|| SN.equals("s")){ 
        System.out.println("\nDigite o nome da atividade: \n");
        taref = entrada.next();
        atividades.alterarClasseMusic(taref);
        atividades.print();    
    } 
  }
}
