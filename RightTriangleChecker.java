/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package righttrianglechecker;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class RightTriangleChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int num1, num2, num3;
        
        
        System.out.println("pick three intergers:");
        
        
        do{
            
        System.out.print("side 1: ");
        num1 = keyboard.nextInt();
        if(num1 <= 0){
                System.out.print("your first interger has to be greater then 0, try again!\n" + "side 1: ");
                num1 = keyboard.nextInt();
            }
        
        System.out.print("side 2: ");
        num2 = keyboard.nextInt();
        if(num2 < num1){
            System.out.print(num2 + " is smaller than " + num1 + " try again!\n" + "side 2: ");
            num2 = keyboard.nextInt();
        }
            
        System.out.print("side 3: ");
        num3 = keyboard.nextInt();
        if(num3 < num2){
            System.out.print(num3 + " is smaller than " + num2 + " try again!\n" + "side 3: ");
            num3 = keyboard.nextInt();
        }
            
        }while(num3 == 0);
        
        System.out.println("your three side are " + num1 + " " + num2 + " " + num3 + "\n" + "your sides *do* make a right triangle!");
        
        
    }
    
}
