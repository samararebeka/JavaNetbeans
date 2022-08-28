/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

public class FerramentasImpl implements Ferramentas{
   
    AnimalImpl[] temp;
    String[] Especie;
   
     public AnimalImpl[] filtraEspecie(AnimalImpl [] completo, String especieFiltrar){
         int cont=0; 
        AnimalImpl[] temp = new AnimalImpl[completo.length];
         int indice=0;
           for(int i=0; i<completo.length; i++){
             if(completo[i].getNomeEspecie().equals(especieFiltrar)){
                 temp[indice] = completo[i];
                 indice++;
                 cont=1;
                 break;
            }
        }
           if(cont==0){
                
             System.out.println("\nESPECIE NAO ENCONTRADA!!!!\n");
         
        }
         return temp;
       }
   


    public String[] classificaEspecies (AnimalImpl[] completo){
	String[] Especie = new String [completo.length];
        int indice=0;
        int cont;
        
	for(int i=0; i<completo.length; i++){
            cont=0;
            for( int j=0; j <indice; j++){
                if(Especie[j].equals(completo[i].getNomeEspecie())){
                   cont=1; 
                   break;
		}
            }
            if(cont==0){
                Especie[indice] = completo[i].getNomeEspecie();           
                System.out.println("\n Especie encontrada: "+ Especie[indice]);
                indice++;
            }
            
            
	} 
        return Especie;
    }

}
    /*
         System.out.println("\nESPECIE ENCONTRADA!!!\n A especie encontrada foi: " );

        
        for(int i=0; i<completo.length; i++){
             System.out.print(temp[i] + ", ");
        }*/