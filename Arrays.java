//Katerin Saory Cortes Quiñones
import java.util.*;
public class Arrays {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] numerosPrimos= new int [5]; //Arreglo 
        int contador=0; //Variable que va a contar los números que son primos
        int numero; //Variable que va a guardar los números ingresados 

// Va a pedir que ingrese los números y va a validar si son primos o no
        while (contador < numerosPrimos.length) {  
            System.out.println("Digite el número: ");
              numero = sc.nextInt(); 


              boolean Primo = true; //Toma inicialmente que el número es primo
    if (numero < 2) {
        Primo = false; //Pero si cumple esa condición no son primos 
    } else {
        
        /*Verifiva si el número es divisible entre 2 hasta su raiz cuadrada y si es divisible
       por alguno de dichos valores no es primo */
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                Primo = false; 
                break; // Sale del bucle si encuntra un divisor
            } }}
    if (Primo) {
        numerosPrimos[contador] = numero; // Guarda el número primo en el arreglo
        contador++; // Aumenta el contador
    } else {
        System.out.println("El número no es primo");}}
//Muestra solo los números primos ingresados
System.out.println("Números primos:");
        for (int i = 0; i < numerosPrimos.length; i++) {
            System.out.println(numerosPrimos[i]);
        }}   
}

