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
public class Carta implements Comparator<Carta> {
    int valor;
    String color;
    public static final Comparator<Carta> COMPARATOR = (Carta c1, Carta c2) -> c1.getValor() - c2.getValor();
    
    public Carta(int valor, String color){
        this.valor = valor;
        this.color = color;
    }
    
    public Carta(String color){
        Random rmd = new Random();
        this.valor = rmd.nextInt(15);
        this.color = color;
    }
    
    public Carta(){
        Random rmd = new Random();
        this.valor = rmd.nextInt(15);
        this.color = null; 
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    
    
    @Override
    public String toString(){
        String mensaje = "";
        switch(this.valor){
            case 11 -> {
                mensaje += "Jack";
                break;
            }
            case 12 -> {
                mensaje += "Reina";
                break;
            }
            case 13 -> {
                mensaje += "Rey";
                break;
            }
            case 14 -> {
                mensaje += "As";
                break;
            }
            default -> {
                mensaje += this.valor;
                break;
            }
        }
        mensaje += color;
        return mensaje;
    }

    @Override
    public int compare(Carta o1, Carta o2) {
        return COMPARATOR.compare(o1, o2);   
    }
}
