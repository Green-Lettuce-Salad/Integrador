/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Procedimiento {
    public void AgregaDatos(Productos[] arreglo, int data){    
        for(int x=0; x<arreglo.length; x++){
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos del producto "+(x+1));
            
            String CodProducto = JOptionPane.showInputDialog("Escriba el codigo del producto:");
            String NomProducto = JOptionPane.showInputDialog("Escriba el nombre del producto");
            String NomEmpleado = JOptionPane.showInputDialog("Escriba el nombre del empleado que agrego el producto");
            
            int CedEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cedula del empleado que agrego el producto"));
            int PreBasProducto = Integer.parseInt(JOptionPane.showInputDialog("Escriba el precio base del producto"));
            
            TipoProducto tipoProducto = null;
            int data1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el tipo de producto \n\n1. Alimentos \n2.Bebidas \n3.Higiene \n4.Limpieza"));
            
            double PreBruProducto = 0;
            if (data1 == 1) {
                tipoProducto = TipoProducto.Alimentos;
                PreBruProducto = PreBasProducto * 0.2 + PreBasProducto;
            } else if (data1 == 2) {
                tipoProducto = TipoProducto.Bebidas;
                PreBruProducto = PreBasProducto * 0.3 + PreBasProducto;
            } else if (data1 == 3) {
                tipoProducto = TipoProducto.Higiene;
                PreBruProducto = PreBasProducto * 0.25 + PreBasProducto + 500;
            } else if (data1 == 4) {
                tipoProducto = TipoProducto.Limpieza;
                PreBruProducto = PreBasProducto * 0.19 + PreBasProducto * 0.04 + 1000 + PreBasProducto;
            }
            
            double Ganancia = (PreBruProducto-PreBasProducto)*data;
                                 
            arreglo[x] = new Productos(CodProducto,NomProducto,NomEmpleado,CedEmpleado,PreBasProducto,tipoProducto,PreBruProducto,Ganancia);
        } 
    }
    
    public void MostrarDatos(Productos[] arreglo){
        for(int x=0;x<arreglo.length;x++){
        JOptionPane.showMessageDialog(null, "Codigo del producto: "+arreglo[x].getCodProducto()+"\n"+"Nombre del producto: "+arreglo[x].getNomProducto()+"\n"+"Nombre del empleado: "+arreglo[x].getNomEmpleado()+"\n"+"Cedula del empleado: "+arreglo[x].getCedEmpleado()+"\n"+"Precio base del producto: "+arreglo[x].getPreBasProducto()+"\n"+"Tipo de producto: "+arreglo[x].getTipoProducto()+"\n"+"Precio bruto del producto: "+arreglo[x].getPreBruProducto()+"\n"+"Ganancia estimada: "+arreglo[x].getGanancia());
        }
    }
}
