/*
 * ejercico shakmuria 18h metodo con retorno de datos

 */
package RetornodeDatos;

import javax.swing.JOptionPane;  //hay que inmportar este metodo que contiene las clases

/**
 *
 * @author DELL-BLACK
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        String n;
        RetornodeDatos objeto=new RetornodeDatos(); // creamos el new objetos de a clase retorno datos
        n=JOptionPane.showInputDialog("ingrese nombre:  ");
        objeto.dameNombre(n);
        JOptionPane.showMessageDialog(null,"el nombre es  "+objeto.devuelveNombre());
        
        System.out.println("el nombre es "+objeto.devuelveNombre());
    }
    
}
