/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author CR
 */
public class Sugerencia {
    private int idsugerencia;
    private String asunto;
    private String dirigido;
    private String sugerencia;
    private String estado;

    public Sugerencia(int idsugerencia, String asunto, String dirigido, String sugerencia, String estado) {
        this.idsugerencia = idsugerencia;
        this.asunto = asunto;
        this.dirigido = dirigido;
        this.sugerencia = sugerencia;
        this.estado = estado;
    }

    public int getIdsugerencia() {
        return idsugerencia;
    }

    public void setIdsugerencia(int idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDirigido() {
        return dirigido;
    }

    public void setDirigido(String dirigido) {
        this.dirigido = dirigido;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
