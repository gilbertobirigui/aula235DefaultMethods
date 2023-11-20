/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Locale;
import java.util.Scanner;
import services.BrasilInterestService;
import services.InterestService;
import services.UsaInterestService;

/**
 *
 * @author gfilm
 */
public class Program {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        
        System.out.print("Months: ");
        int months = sc.nextInt();
        
        
        InterestService is = new BrasilInterestService(2.0);  // taxa juros 2%
       // InterestService is = new UsaInterestService(1.0);  // taxa juros 2%
       
        
        
        double payment = is.payment(amount, months);
        
        System.out.println("Payment after " + months + " months.");
        System.out.println(String.format("%.2f", payment));
        
        
        
      
        
        
        
        sc.close();
        
        
        
    }
    
}
