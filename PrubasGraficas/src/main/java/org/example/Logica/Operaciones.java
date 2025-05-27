package org.example.Logica;

public class Operaciones {
    public int a, b, resultado;
    public Operaciones(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int sumar(){
        resultado = a + b;
        return resultado;
    }

    public int resta(){
        resultado = a - b;
        return resultado;
    }
}
