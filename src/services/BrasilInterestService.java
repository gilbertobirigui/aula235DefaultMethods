/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.security.InvalidParameterException;

/**
 *
 * @author gfilm
 */
public class BrasilInterestService {
    
    private double interestRate;

    
    // contrutor  recebe quantia 
    public BrasilInterestService(double interestRate) {
        this.interestRate = interestRate;  // e armazena no objeto this.interestRate
    }
    
    
    
    

    public double getInsterestRate() {
        return interestRate;
    }

    
    
    
    // metodo payment vai receber valor emprestado e numero de meses 
    public double payment(double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        //vou retornar quantia = amount
        // x math.pow = potenciacao
        // que vai ser 1.0 mais taxa juros / 100 elevado quantidade de meses
        return amount * Math.pow(1.0 + interestRate / 100.0, months);
        
   
    } 
    
    
}
