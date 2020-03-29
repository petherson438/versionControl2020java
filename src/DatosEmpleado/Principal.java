/*
ejercicios de metodos que requieren parametros y se le pasan los argumentos
 */
package DatosEmpleado;

/**
 *
 * @author DELL-BLACK
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        DatosEmpleado obj = new DatosEmpleado();
        obj.dameNombre("Ana");  //le pasamos un argumento al metodo
        obj.dameEdad(50);  /// y esto es el argumento le pasamos a los metodos
        obj.sueldo(213000.543); 
    }
    
   
}
