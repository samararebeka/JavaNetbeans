/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Administrator
 */
public class AnimalImpl implements Animal{
    
    private String nomeEspecie;
    private String nomeAnimal;

    public AnimalImpl(String nomeEspecie, String nomeAnimal) {
        this.nomeEspecie = nomeEspecie;
        this.nomeAnimal = nomeAnimal;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie=null;
        this.nomeEspecie = nomeEspecie;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal=null;
        this.nomeAnimal = nomeAnimal;
    }
}
