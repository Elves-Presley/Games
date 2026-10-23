package model.entidades;

public abstract class Entidade {

    private String nome;
    private int vidaMaxima;
    private int vida;
    private int ataque;
    private int defesa;
    private String descricao;

    public Entidade(String nome, int vida, int vidaMaxima, int ataque, int defesa, String descricao) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.descricao = descricao;
    }

    

    public abstract void atacar(Entidade entidade);

    public abstract void sofrerDano();
    

    @Override
    public String toString(){
        return String.format("NOME: %s\nVIDA: %d\nATAQUE: %d\nDEFESA: %d\nDESCRIÇÃO: %s", nome, vida, ataque, defesa, descricao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

}
