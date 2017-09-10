/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.guinda.p01;
import java.util.ArrayList;
/**
 *
 * @author HONORIO ZAIBACK
 */
public abstract class Pelicula {
    String name;
    int numero;
    int Tvisitas;
    
    public Pelicula(String name){
        this.name = name;
        this.numero = 0;
        this.Tvisitas = 0;
    }
    
    public void Funcion(int aud){
        if (this.numero < aud){
            this.numero = aud;
        }
        this.Tvisitas = this.Tvisitas + aud;
    }

    public String getName() {
        return name;
    }

    public int getNumero() {
        return numero;
    }
    
    public int getTvisitas (){
        return this.Tvisitas;
    }
}