/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos va a ingresar"));
        Productos arrProductos[] = new Productos[data];
        
        Procedimiento procedimiento = new Procedimiento();
        procedimiento.AgregaDatos(arrProductos, data);
        procedimiento.MostrarDatos(arrProductos);
    }
    
}
