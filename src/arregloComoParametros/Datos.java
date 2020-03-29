/*
18i Curso Java desde cero  Métodos con arrays como parámetros[1]
ESTE EJERCICIO PERMITE AUTORELLENAR UN ARREGLO CON MULTIPLOS DEL NUMERO INGRESADO
 */
package arregloComoParametros;

/**
 *
 * @author DELL-BLACK
 */
public class Datos 
{   
    ///el metodo recibe un numero y se autorellena con secuencias de +5 de ese numero
    public static int[] rellenarArreglo(int numero)  //como parametro espera recicbir un numero entero
    {
        int array[]=new int[10];
        for(int i=0;i<array.length;i++)
        {
            array[i]= numero;
            numero=numero+5;
        }
        return array;
    }
    public static void imprimirArreglo(int arr[])
    {
        System.out.println("imprimir datos: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
