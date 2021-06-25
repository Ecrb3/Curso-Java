/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoaula05;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author eduardo.borges
 */
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }
    public void estadoAtual(){
        System.out.println("---------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
   
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50);
        }else if(t == "CP"){
           this.setSaldo(150);
        }
        System.out.println("Conta " + this.getDono() + " aberta com sucesso!");
    }   

    public void fecharConta(){
        if(this.getSaldo() == 0){
            this.setStatus(false);
        }else{
            System.out.println("Ainda há pendencias em sua conta");
        }
    }
    public void depositar(float v){
        if(this.isStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Foi depositado na conta " + this.getDono() + " R$ " + v + " Saldo final de: R$ " + this.getSaldo());
        }else{
            System.out.println("Sua conta esta fechada");
        }
    }
    
    public void sacar(float v){
        if(this.isStatus() == true){
            if(v <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Foi sacado na conta " + this.getDono() + " R$ " + v + " Saldo final de: R$ " + this.getSaldo());
            }else{
                System.out.println("Quantia maior que existente em conta!");
            }
        }else{
            System.out.println("Sua conta esta fechada");
        }
    }
    
    public void pagarMensal(){
        int v;
        if(this.getTipo().equals("CC")){
            v = 12;
        }else{
            v = 20;
        }
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Foi pago R$ " + v + " de mensalidade, saldo final de: R$ " + this.getSaldo());
        }else{
            System.out.println("Impossivel pagar em conta fechada");
        }
    }
    
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
