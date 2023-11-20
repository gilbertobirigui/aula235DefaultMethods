/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.security.InvalidParameterException;

/**
 *
 * @author gfilm
 */
public interface InterestService {
    
    // nessa interface vou declarar meu contrato
    
    // aqui ela so tem metodo 
    double getInterestRate();
      
    default double payment(double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        //vou retornar quantia = amount
        // x math.pow = potenciacao
        // que vai ser 1.0 mais taxa juros / 100 elevado quantidade de meses
        // return amount * Math.pow(1.0 + interestRate / 100.0, months);    // da um erro na variavel interestRate porque ela nao tem 
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months); // coloco a metodo get aqui 
   
    } 
    
    
    
    
}
