/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classemusic;

/**
 *
 * @author Administrator
 */
public class Compositores {
    String compositor; 
    String pais;
    String dataNasc;

    public Compositores(String compositor, String pais, String dataNasc) {
        this.compositor = compositor;
        this.pais = pais;
        this.dataNasc = dataNasc;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String
            dataNasc) {
        this.dataNasc = dataNasc;
    }
    
}
