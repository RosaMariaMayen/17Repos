
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC11
 */

public class impares {
    public int par ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: "); //se pide que se ingrese un numero
        int num=sc.nextInt();
        if(num%2==0) {
            System.out.println("El numero es par"); //si el numero es para se mostrara en la pantalla
        } else {
            System.out.println("El numero es impar"); //sino se mostrara en pantalla si es impar
        }
        return num;
    }
}

