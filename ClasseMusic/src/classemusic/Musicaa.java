/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classemusic;
import java.util.Scanner;

public class Musicaa {
    
    
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
       
        
        RepositorioMusicas musicas = new RepositorioMusicas();

       
      
        
        String GraNome, GraPais,  Incantor, Inpais;
        String ComNom, ComPais, ComDataN, Indatanasc;
        String NomMus, EstiMusic, AlbMusic, AltMusic, SN;
        int lancam, Grafundacao, cont=0 ;
        
        do{
        System.out.println("\nDigite nome da música: ");
        NomMus = entrada.next();
        System.out.println("Estilo da música: ");
        EstiMusic = entrada.next();
        System.out.println("Album: ");
        AlbMusic = entrada.next();
        System.out.println("Lancamento: ");
        lancam = entrada.nextInt();
        
        
        System.out.println("\nNome da gravadora: ");
        GraNome = entrada.next();
        System.out.println("Pais de fundacao: ");
        GraPais = entrada.next();
        System.out.println("Ano de fundacao: ");
        Grafundacao = entrada.nextInt();
        
        
        System.out.println("\nNome do Interprete:  ");
        Incantor = entrada.next();
        System.out.println("Pais de Nascimento : ");
        Inpais = entrada.next();
        System.out.println("Ano de Nascimento: ");
        Indatanasc = entrada.next();
        
        System.out.println("\nNome do Compositor:  ");
        ComNom = entrada.next();
        System.out.println("Pais de Nascimento : ");
        ComPais = entrada.next();
        System.out.println("Ano de Nascimento: ");
        ComDataN = entrada.next();
    
        Interprete cantor = new Interprete(Incantor, Inpais, Indatanasc);
        Compositores compos = new Compositores(ComNom, ComPais, ComDataN);
        Gravadora Grav = new Gravadora(GraNome, GraPais, Grafundacao);
        ClasseMusic musica = new ClasseMusic(Grav, cantor, compos, NomMus, EstiMusic, AlbMusic, lancam);        
       
        musicas.inserir(musica);
        
        cont++;
        }while(cont!=3);
        System.out.println("\nDeseja procurar alguma musica?\n S=para sim\n N= para nao\n");
        SN=entrada.next();
        if(SN.equals("S")|| SN.equals("s")){ 
        System.out.println("\nDigite o nome da musica: \n");
        AltMusic = entrada.next();
        musicas.procurarMusica(AltMusic);    
         }  
        musicas.print();    
        System.out.println("\nDeseja remover alguma musica?\n S=para sim\n N= para nao\n");
        SN=entrada.next();
        if(SN.equals("S")|| SN.equals("s")){ 
        System.out.println("\nDigite o nome da musica: \n");
        AltMusic = entrada.next();
        musicas.removerClasseMusic(AltMusic);
        System.out.println("\nMusica deletada \n");
        musicas.print();    
    } 
  }
}