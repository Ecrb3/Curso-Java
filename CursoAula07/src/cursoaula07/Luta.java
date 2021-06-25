/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoaula07;
import java.util.Random;
/**
 *
 * @author eduardo.borges
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.isAprovada()){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random rd = new Random();
            int vencedor = rd.nextInt(3);
            switch(vencedor){
                case 0:
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    System.out.println("Houve um empate");
                    break;
                case 1:
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println("Vencedor da luta foi " + desafiante.getNome());
                    break;
                case 2:
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    System.out.println("Vencedor da luta foi " + desafiado.getNome());
                    break;
            }
            
        }else{
            System.out.println("Essa luta não pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
