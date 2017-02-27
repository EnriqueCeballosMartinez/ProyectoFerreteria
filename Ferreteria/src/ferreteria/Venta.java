/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invferreteria;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Enrique Ceballos
 * @version 0.1
*/
public class Venta implements Serializable {
  private int folio;
  private String productos;
  private double subtotal;
  private double iva;
  private int cantidad;
  private final Date fecha = new Date();
  /**
   * Aqui se inicializa la clase venta
   */
  public Venta() {
    folio = 0;
    productos = "";
    cantidad = 0;
    subtotal = 0;
    iva = 0;
    
  }
  
 /**
  * Aqui se genera un constructor sobrecargado
  * @param folio Folio de venta
  * @param productos  Productos seleccionados
  * @param cantidad Numero de productos
  * @param subtotal Costo de productos
  * @param iva Impuesto 
  * 
  */ 
  
 public Venta(int folio, String productos, int cantidad, double subtotal) {
    this.folio = folio;
    this.productos = productos;
    this.cantidad = cantidad;
    this.subtotal = subtotal;
    calcularIVA();
  }
  
 public int getFolio (){
   return folio;
 }
 public void setFolio (int folio){
   this.folio=folio;
 }
 public String getProductos() {
   return productos;
 }
 public void setProductos (String productos){
   this.productos  = productos;
 }
 public int getCantidad(){
   return cantidad;
 }
 public void setCantidad (int cantidad){
   this.cantidad = cantidad;
 }
 public double getSubtotal () {
   return subtotal;
 }
 public void setSubtotal (double subtotal){
   this.subtotal = subtotal;
 }
 public double getIva () {
   return iva;
 }
 public void setIva (double iva) {
   this.iva = iva;
 }
  private void calcularIVA() {
    iva = subtotal * 0.16;
  }
  public double calcularTotal() {
    return subtotal + iva;
  }
  
  /**
   * Obtiene la fecha de la venta.
   * @return Fecha de la venta.
   */
  public String obtenerFecha() {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    return dateFormat.format(fecha);
  }
}

