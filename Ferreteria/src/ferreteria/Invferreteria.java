/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invferreteria;

/**
 *@author Enrique Ceballos
 *@version 0.1
 */
public class Invferreteria {
  /**
    * Metodo principal.
   * 
   * @param args Los parametros de la linea de comandos.
   */
  
  // Aqui se ejceuta el main
  public static void main(String[] args) {
    Menu menuPrincipal = new Menu();
    int opcion;
    do {
      menuPrincipal.mostrarMenu();
      opcion = menuPrincipal.leerOpcion();
      menuPrincipal.realizarOperacion(opcion);
    } while (opcion != 0);
  }
}


  

