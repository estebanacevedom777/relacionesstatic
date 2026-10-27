/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.modelo;

/**
 *
 * @author USUARIO
 */
public class Puesto {
    private int numero;
    private String placa;

    Puesto(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public int getNumero() {
        return numero;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean estaLibre() {
        return placa == null;
    }

    public void ocupar(String placa) {
        if (estaLibre()) {
            this.placa = placa;
        }
    }

    public void liberar() {
        this.placa = null;
    }
}   

