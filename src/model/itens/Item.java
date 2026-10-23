package model.itens;

/*Todos os itens no jogo são herdados da classe Item. O jogo possui 3 tipos de itens, item de batalha
item consumível e item de historia*/

public abstract class Item {

    private String id;
    private String tipo;
    private String nome;
    private String descricao;


    public Item(String id, String  nome, String descricao, String tipo){
        this.id = id;
        this.nome= nome;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return String.format("ID: %s\nNOME: %s\nDESCRIÇÃO: %s", id, nome, descricao);
    }

    public void setId(String id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getTipo(){
        return tipo;
    }
    
}
