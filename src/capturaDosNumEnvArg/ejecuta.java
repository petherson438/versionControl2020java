/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capturaDosNumEnvArg;

import java.util.Scanner;

/**
 *
 * @author DELL-BLACK
 */
public class ejecuta 
{
    public static void main(String[] args) 
    {
        
       capturaDosNumEnvArgss obj= new capturaDosNumEnvArgss();
       Scanner sc=new Scanner(System.in);
       System.out.println("introduce un numero");
       double n1= sc.nextDouble();
       System.out.println("introduce otro numero");
       double n2= sc.nextDouble();
       
       obj.divide(n1, n2);
       obj.multiplica(n1, n2);
       obj.muestraResultados(0,0);
    }
    
}
