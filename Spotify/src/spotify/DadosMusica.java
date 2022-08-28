/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

/**
 *
 * @author Administrator
 */
public class  DadosMusica {
    String musica;
    int lancamento;   
    String estilo;
    String album;
    Compositores compositor;
    Interprete cantor;
    Gravadora gravad;
    int indice=0;
    
    public DadosMusica(String Musica, String Estilo, int Lancamento, String Album){
        musica=Musica;
        lancamento=Lancamento;
        estilo=Estilo;
        album=Album;
    }
 
   
    public String getMusica() {
        return musica;
    }

    public int getLancamento() {
        return lancamento;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getAlbum() {
        return album;
    }

    public Compositores getCompositor() {
        return compositor;
    }

    public Interprete getCantor() {
        return cantor;
    }

    public Gravadora getGravad() {
        return gravad;
    }
    
    
    
    
    public void setMusica(String Musica) {
        this.musica = Musica;
    }

    public void setLancamento(int Lancamento) {
        this.lancamento = Lancamento;
    }
    
    public void setEstilo(String Estilo) {
        this.estilo = Estilo;
    }

    public void setAlbum(String Album) {
        this.album = Album;
    }
   
    public int getIndice(){
       return indice ++;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

}
