
package pmb.exproyecto;

import java.util.Scanner;

public class exClase {
    //metodo main
    public static void main(String[] args) {
        
        //Creamos el objeto de la clase Scanner llamdo teclado para leer los datos
        Scanner teclado = new Scanner(System.in);
        
        //Declaramos variables
        double cateto1;
        double cateto2;
        double resultado;
        
        System.out.println("Introduce el primer cateto: ");
        cateto1 = teclado.nextDouble();
        System.out.println("Introduce el segundo cateto: ");
        cateto2 = teclado.nextDouble();
        
        resultado=hipotenusa(cateto1,cateto2);
        System.out.println("El resultado es "+resultado);
        
  
    }
    
    private static double hipotenusa(double a, double b){
        
        a = Math.pow(a,2);
        b = Math.pow(b,2);
        
        double resultado=Math.sqrt(a+b);
        return resultado;
    }
}
