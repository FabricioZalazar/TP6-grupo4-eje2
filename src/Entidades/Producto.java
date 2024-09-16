/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.TreeMap;

/**
 *
 * @author zalaz
 */
public class Producto {
    private long codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String rubro;
    private TreeMap<Long, Producto> Product = new TreeMap();
    
    
    
    
    public Producto(long codigo, String descripcion, double precio, String rubro, int stock) {
        
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    
    

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    
    public void agregarProducto(long codigo, Producto producto) {
        Product.putIfAbsent(codigo, producto);
        
        
    }
}
