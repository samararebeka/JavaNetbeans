/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeatividade;

/**
 *
 * @author Administrator
 */
public class TiposAtividade {
    String tarefa, evento, aula, quickMeeting;

    public TiposAtividade(String tarefa, String evento, String aula, String quickMeeting) {
        this.tarefa = tarefa;
        this.evento = evento;
        this.aula = aula;
        this.quickMeeting = quickMeeting;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getEvento(){
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getQuickMeeting() {
        return quickMeeting;
    }

    public void setQuickMeeting(String quickMeeting) {
        this.quickMeeting = quickMeeting;
    }
}
