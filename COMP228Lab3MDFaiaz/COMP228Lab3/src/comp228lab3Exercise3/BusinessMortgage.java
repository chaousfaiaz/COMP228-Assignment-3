/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228lab3Exercise3;

/**
 *
 * @author faiaz
 */
public class BusinessMortgage extends Mortgage {

    private final double businessInterestRate = 0.01; //Business interest rate constant

    public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate,
                            int term) { //Constructor
        super(mortgageNumber, customerName, mortgageAmount, interestRate, term); //Super class constructor
        this.setInterestBusiness();     //Sets interest rate for business mortgage

    }

    //Getters

    public double getBusinessInterestRate() {
        return businessInterestRate;
    }

    //Setter method to set the proper interest rate for business mortgage

    public void setInterestBusiness() {
        super.setInterestRate(super.getInterestRate() + this.getBusinessInterestRate());
    }


    //Overridden method

    @Override
    public String getMortgageInfo() {

        return String.format("%s: %s%n%s: %d%n%s: %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %s(%d %s)%n%n%s: %.2f",
                "Bank Name", MortgageConstants.bankName, "Mortgage number", super.getMortgageNumber(),
                "Mortgage Type", "Business Mortgage", "Customer's name", super.getCustomerName(),
                "Mortgage Amount", getMortgageAmount(), "Interest Rate", super.getInterestRate(),
                "Term", super.getTermName(), super.getTerm(), "years", "Total amount owed", super.getMortgageAmount() * (1 + super.getInterestRate()));

    }

}