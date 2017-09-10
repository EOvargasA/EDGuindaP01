/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.guinda.p01;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HONORIO ZAIBACK
 */
public class Sala<P extends Pelicula> implements Comparable<Sala<P>> {
    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    int numero;
    
    public Sala(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void Seleccion() {
       int menor;
        for (int i = 0; i < peliculas.size(); i++){
            menor = i;
            for (int j = i + 1; j < peliculas.size(); j++){
                if (peliculas.get(j).getNumero() < peliculas.get(menor).getNumero()){
                    menor = j;
                }
            }
            intercambio(i,menor);
        }
    }
    
    public void addPelicula(P p){
        if(peliculas.contains(p)){
            System.out.println("The movie "+p.getName()+" is already in this cinema room.");
        } else peliculas.add(p);

    }
    
    int Fetch(String name) {
        for(int i=0;i<peliculas.size();i++){
            if(peliculas.get(i).getName()==name)
                return i; 
        }
        return -1; 
    }
    
    @Override
    public int compareTo(Sala<P> o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void intercambio (int a, int b){
        Pelicula aux;
        aux = this.peliculas.get(a);
        this.peliculas.set(a,this.peliculas.get(b));
        this.peliculas.set(b,aux);
    }
    
    public void funcion (int asi, String peli){
        if (this.Fetch(peli) >= 0){
            this.peliculas.get(this.Fetch(peli)).Funcion(asi);
        }
    }
}