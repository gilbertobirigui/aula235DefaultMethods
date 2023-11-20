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
public class BrasilInterestService implements InterestService{
    
    private double interestRate;

    
    // contrutor  recebe quantia 
    public BrasilInterestService(double interestRate) {
        this.interestRate = interestRate;  // e armazena no objeto this.interestRate
    }
    
    @Override
    public double getInterestRate() {
        return interestRate;
    }

    
}
