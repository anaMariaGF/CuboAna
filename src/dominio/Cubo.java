/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Ana
 */
public class Cubo {
    //Declaro las propiedades del cubo
    float alto;
    float ancho;
    float profundo;

    //Dos constructores uno vacio y otro con todos los elementos
    public Cubo() {
    }

    public Cubo(float alto, float ancho, float profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getProfundo() {
        return profundo;
    }

    public void setProfundo(float profundo) {
        this.profundo = profundo;
    }

    @Override
    public String toString() {
        return "Cubo:" + "alto= " + alto + ", ancho= " + ancho + ", profundo= " + profundo +" ";
    }
    
    
    
 /**
 *Este método 
 * 
 */

    public float calcularVolumen(float a, float b, float c) {
        float vol = -12;
        return vol = a*b*c;
    }

}
