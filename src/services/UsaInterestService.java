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
public class UsaInterestService implements InterestService {
    
    private double interestRate;

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }
       
    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
