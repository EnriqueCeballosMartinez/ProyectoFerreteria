/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invferreteria;

import java.util.Scanner;

/**
 *
 * @author Enrique Ceballos
 * @version 0.1
 * 
 * 
 * se inicializan el teclado de manera que no se puedan modificar una vez inician
 * 
 */


public class Entrada {
   private final Scanner sc;

  /**
   * Inicializa la clase Entrada .
   */
  public Entrada() {
    sc = new Scanner(System.in);
  }

  /**
   * Lee un numero entero desde el teclado ingresado por el usuario.
   * 
   * @return Valor numerico tipo entero.
   */
  public int leerEntero() {
    int entero = sc.nextInt();
    sc.nextLine();
    return entero;
  }

  /**
   * Lee un numero double desde el teclado ingresado por el usuario
   * 
   * @return Valor numerico tipo double.
   */
  public double leerDouble() {
    return sc.nextDouble();
  }
  
  /**
   * Lee una cadena de texto desde el teclado ingresado por el usuario
   * 
   * @return Cadena de texto tipo String.
   */
  public String leerCadena() {
    return sc.nextLine();
  }
   public String leerFecha() {
    return sc.nextLine();
  }
}
  

