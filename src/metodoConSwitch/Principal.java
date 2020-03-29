/*
 * 18j Curso Java desde cero Decidir con switch que método se invocará, eligiendo una opción[1]
aqui encontramos el metodo principal el cual para funcionar requiere invocar la clase metodoSwitch 
*/
package metodoConSwitch;

import java.util.Scanner;

/**
 *
 * @author DELL-BLACK
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        int opcion=0;      ///crea la variable opcion para la seleccion del Switch
        metodoSwitch s1=new metodoSwitch();  ///se crea el objeto s1 para llamar los metodos de metodoSwitch que estan dentro del switch s1.suma s1.resta.....
        Scanner sc= new Scanner(System.in); /// el metodo escaner para capturar los datos por teclado
        System.out.println("ingrese el primer numero ");   ///
        int n1 = sc.nextInt();             //captura el primer dato o variable
        System.out.println("ingrese el segundo numero ");
        int n2 = sc.nextInt();        //captura el segundo dato o variable
        System.out.println("1, suma\n2, resta \n3, multiplicacion \n4, division");    ///muestra las opciones
        System.out.println("ingrese una opcion: ");   
        opcion = sc.nextInt();    //captura la opcion
        switch(opcion)
        {
            case 1:
                s1.suma(n1, n2);   
                break;
            case 2:
                s1.resta(n1, n2);
                break;
            case 3:
                s1.multi(n1, n2);
                break;
            case 4:
                s1.div(n1, n2);
                break;
        }
        
        
                
    }
}
