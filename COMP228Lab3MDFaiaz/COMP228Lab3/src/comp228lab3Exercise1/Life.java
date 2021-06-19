/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228lab3Exercise1;

/**
 *
 * @author faiaz
 */
public class Life extends Insurance {
    // Class constructor
    public Life(String typeOfInsurance, double monthlyCost){
        // Sets the variables from the parameters
        super(typeOfInsurance,monthlyCost);
    }

    // Override the setInsuranceCost Method
    @Override
    public double setInsuranceCost() {
        double yearlyAmount = getMonthlyCost() * 12;
        double tax = yearlyAmount * 0.13;
        return yearlyAmount + tax;
    }

    // Override the displayInfo Method
    @Override
    public String displayInfo() {
        return String.format("Type of Insurance: %s%n" +
                        "Insurance Cost: $%.2f%n",getTypeOfInsurance(),
                setInsuranceCost());
    }
}
    

