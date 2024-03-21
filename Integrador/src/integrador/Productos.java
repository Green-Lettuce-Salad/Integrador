/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador;

/**
 *
 * @author Aulas Heredia
 */
public class Productos {
    public String CodProducto;
    public String NomProducto;
    private String NomEmpleado;
    private int CedEmpleado;
    private int PreBasProducto;
    private TipoProducto TipoProducto;
    private double PreBruProducto;
    private double Ganancia;

    public Productos(String CodProducto, String NomProducto, String NomEmpleado, int CedEmpleado, int PreBasProducto, TipoProducto TipoProducto, double PreBruProducto, double Ganancia) {
        this.CodProducto = CodProducto;
        this.NomProducto = NomProducto;
        this.NomEmpleado = NomEmpleado;
        this.CedEmpleado = CedEmpleado;
        this.PreBasProducto = PreBasProducto;
        this.TipoProducto = TipoProducto;
        this.PreBruProducto = PreBruProducto;
        this.Ganancia = Ganancia;
    }

    public String getCodProducto() {
        return CodProducto;
    }

    public void setCodProducto(String CodProducto) {
        this.CodProducto = CodProducto;
    }

    public String getNomProducto() {
        return NomProducto;
    }

    public void setNomProducto(String NomProducto) {
        this.NomProducto = NomProducto;
    }

    public String getNomEmpleado() {
        return NomEmpleado;
    }

    public void setNomEmpleado(String NomEmpleado) {
        this.NomEmpleado = NomEmpleado;
    }

    public int getCedEmpleado() {
        return CedEmpleado;
    }

    public void setCedEmpleado(int CedEmpleado) {
        this.CedEmpleado = CedEmpleado;
    }

    public int getPreBasProducto() {
        return PreBasProducto;
    }

    public void setPreBasProducto(int PreBasProducto) {
        this.PreBasProducto = PreBasProducto;
    }

    public TipoProducto getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(TipoProducto TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public double getPreBruProducto() {
        return PreBruProducto;
    }

    public void setPreBruProducto(int PreBruProducto) {
        this.PreBruProducto = PreBruProducto;
    }

    public double getGanancia() {
        return Ganancia;
    }

    public void setGanancia(int Ganancia) {
        this.Ganancia = Ganancia;
    }
    
    
}
