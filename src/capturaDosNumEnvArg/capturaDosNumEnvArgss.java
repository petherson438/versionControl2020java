/*

 */
package capturaDosNumEnvArg;

public class capturaDosNumEnvArgss 
{

    double division,multiplicacion;
    public void divide(double num1,double num2)  //tiene dos parametros num1 y num2
    {
        division=num1/num2;
    }
    public void multiplica(double num1,double num2)  //tiene dos parametros num1 y num2
    {
        multiplicacion=num1*num2;
    }
    public void muestraResultados(double num1,double num2)  //tiene dos parametros num1 y num2
    {
        System.out.println("la division es: "+ division );
        System.out.println("la multiplicacion es: "+ multiplicacion);
    }    
   
}
