package model.efeitos;

import model.entidades.Entidade;

public abstract class Efeito 
{
    private String nome;
    private String descricao;
    protected  int danoPorTurno;
    protected  int duracaoDeTurnos;

    public Efeito(String nome, String descricao, int danoPorTurno, int duracaoDeTurnos){
        this.nome = nome;
        this.descricao = descricao;
        this.danoPorTurno = danoPorTurno;
        this.duracaoDeTurnos = duracaoDeTurnos;
    }
    @Override
    public String toString(){
        return String.format("NOME: %s\nDESCRIÇÃO: %s\nDANO POR TURNO: %d\nDURAÇÃO: %d Turnos", nome, descricao, danoPorTurno, duracaoDeTurnos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDanoPorTurno() {
        return danoPorTurno;
    }

    public void setDanoPorTurno(int danoPorTurno) {
        this.danoPorTurno = danoPorTurno;
    }

    public int getDuracaoDeTurnos() {
        return duracaoDeTurnos;
    }

    public void setDuracaoDeTurnos(int duracaoDeTurnos) {
        this.duracaoDeTurnos = duracaoDeTurnos;
    }

    public abstract void aplicar(Entidade entidade);

    

}
