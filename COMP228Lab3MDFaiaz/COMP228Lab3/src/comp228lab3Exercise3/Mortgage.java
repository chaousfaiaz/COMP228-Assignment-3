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
public abstract class Mortgage implements MortgageConstants {

	private int mortgageNumber; 
	private String customerName;
	private double mortgageAmount; 
	private double interestRate;
	private int term; //1 = short-term, 2 = mid-term, 3 = long-term 
	private String termName;

	public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) { //Constructor

		if(mortgageAmount > MortgageConstants.maxMortgageAmount) //Validating mortgage amount against maximum amount
			throw new IllegalArgumentException("You have exceeded the maximum amount for a mortgage");
		
		if(mortgageAmount < 0) //Validating mortgage amount so it cannot be negative
			throw new IllegalArgumentException("The mortgage amount cannot be negative");
		
		if(interestRate < 0) //Validating interest rate so it cannot be negative
			throw new IllegalArgumentException("The interest rate cannot be negative");
		
		//Assigning values to instance variables
		
		this.mortgageNumber = mortgageNumber;
		this.customerName = customerName;
		this.mortgageAmount = mortgageAmount;
		this.interestRate = (interestRate)/100;

		//Switch case term

        switch (term) {

            case 1:
                this.term = MortgageConstants.shortTerm;
                this.termName = "Short-term";
                break;

            case 2:
                this.term = MortgageConstants.midTerm;
                this.termName = "Mid-term";
                break;

            case 3:
                this.term = MortgageConstants.longTerm;
                this.termName = "Long-term";
                break;

            default:
                this.term = MortgageConstants.shortTerm;
                this.termName = "Short-term";
                break;
        }
	}

	//Getter and Setters
	
	public String getTermName() {
		return termName;
	}

	public int getMortgageNumber() {
		return mortgageNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getMortgageAmount() {
		return mortgageAmount;
	}

	public int getTerm() {
		return term;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	//Abstract method

	public abstract String getMortgageInfo();

}