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
    
    public String mostrarRecursivo() {
    return mostrarRecursivo(inicio);
    }

    private String mostrarRecursivo(Nodo<T> nodo) {
    if (nodo == null) {
        return "";
        }
    return "\n" + nodo.getInfo() + mostrarRecursivo(nodo.getSig());
    }
    
    public T eliminaX(T x){
        T dato = null;
        if(inicio == null){
            System.out.println("Lista vacia");
        } else if(inicio.getSig() == null){
            dato = (T) inicio.getInfo();
            if(x != dato){
               dato = null;
            }
        } else{
            int chk = 0;
            Nodo n = null;
            Nodo r = inicio;
            while(r.getSig() != null && chk == 0){
                if((T) r.getInfo() == x){
                    dato = (T) r.getInfo();
                    r = r.getSig();
                    n.setSig(r);
                    chk = 1;
                    return dato;
                } else if(r.getSig() == null){
                    System.out.println("Utiliza eliminaFin");
                    chk = 1;
                }
                n = r; 
                r = r.getSig();
            }
        }
        return dato;
    }
    
    public int buscar(T x){
        T dato = null;
        int contador = 0;
        if(inicio == null){
            System.out.println("Lista vacia");
        } else if(inicio.getSig() == null){
            System.out.println("Solo un nodo en lista");
        } else{
            Nodo r = inicio;
            while(r.getSig() != null){
                if(r.getInfo() == x){
                    return contador; 
                }
                r = r.getSig();
                contador++;
            }
        }
        return contador;
    }
    
    public T eliminaPosicion(int posicion){
        int contador = 0;
        T dato = null;
        if(inicio == null){
            System.out.println("Lista vacia");
        } else if(inicio.getSig() == null){
            if(posicion == 0){
                dato = (T) inicio.getInfo();
                inicio = null; 
            }
        } else{
            Nodo n = null;
            Nodo r = inicio;
            int chk = 0;
            while(r.getSig() != null && chk == 0){
                n = r;
                r = r.getSig();
                contador++;
                if(contador == posicion || r.getSig() != null){
                    dato = (T) r.getInfo();
                    r = r.getSig();
                    n.setSig(r);
                    chk = 1;
                } else if(r.getSig() == null){
                    System.out.println("Utiliza eliminaFin");
                    chk = 1;
                }
            }
        }
        return dato; 
    }
    
    public void ordenarLista(){
        int contador = 0;
        if(inicio == null){
            System.out.println("Lista vacia");
        } else if(inicio.getSig() == null){
            System.out.println("Un solo valor en lista");
        } else{
            Nodo r = inicio;
            List<Nodo> nodos = new ArrayList<>();
            while(r.getSig() != null){
                nodos.add(r);
                r = r.getSig();
            } 
            nodos.add(r);
            Collections.sort(nodos, Comparator.comparing(Nodo -> (String) Nodo.getInfo()));
            for(Nodo nodo : nodos){
                if(contador == 0){
                    inicio = nodo;
                    inicio.setSig(null);
                } else if(contador == 1){
                    inicio.setSig(nodo);
                    r = nodo; 
                } else{
                    r.setSig(nodo);
                    r = nodo; 
                }
                contador++;
            }
            r.setSig(null);
        }
    }
    
    public void insertaEnPosicion(T dato, int posicion){
        int contador = 0;
        T valor = null;
        if(inicio == null){
            System.out.println("Lista vacia");
        } else if(inicio.getSig() == null){
            if(posicion == 1){
                Nodo n = new Nodo(dato);
                n.setSig(null);
                inicio.setSig(n);
            } else{
                System.out.println("No se puede agregar en esta posicion");
            }
        } else{
            Nodo n = null;
            Nodo r = inicio;
            int chk = 0;
            while(r.getSig() != null && chk == 0){
                n = r;
                r = r.getSig();
                contador++;
                if(contador == posicion){
                    Nodo nuevo = new Nodo(dato);
                    n.setSig(nuevo);
                    nuevo.setSig(r);
                }
            }
        }
    }
    
    public int regresarSize(){
        return contador; 
    }
}

