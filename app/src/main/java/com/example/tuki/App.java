package com.example.tuki;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hola Diego!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println("programacion estructurada");
        Tabla_multiplicar();
    }
    public static void Tabla_multiplicar(){
        System.out.println("Tabla de multiplicar de un numero");
        System.out.println("Ingrese el numero para hacer su tabla: ");
        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        
        for (int i = 1; i < 12; i++){
            int multi = i * numero;
            
            System.out.println("La multiplicacion de "+ i + " x " + numero + " = " +multi);
        
        }
    }
}
