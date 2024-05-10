/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.practica4;
import java.util.Collections;
import java.util.Comparator; 
import java.util.List;
import java.util.ArrayList; 
/**
 *
 * @author Emanuel Seiji Massuda Cuevas (poppe)
 * @param <T>
 */
public class Jugador<T> {
    private T dato = null;
    private Nodo inicio = null;
    private int contador = 0;
    
    public Jugador(){
        this.dato = null;
        this.inicio = null;
    }
    
    public Jugador(T dato){
        this.dato = dato;
        this.inicio = null;
    }
    
    public void insertaInicio(T dato){
        Nodo n = new Nodo(dato);
        n.setSig(inicio);
        inicio = n; 
        contador++;
    }
    
    public T eliminaInicio(){
        T dato = null;
        if(inicio == null){
            System.out.println("Lista vacia");
        } else{
            dato = (T) inicio.getInfo();
            inicio = inicio.getSig();
        }
        contador--;
        return dato;
    }
    
    public void insertaFinal(T dato){
        Nodo n = new Nodo(dato);
        if(inicio == null){
            n.setSig(inicio);
            inicio = n;
        } else{
            Nodo r = inicio;
            while(r.getSig() != null){
                r = r.getSig();
            }
            r.setSig(n);
            n.setSig(null);
        }
    }
    
    public T eliminaFinal(){
        T dato = null;
        if(inicio == null){
            System.out.println("Lista vacia");
        } else if(inicio.getSig() == null){
            dato = (T) inicio.getInfo();
            inicio = null;
        } else{
            Nodo r = inicio;
            Nodo a = r;
            while(r.getSig() != null){
                a = r;
                r = r.getSig();
            }
            a.setSig(null);
            dato = (T) r.getInfo();
        }
        return dato; 
    }
    
    public String mostrarLista(){
        String cadena = "";
        if(inicio == null){
            return "Lista Vacia";
        } else{
            Nodo V = inicio;
        while(V != null){
            cadena += V.getInfo();
            V.getSig();
        }
        return cadena;
        }
    }
    
    public boolean isEmpty(){
        return inicio == null;
    }
    
    public int regresarSize(){
        return contador; 
    }
}

