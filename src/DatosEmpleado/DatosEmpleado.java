/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosEmpleado;

/**
 *
 * @author DELL-BLACK
 */
public class DatosEmpleado 
{
    public void dameNombre(String nom)    //parametro nom de tipo String este metodo cuando lo invoquemos
    {
        System.out.println("el nombre es: "+ nom);  // el nom le pasamos los argumentos
    }
    public void dameEdad(int edad)
    {
        System.out.println("la edad es: "+ edad);
    }
    public void sueldo(double sueldo)  //es to es lo que conocemos como parametro double sueldo
    {
        System.out.println("el sueldo es:"+ sueldo);
    }
}

