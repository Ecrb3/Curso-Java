/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoaula05;
import java.util.Random;
/**
 *
 * @author eduardo.borges
 */
public class CursoAula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random(2);
        Conta cont1 = new Conta();
        cont1.setNumConta(1111);
        cont1.setDono("Jubileudo");
        cont1.abrirConta("CC");
        cont1.depositar(100);
        
        Conta cont2 = new Conta();
        cont2.setNumConta(2222);
        cont2.setDono("Creuza");
        cont2.abrirConta("CP");
        cont2.depositar(500);
        cont2.sacar(200);
        
        cont1.estadoAtual();
        cont2.estadoAtual();
    }
    
}
