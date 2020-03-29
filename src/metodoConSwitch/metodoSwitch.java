/*
 * 18j shakmuria
18j Curso Java desde cero Decidir con switch que método se invocará, eligiendo una opción[1]
aqui encontramos los metodos que se crearon y pueden ser invocados por el metodo principal
lego realice una priueba de commit a github
 */
package metodoConSwitch;

/**
 *
 * @author DELL-BLACK
 */
public class metodoSwitch 
{
    int suma,resta,multi,div;
    public void suma(int num1, int num2)
    {
        suma=num1+num2;
        System.out.println("la suma es. "+ suma);
    }
    public void resta(int num1, int num2)
    {
        resta=num1-num2;
        System.out.println("la resta es. "+ resta);
    }
    public void multi(int num1, int num2)
    {
        multi=num1*num2;
        System.out.println("la multiplicacion es. "+ multi);
    }
    public void div(int num1, int num2)
    {
        div=num1/num2;
        System.out.println("la division es es. "+ div);
    }
}
