 
package classemusic;


public class ClasseMusic {
    Gravadora gravadora;
    Interprete interprete;
    Compositores compositores;
    String musica, estilo, album;
    int lancamento; 

    public ClasseMusic(Gravadora gravadora , Interprete interprete, Compositores compositores, String musica, String estilo, String album, int lancamento) {
        this.gravadora = gravadora;
        this.interprete = interprete;
        this.compositores = compositores;
        this.musica = musica;
        this.estilo = estilo;
        this.album = album;
        this.lancamento = lancamento;
    }

    public Gravadora getGravadora() {
        return gravadora;
    }

    public void setGravadora(Gravadora gravadora) {
        this.gravadora = gravadora;
    }

    public Interprete getInterprete() {
        return interprete;
    }

    public void setInterprete(Interprete interprete) {
        this.interprete = interprete;
    }

    public Compositores getCompositores() {
        return compositores;
    }

    public void setCompositores(Compositores compositores) {
        this.compositores = compositores;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    
}
    
    