/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva2q1;

import java.util.Scanner;

/**
 *
 * @author Biyun
 */
public class Viva2q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is a prime number");
        }else
            System.out.println("The nearest prime number is "+getNearestPrime(num));
        // TODO code application logic here
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }return true;   
    }
    public static int getNearestPrime(int num){
        int greater,greaterGap,smaller,smallerGap;
        if(num<2){
            return 2;
        }
        for(int i=1;;i++){
            if(isPrime(num-i)){
                smaller=num-i;
                smallerGap=i;
                break;
            }
        }
        for(int i=1;;i++){
            if(isPrime(num+i)){
                greater=num+i;
                greaterGap=i;
                break;
            }
        }
        if(greaterGap<smallerGap){
            return greater;
        }else
            return smaller;
        
    }
    
}
