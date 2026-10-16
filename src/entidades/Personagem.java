package entidades;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Personagem extends Entidade {
    private Random random = new Random();
    private List<Item> inventario = new ArrayList<>();

    

    //Atributos Específicos e aleatórios
    private int inteligencia;
    private int agilidade;
    private int sorte;
    private int carisma;
    private int dinheiro;


    public Personagem(String nome, int vidaMaxima, int ataque, int chanceCritico, int defesa){

        super(nome, vidaMaxima, ataque, chanceCritico, defesa);
        this.inteligencia = random.nextInt(101);
        this.agilidade = random.nextInt(101);
        this.sorte = random.nextInt(101);
        this.carisma = random.nextInt(101);
    }

    public void atacar(Entidade entidade){

    }
    public void receberDano(){

    }


    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

}
