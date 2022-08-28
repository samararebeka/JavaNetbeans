/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;


public class Gravadora {
   String nome;
   String pais;
   int fundacao;
   
   public Gravadora(String Nome, String Pais, int Fundacao){
       nome=Nome;
       pais=Pais;
       fundacao=Fundacao;
   }
   
   public String getNome(){
       return nome;  
   }
  
   public String getPais(){
       return pais;
   }
   
   public int getFundacao(){
       return fundacao;
   }
   
   public void setNome(String Nome){
       this.nome=Nome;
   }
   public void setPais(String Pais){
       this.pais=Pais;
   }
   public void setFundacao(int Fundacao){
       this.fundacao=Fundacao;
   }
      
}
