package model.efeitos;

import model.entidades.Entidade;

public class Envenenamento extends Efeito{
    private boolean isEfeito = false;
    private int ataqueOriginal;
    private int defesaOriginal;

    public Envenenamento(int danoPorTurno, int duracaoDeTurnos){
        super("Envenenamento", "O envenenamento faz com que a vítima perca ataque e defesa continuamente.= a cada turno", danoPorTurno, duracaoDeTurnos);
    }

    public boolean isEfeito() {
        return isEfeito;
    }

    public void aplicar(Entidade entidade){

        if(!isEfeito()){

            ataqueOriginal = entidade.getAtaque();
            defesaOriginal = entidade.getDefesa();
            isEfeito = true;
            System.out.printf("%s ESTÁ ENVENENADO!", entidade.getNome());

        }else{

            int vidaEntidade = entidade.getVida();
            int ataqueEntidade = entidade.getAtaque();
            int defesaEntidade = entidade.getDefesa();

            entidade.setVida(vidaEntidade - danoPorTurno);
            entidade.setAtaque(ataqueEntidade - 5);
            entidade.setDefesa(defesaEntidade - 5);

            duracaoDeTurnos--;

            if(duracaoDeTurnos == 0){
                entidade.setAtaque(ataqueOriginal);
                entidade.setDefesa(defesaOriginal);
            }

        }
    }
}
