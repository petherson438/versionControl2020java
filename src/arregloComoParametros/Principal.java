/*
18i Curso Java desde cero  Métodos con arrays como parámetros[1]
ESTE EJERCICIO PERMITE AUTORELLENAR UN ARREGLO CON MULTIPLOS DEL NUMERO INGRESADO
 */
package arregloComoParametros;

/**
 *
 * @author DELL-BLACK
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        int arreglo[]=Datos.rellenarArreglo(20); //es un metodo estatico no necesitamso crear objetos para poder ejecutarlo
        Datos.imprimirArreglo(arreglo);
        
    }
    
}
