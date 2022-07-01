/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;


public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
}
    public double aumentasalario(){
        return (getSalario()+ getSalario()*0.1);
    }
}
