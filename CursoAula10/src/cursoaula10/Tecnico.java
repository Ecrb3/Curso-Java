/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoaula10;

/**
 *
 * @author eduardo.borges
 */
public class Tecnico extends Aluno {
    private int registroProfissional;
    public void praticar(){
        System.out.println("Técnico " + this.nome + "Esta praticando");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
