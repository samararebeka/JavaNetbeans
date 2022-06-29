/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classemusic;

/**
 *
 * @author Administrator
 */
public class Gravadora {
   String nome;
   String pais;
   int fundacao;

    public Gravadora(String nome, String pais, int fundacao) {
        this.nome = nome;
        this.pais = pais;
        this.fundacao = fundacao;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getFundacao() {
        return fundacao;
    }

    public void setFundacao(int fundacao) {
        this.fundacao = fundacao;
    }
   
   
}

