/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.practica4;
import java.util.Random;
import java.util.Comparator;
/**
 *
 * @author Emanuel Seiji Massuda Cuevas (poppe)
 */
public class Carta {
    int valor;
    public static final Comparator<Carta> COMPARATOR = (Carta c1, Carta c2) -> c1.getValor() - c2.getValor();
    
    public Carta(int valor){
        this.valor = valor;
    }
    
    public Carta(){
        Random rmd = new Random();
        this.valor = rmd.nextInt(15);
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return this.valor;
    }
    
}
