package Calculadora;
import java.util.Scanner;

public class Vista {

    Suma suma = new Suma();
    Numeros numeros = new Numeros();
    Scanner sc = new Scanner(System.in);
    Resta resta = new Resta();

    public void leerNumero() {
        
        System.out.print("Ingrese un número: ");
        int num1 = sc.nextInt();
        numeros.setA(num1);
        
        System.out.print("Ingrese un segundo número: ");
        int num2 = sc.nextInt();
        numeros.setB(num2);
    }

    public void mostrarOperacion(){
        System.out.println("El resultado de la operación es: " + suma.calcular(numeros.getA(), numeros.getB()));
        System.out.println("El resultado de la operación es: " + resta.calcular(numeros.getA(), numeros.getB()));
    }
}
