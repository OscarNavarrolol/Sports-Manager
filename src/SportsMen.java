/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SENA
 */
public class SportsMen {
    private int codDeportista;
    private int identificacion; 
    private String nombres;
    private String direccion; 
    private int telefono;
    private int codDeporte;
    private int sexo;
    private String fechaNac; 

    public SportsMen() {
    }

    public SportsMen(int codDeportista, int identificacion, String nombres, String direccion, int telefono, int codDeporte, int sexo, String fechaNac) {
        this.codDeportista = codDeportista;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codDeporte = codDeporte;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
    }

    public int getCodDeportista() {
        return codDeportista;
    }

    public void setCodDeportista(int codDeportista) {
        this.codDeportista = codDeportista;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCodDeporte() {
        return codDeporte;
    }

    public void setCodDeporte(int codDeporte) {
        this.codDeporte = codDeporte;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
    
}
