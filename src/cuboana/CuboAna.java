/*
 * Este programa dado un Cubo calcula el volumen del cubo y los muestra por pantalla
 */
package cuboana;

import dominio.Cubo;
import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class CuboAna {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        
        System.out.println("Bienvenido! Conozca el volumen de un cubo. Solo debe insertar la medida de cada uno de sus lados");
        System.out.println("Ingresa la medida del primer lado ");
        float ladoA = entrada.nextFloat();
        System.out.println("Ingresa la medida del segundo lado ");
        float ladoB = entrada.nextFloat();
        System.out.println("Ingresa la medida del tercer lado ");
        float ladoC = entrada.nextFloat();
        
        
        //Instancio Cubo
        Cubo c1 = new Cubo(ladoA, ladoB, ladoC);

        System.out.println("El volumen del cubo de medidas: " + c1.toString() + "es de: "
                + c1.calcularVolumen(c1.getAlto(),c1.getAncho(),c1.getProfundo())); //Llamo calcular volumen a la vez que imprimo el resultado

    }

}
