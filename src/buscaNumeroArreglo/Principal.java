/*
18k  Curso Java desde cero  Método para buscar un número dentro de un arreglo[1]

ESTE EJERCICIO PERMITE RECORRER UN ARREGLO EN BUSQUEDA DE UNA VARIABLE, SI ESA VARIABLE EXITE: NOS INDICA 
QUE EXISTE Y CUANTAS VECES RECORRIO EL ARREGLO PARA ENCONTRARLA
 */
package buscaNumeroArreglo;

import java.util.Scanner;

/**

 */
public class Principal 
{
    public static void main(String[] args) 
    {
        int array[]={7,4,2,100,8,0,9,5,120,300};
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese un numero a buscar");
        int n=sc.nextInt();
        if(buscarNumero(n,array))  ///llamamos al metodo y operamos con el if
        {
            System.out.println("el numero existe en el arreglo");
        }
        else
        {
             System.out.println("el numero NO EXISTE en el arreglo");   
        }
        
    }
    public static boolean buscarNumero(int n, int arr[]) // se llama diferente el arreglo como se pasa como un argumento lo que se copia es la direccion en memoria
    {
      int cont=0;
      int k=0;
      boolean encontrado=false;
      for(int i=0;i<arr.length;i++)
      {
        if(n==arr[i])
            {        
               cont++;
            }
        if(cont>0)
        {
            encontrado=true;
            break;
        }
        else
        {
            encontrado=false;
        }
        k++;
      }
                System.out.println("veces que se busco el numero dentro del arreglo: "+ k);
    return encontrado;
    }
}

////PENDIENTE EJERCICIO PARA SABER CUANTAS VECES ENCONTRO UN DETERMINADO NUMERO EN UN ARREGLO
