package Aritmetica.VISTA;
import Aritmetica.CONTROL.ControlOperaciones;
import Aritmetica.MODELO.Numeros;
import java.util.Scanner;

public class Vista {

    
    Numeros numeros = new Numeros();
    Scanner sc = new Scanner(System.in);
    ControlOperaciones ctrl = new ControlOperaciones();
    

    public void leerNumero() {
        
        System.out.print("Ingrese un número: ");
        double num1 = sc.nextDouble();
        numeros.setA(num1);
        
        System.out.print("Ingrese un segundo número: ");
        double num2 = sc.nextDouble();
        numeros.setB(num2);
    }

    public void mostrarOperacion(){
        System.out.println("El resultado de la operación es: " + ctrl.sumar(numeros.getA(), numeros.getB()));
        System.out.println("El resultado de la operación es: " + ctrl.restar(numeros.getA(), numeros.getB()));
        System.out.println("El resultado de la operación es: " + ctrl.multiplicar(numeros.getA(), numeros.getB()));
        System.out.println("El resultado de la operación es: " + ctrl.dividir(numeros.getA(), numeros.getB()));
    }
}
