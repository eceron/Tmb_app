/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Date;

/**
 *
 * @author Eduardo
 */
public class Informacion_Fraccion {
    
    private int idFraccion;
    private String vehiculo_placa;
    private Date fecha_entrada;
    private Date fecha_salida;
    private float valor_pagar;

    public Informacion_Fraccion(int idFraccion, String vehiculo_placa, Date fecha_entrada, Date fecha_salida, float valor_pagar) {
        this.idFraccion = idFraccion;
        this.vehiculo_placa = vehiculo_placa;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.valor_pagar = valor_pagar;
    }
    
    public Informacion_Fraccion(){}

    public int getIdFraccion() {
        return idFraccion;
    }

    public void setIdFraccion(int idFraccion) {
        this.idFraccion = idFraccion;
    }

    public String getVehiculo_placa() {
        return vehiculo_placa;
    }

    public void setVehiculo_placa(String vehiculo_placa) {
        this.vehiculo_placa = vehiculo_placa;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public float getValor_pagar() {
        return valor_pagar;
    }

    public void setValor_pagar(float valor_pagar) {
        this.valor_pagar = valor_pagar;
    }
    
}