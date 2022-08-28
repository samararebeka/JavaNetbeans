/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classeatividade;

/**
 *
 * @author Administrator
 */
public class ClasseAtividade {
    TiposAtividade tipo;
    Lembretes lembrete;
    String atividade, descricao,local,prioridade;
    double horainicio, horafinal;

    public ClasseAtividade(TiposAtividade tipo, Lembretes lembrete, String atividade, String descricao, String local, String prioridade, double horainicio, double horafinal) {
        this.tipo = tipo;
        this.lembrete = lembrete;
        this.atividade = atividade;
        this.descricao = descricao;
        this.local = local;
        this.prioridade = prioridade;
        this.horainicio = horainicio;
        this.horafinal = horafinal;
    }

    public TiposAtividade getTipo() {
        return tipo;
    }

    public void setTipo(TiposAtividade tipo) {
        this.tipo = tipo;
    }

    public Lembretes getLembrete() {
        return lembrete;
    }

    public void setLembrete(Lembretes lembrete) {
        this.lembrete = lembrete;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public double getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(double horainicio) {
        this.horainicio = horainicio;
    }

    public double getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(double horafinal) {
        this.horafinal = horafinal;
    }
   
    
}
