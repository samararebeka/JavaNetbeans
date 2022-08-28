/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeatividade;


public class RepositorioAtividades {
    private final ClasseAtividade[] classeatividade;
    private int indice;
    private final static int MAX = 10;
    int n;
    int p;
    
    
    public RepositorioAtividades(){
        indice = 0;
        classeatividade = new ClasseAtividade[MAX];
   
    }

    
 //Estrutura Inserir Atividade

     public void inserir(ClasseAtividade a){
         classeatividade[indice] = a;
         indice++;
        
     }    
    
     
      
//Estrutura Remover Musica

     public void remover(String atividade){
         for(int i=0; i<indice; i++){
             if(classeatividade[i].getAtividade().equals(atividade)){
                classeatividade[i] = classeatividade[indice-1];
                classeatividade[indice-1] = null;
                indice--;
           }   
         }
       }
     
     
//Estrutura Procurar Musica
     
     public ClasseAtividade procurarAtividade(String atividade){
        ClasseAtividade temp = null;
           for(int i=0; i<indice; i++){
             if(classeatividade[i].getAtividade().equals(atividade)){
                 temp = classeatividade[i];
                 break;
            }
        }if(temp == null){
                if(n==0){
             System.out.println("\nATIVIDADE NAO ENCONTRADA!!!!\n");
         }
        } else  if(n==0) {
         System.out.println("\nATIVIDADE ENCONTRADA!!!\n A atividade encontrada foi: " + atividade + "\n"  );

         }
         return temp;
       }
   
      
      
      


public ClasseAtividade obteratividade(String atividade) {
    for(int i = 0; i < 10; i++) {
        if(classeatividade[i] != null) {
             if(classeatividade[i].getAtividade().equals(atividade)){
                    return classeatividade[i];
                }
        }
    }
    return null;
}


/*
public boolean addatividade(ClasseAtividade classeatividade) {
    for(int i=0; i<10; i++)
        if(ClasseAtividade[i] != null)
            return false;
        else {
            ClasseAtividade[i] = classeatividade[i].;
            return true;
    }
    return false;
}
}
        
      */  
           


 public void alterarClasseMusic(String atividade){
        ClasseAtividade temp = null;
           for(int i=0; i<indice; i++){
             if(classeatividade[i].getAtividade().equals(atividade)){
                 temp = classeatividade[i];
                 break;
            }
        }if(temp == null){
                if(n==0){
             System.out.println("\nATIVIDADE NAO ENCONTRADA!!!!\n");
         }
        } else  if(n==0) {
           classeatividade[indice] = temp;
         indice++;
         System.out.println("\nATIVIDADE ENCONTRADA!!!\n A atividade encontrada foi: " + atividade + "\n"  );
        }
       
 }



 //Estrutura imprimir Musica

     public void print(){
         for(int i=0; i<indice; i++){
            
            System.out.println("############################################################################################################################################################################");
            if(i==0){
               p=i+1; 
               System.out.println("Musica: "+ p);
            }
            else{
                p++;
                System.out.println("Musica: "+ p);
            }
            System.out.println("Nome da atividade: "+ classeatividade[i].getAtividade());            
            System.out.println("Descricao: "+ classeatividade[i].getDescricao());
            System.out.println("Local: "+ classeatividade[i].getLocal());
            System.out.println("Prioridade: "+ classeatividade[i].getPrioridade());
            System.out.println("Horario de inicio: "+ classeatividade[i].getHorainicio());
            System.out.println("Horario final: "+ classeatividade[i].getHorafinal());

                       
            
            System.out.println("Aula: "+ classeatividade[i].getTipo().getAula());
            System.out.println("Evento: "+ classeatividade[i].getTipo().getEvento());
            System.out.println("Evento: "+ classeatividade[i].getTipo().getQuickMeeting());
            System.out.println("Tarefa: "+ classeatividade[i].getTipo().getTarefa());
            
            
            System.out.println("Notificacao: "+ classeatividade[i].getLembrete().getNotificacoes());
  
        }   
    }
}
