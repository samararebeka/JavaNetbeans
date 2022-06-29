/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classemusic;

/**
 *
 * @author Administrator
 */
public class RepositorioMusicas {

    private final ClasseMusic[] classemusic;
    private int indice;
    private final static int MAX = 10;
    int n;
    int p;
    String a;

    
    public RepositorioMusicas(){
        indice = 0;
        classemusic = new ClasseMusic[MAX];
   
    }
    
    
 //Estrutura Inserir Musica

     public void inserir(ClasseMusic a){
         classemusic[indice] = a;
         indice++;
        
     }    
    
     
     
//Estrutura Remover Musica

     public void removerClasseMusic(String musica){
         for(int i=0; i<indice; i++){
             if(classemusic[i].getMusica().equals(musica)){
                classemusic[i] = classemusic[indice-1];
                classemusic[indice-1] = null;
                indice--;
           }   
         }
       }
     
     
//Estrutura Procurar Musica
     
     public ClasseMusic procurarMusica(String musica){
         ClasseMusic temp = null;
           for(int i=0; i<indice; i++){
             if(classemusic[i].getMusica().equals(musica)){
                 temp = classemusic[i];
                 break;
            }
        }if(temp == null){
                if(n==0){
             System.out.println("\nMUSICA NAO ENCONTRADA!!!!\n");
         }
        } else {
         System.out.println("\nMUSICA ENCONTRADA!!!\n A musica encontrada foi: " +musica + "\n"  );

         }
         return temp;
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
            System.out.println("Nome da musica: "+ classemusic[i].getMusica());            
            System.out.println("Estilo: "+ classemusic[i].getEstilo());
            System.out.println("Lancamento: "+ classemusic[i].getLancamento());
            System.out.println("Album: "+ classemusic[i].getAlbum());
            
            System.out.println("Compositor: "+ classemusic[i].getCompositores().getCompositor());
            System.out.println("Data Nascimento: "+ classemusic[i].getCompositores().getDataNasc());
            System.out.println("Pais: "+ classemusic[i].getCompositores().getPais());

            System.out.println("Cantor: "+ classemusic[i].getInterprete().getCantor());
            System.out.println("Data de Nascimento: "+ classemusic[i].getInterprete().getDataNasc());
            System.out.println("Pais: "+ classemusic[i].getInterprete().getPais());
            
            System.out.println("\nGravadora: "+ classemusic[i].getGravadora().getNome());
            System.out.println("Pais de fundacao: "+ classemusic[i].getGravadora().getPais());
            System.out.println("Ano de Fundacao: "+ classemusic[i].getGravadora().getFundacao());
        }   
    }
}