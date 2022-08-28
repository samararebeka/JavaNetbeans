/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

public  class RepositorioMusica {
    DadosMusica dadosMusica;
        
    int indice=0;
    
    public int getIndice(){
        return indice;
    }
    
    public void setIndice(int Indice){
        this.indice=Indice;
      
    }
    public void Inserir(DadosMusica dadM, Compositores comp, Interprete cant, Gravadora grav){
        dadosMusica=dadM;   
    }
  
    
    public void print(){
        
            System.out.println("#######");
            System.out.println("Musica: ");
            System.out.println("Nome da musica: "+ dadosMusica.getMusica());            
            System.out.println("Estilo: "+ dadosMusica.getEstilo());
            System.out.println("Lancamento: "+ dadosMusica.getLancamento());
            System.out.println("Album: "+ dadosMusica.getAlbum());
            System.out.println("Compositor: "+ dadosMusica.compositor);
            System.out.println("Cantor: "+ dadosMusica.getCantor());
            System.out.println("\nGravadora: "+ dadosMusica.getGravad());
            
    }
}

