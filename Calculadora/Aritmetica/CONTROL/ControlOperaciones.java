package Aritmetica.CONTROL;

import Aritmetica.MODELO.Division;
import Aritmetica.MODELO.Multiplicacion;
import Aritmetica.MODELO.Resta;
import Aritmetica.MODELO.Suma;

public class ControlOperaciones {
    
    Suma suma = new Suma();
    Resta resta = new Resta();
    Multiplicacion mult = new Multiplicacion();
    Division division = new Division();

    public double sumar(double a, double b){
        return suma.calcular(a, b);
    }

    public double restar(double a, double b){
        return resta.calcular(a, b);
    }

    public double multiplicar(double a, double b){
        return mult.calcular(a, b);
    }

    public double dividir(double a, double b){
        return division.calcular(a, b);
    }

}
