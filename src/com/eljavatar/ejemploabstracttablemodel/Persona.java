package com.eljavatar.ejemploabstracttablemodel;

/**
 *
 * @author Andres
 */
public class Persona {
    
    private String codigo;
    private String nombres;
    private int edad;
    private double valorDeuda;

    public Persona(String codigo, String nombres, int edas, double valorDeuda) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.edad = edas;
        this.valorDeuda = valorDeuda;
    }

    public Persona() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getValorDeuda() {
        return valorDeuda;
    }

    public void setValorDeuda(double valorDeuda) {
        this.valorDeuda = valorDeuda;
    }
    
}
