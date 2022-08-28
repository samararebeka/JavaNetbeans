
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Administrator
 */
public class Resultado {
    
private String nomeEspecie; // nome da especie
private int quantidade; // quantidade de animais da especie

public Resultado(String nomeEspecie, int quantidade) {
this.nomeEspecie = nomeEspecie;
this.quantidade = quantidade;
}

public String getNomeEspecie() {
return nomeEspecie;
}
public int getQuantidade() {
return quantidade;
}  

    public void setQuantidade(int num) {
        this.quantidade = quantidade + num;
    }
}
