package model.entidades;

public abstract class Entidade {
    private String nome;
    private int vidaAtual, vidaMaxima;
    private int ataque;
    private int chanceCritico;
    private int defesa;

    public Entidade(String nome, int vidaMaxima, int ataque, int chanceCritico, int defesa){
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.ataque = ataque;
        this.chanceCritico = chanceCritico;
        this.defesa = defesa;
    }



    public abstract void atacar(Entidade entidade);
        
    public abstract void receberDano();



    //setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setVidaAtual(int vidaAtual){
        this.vidaAtual = vidaAtual;
    }

    public void setVidaMaxima(int vidaMaxima){
        this.vidaMaxima = vidaMaxima;
    }

    public void setAtaque(int ataque){
        this.ataque = ataque;
    }

    public void setDefesa(int defesa){
        this.defesa = defesa;
    }

    public void setChanceCritico(int chanceCritico){
        this.chanceCritico = chanceCritico;
    }


    //getters
    public String getNome(){
        return this.nome;
    }
    public int getVidaAtual(){
        return this.vidaAtual;
    }
    public int getVidaMaxima(){
        return this.vidaMaxima;
    }
    public int getAtaque(){
        return this.ataque;
    }
    public int getDefesa(){
        return this.defesa;
    }
    public int getChanceCritico(){
        return this.chanceCritico;
    }
    
}
