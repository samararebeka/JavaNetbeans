/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classemusic;


public class Interprete {
    String cantor;
    String pais;
    String dataNasc;
    
    
public Interprete(String cantor, String pais, String dataNasc) {
        this.cantor = cantor;
        this.pais = pais;
        this.dataNasc = dataNasc;
    }
    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
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

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
   
}