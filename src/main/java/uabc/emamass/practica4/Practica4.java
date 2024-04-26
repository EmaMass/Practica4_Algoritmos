/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uabc.emamass.practica4;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Emanuel Seiji Massuda Cuevas (poppe)
 */
public class Practica4 {

    public static void main(String[] args) {
        //Prueba generacion de baraja - Metodo al correr al iniciar juego 
        int i = 2;
        String color = "";
        ArrayList<Carta> baraja = new ArrayList<Carta>();
        for(int x = 1; x <= 4; x++){
            switch(x){
                case 1:
                    color = "Pica";
                    break;
                case 2:
                    color = "Trebol";
                    break;
                case 3:
                    color = "Corazon";
                    break;
                case 4:
                    color = "Diamante";
                    break;
            }
            System.out.print(x);
            System.out.println(color);
            for(i = 2; i <= 14; i++){
                baraja.add(new Carta(i,color));
            }
        }
        Collections.shuffle(baraja);
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        for(i = 1; i <= 26; i++){
            j1.insertaInicio(baraja.remove(0));
            j2.insertaInicio(baraja.remove(0));
        }
    }
}
