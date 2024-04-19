/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.practica4;

/**
 *
 * @author Emanuel Seiji Massuda Cuevas (poppe)
 */
public class Nodo<T> {
    private T info;
    private Nodo sig;
    private Nodo ant;
    
    public Nodo(T info){
        this.info = info;
        sig = null;
        ant = null;
    }
    
    public Nodo(){
        info = null;
        sig = null;
        ant = null; 
    }
    
    public void setInfo(T info){
        this.info = info;
    }
    
    public T getInfo(){
        return this.info;
    }
    
    public void setSig(Nodo sig){
        this.sig = sig;
    }
    
    public Nodo getSig(){
        return this.sig;
    }
    
    public Nodo getAnt(){
        return this.ant;
    }
    
    public void setAnt(Nodo ant){
        this.ant = ant;
    }
    
    @Override
    public String toString(){
        return "Info: "+this.info;
    }
}
