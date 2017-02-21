/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invferreteria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Enrique Ceballos
 * @version 0.1
 */
public class Archivo {
  

  private FileOutputStream fos;
  private ObjectOutputStream oos;
  private FileInputStream fis;
  private ObjectInputStream ois;
  
  /**
   * Inicializa la clase Archivo se le asigna valor nulo.
   */
  public Archivo() {
    fos = null;
    oos = null;
    fis = null;
    ois = null;
  }
  
  /**
   * Guarda una lista de productos a un archivo a partir .
   * @param productos Productos a guardar.
   */
  public void guardar(List productos) {
    try {
      fos = new FileOutputStream("Ferreteria");
      oos = new ObjectOutputStream(fos);
      oos.writeObject(productos);
      oos.close();
      fos.close();
      System.out.println("Productos guardados correctamente.");
    } catch(FileNotFoundException e) {
      System.out.println("ERROR: " + e.getLocalizedMessage());
    } catch(IOException e) {
      System.out.println("ERROR: " + e.getLocalizedMessage());
    }
  }
  
  /**
   * Carga una lista de productos desde un archivo aqui se inicializa el archivo.
   * @return Productos del archivo.
   */
  public List cargar() {
    List productos = null;
    try {
      fis = new FileInputStream("Ferreteria");
      ois = new ObjectInputStream(fis);
      productos = (List) ois.readObject();
      ois.close();
      fis.close();
    } catch(FileNotFoundException e) {
      System.out.println("ERROR: " + e.getLocalizedMessage());
    } catch(IOException | ClassNotFoundException e) {
      System.out.println("ERROR: " + e.getLocalizedMessage());
    }
    return productos;
  }
}
