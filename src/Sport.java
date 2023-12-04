/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SENA
 */
public class Sport {
    private int codDeporte;
    private String nombre;

    public Sport() {
    }

    public Sport(int codDeporte, String nombre) {
        this.codDeporte = codDeporte;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodDeporte() {
        return codDeporte;
    }

    public void setCodDeporte(int codDeporte) {
        this.codDeporte = codDeporte;
    }
    
}
