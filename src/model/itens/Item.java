package model.itens;

public abstract class Item {

    private String nome;
    private String descricao;

    public Item(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }




    public void verItem(){
        System.out.println("\n============ " + nome + " ==============");
        System.out.println("Descrição: " + descricao);
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    //getters
    public String getNome(){
        return this.nome;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
