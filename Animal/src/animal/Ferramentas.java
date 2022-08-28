/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Administrator
 */
public interface Ferramentas {
    
    public abstract Animal[] filtraEspecie(AnimalImpl [] completo, String especieFiltrar);
    public abstract String[] classificaEspecies (AnimalImpl[] completo);

}

