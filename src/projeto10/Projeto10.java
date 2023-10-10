
package projeto10;

import java.util.Scanner;

public class Projeto10 {

    
    public static void main(String[] args) {
        int numero;
        
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite um número: ");
        numero = ler.nextInt();
        
        if (numero==0){
            System.out.println("Nulo!");
        }else if (numero>0 && numero%2==0){
            System.out.println("Positivo e par!");
        }else if (numero>0 && numero%2!=0){
            System.out.println("Positivo e impar!");
        } else if (numero<0 && numero%2==00){
            System.out.println("Negativo e par!");
        }else{
            System.out.println("Negativo e impar!");
        }   
        }
    }
    

