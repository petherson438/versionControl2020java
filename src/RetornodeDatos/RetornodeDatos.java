/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetornodeDatos;

/**
 *
 * @author DELL-BLACK
 */
public class RetornodeDatos 

{
     String nombre;  /// atributo d e la clase nombres persona
                                        
    public void dameNombre(String nom)  ///parametro del  metodo(string tipo de dato ) - para darle nombre a una persona a este metodo
    {                                           //si hay que enviarle parametros, cuando lo invocamos le estamos pasando un parametro
        nombre=nom;
    }
    public String devuelveNombre() // este metodo no tiene parametros() porque no necesitamos envirale ningun dato 
    {
        return  nombre;  //el argumento es lo que le estamos pasando al metodo
    }
    
    
}
