/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invferreteria;

import java.io.Serializable;

/**
 *
 * @author Enrique Ceballos
 * @version  0.1
 */
public class Producto implements Serializable{
   private int clave;
  private String nombre;
  private String descripcion;
  private double precioCompra;
  private int existencias;
  private String tipoUnidad;
  
  /**
   * Inicializa la clase Producto.
   */
  public Producto() {
    clave = 0;
    nombre = "Por definir";
    descripcion = "Por definir";
    precioCompra = 0;
    existencias = 0;
    tipoUnidad = "Por definir";
  }
  
  /**
   * Constructor sobrecargado.
   * @param clave Clave del producto numerica.
   * @param nombre Nombre del producto.
   * @param descripcion Descripción del producto.
   * @param precioCompra Precio del producto.
   * @param existencias Existencias del producto.
   * @param tipoUnidad Unidad de medición del producto.
   */
  public Producto(int clave, String nombre, String descripcion, double precioCompra, int existencias, String tipoUnidad) {
    this.clave = clave;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precioCompra = precioCompra;
    this.existencias = existencias;
    this.tipoUnidad = tipoUnidad;
  }

  public int getClave() {
    return clave;
  }

  public void setClave(int clave) {
    this.clave = clave;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public int getExistencias() {
    return existencias;
  }

  public void setExistencias(int existencias) {
    this.existencias = existencias;
  }

  public String getTipoUnidad() {
    return tipoUnidad;
  }

  public void setTipoUnidad(String tipoUnidad) {
    this.tipoUnidad = tipoUnidad;
  }
  
 /**
  *Hace que se realice la venta si el producto se encuentra en existencia
  * @return regresa verdadero si el prodcuto se encuentra
  * @return regressa falso si el producto no esta disponible
  */
  
 public boolean ventaProducto(){
   if (getExistencias() >=1){
    setExistencias (getExistencias() -1);
    return true;
   }
   return false;
 }
}

  

