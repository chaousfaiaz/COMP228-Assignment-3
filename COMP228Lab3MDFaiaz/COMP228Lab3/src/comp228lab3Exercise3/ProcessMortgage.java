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
import javax.swing.JOptionPane;

public class ProcessMortgage {

	public static void main(String[] args) {

		Mortgage[] myMortgages = new Mortgage[3]; //Array of mortgages
		boolean flag = true; //flag
		JOptionPane.showMessageDialog(null, "Here you are going to create 3 Mortgages!", "Welcome!", 1); //Custom message

		while (flag) { //Loop until flag is true

		try {

		//Setting the interest rate
				
		double currentRate = Double.parseDouble(
		JOptionPane.showInputDialog("Enter the current interest rate (integer number):"));
				
		for (int i = 0; i < myMortgages.length;) { //Loop through the array

		try {

		//Custom message
		JOptionPane.showMessageDialog(null, "Creating object number " + (i + 1), "Information", 1);
						
		//Getting an option for business or personal mortgage
						
		int mortgageType = Integer.parseInt(JOptionPane.showInputDialog(
		"Enter 1 to create a Business Mortgage\nEnter 2 to create a Personal Mortgage"));
						
		if (mortgageType != 1 && mortgageType != 2) //Evaluating option
		JOptionPane.showMessageDialog(null, "You must enter option 1 or option 2", "Error", 0);

		else {

		try {

		//Getting the mortgage number
		int mortgageNumber = Integer
		.parseInt(JOptionPane.showInputDialog("Enter the mortgage number"));
								
		//Getting the customer name
		String customerName = JOptionPane.showInputDialog("Enter customer's name");
		try {

		//Getting the mortgage amount
		double mortgageAmount = Double
		.parseDouble(JOptionPane.showInputDialog("Enter the mortgage amount"));
		try {

		//Getting the term
		int term = Integer.parseInt(JOptionPane.showInputDialog(
		"Enter the mortgage term\nEnter 1 for short-term\nEnter 2 for mid-term\nEnter 3 for long-term"));
		JOptionPane.showMessageDialog(null, "Creating a mortgage object!","Information", 1);
										
		try {

		//checking mortgage type chosen
		if (mortgageType == 1) {
												
	//Creating business mortgage object
	BusinessMortgage newBusinessMortgage = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, currentRate, term);
	myMortgages[i] = newBusinessMortgage; //Populating array
		i++;
				}
											
//checking mortgage type chosen
	if (mortgageType == 2) {
												
//Creating personal mortgage object
PersonalMortgage newPersonalMortgage = new PersonalMortgage( mortgageNumber, customerName, mortgageAmount, currentRate, term);
		myMortgages[i] = newPersonalMortgage; //Populating array
		i++;
		     }
											
	//Custom message
	JOptionPane.showMessageDialog(null, "Object created successfully!", "Information", 1);
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
					}
				} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "You must enter a valid number for a term!", "Error", 0);
									}
        } catch (Exception e) {
	JOptionPane.showMessageDialog(null, "You must enter a valid mortgage amount!", "Error", 0);
		}

        } catch (Exception e) {
	JOptionPane.showMessageDialog(null, "You must enter a valid mortgage number!", "Error", 0);
	}
		}

	} catch (Exception e) {
	JOptionPane.showMessageDialog(null, "Invalid option", "Error", 0);
        }

	}

	int i = 1; //Control variable
				
	//Looping through array to display information
	for (Mortgage mortgageItem : myMortgages) {

		JOptionPane.showMessageDialog(null,
	"Mortgage Object number " + i + "\n" + mortgageItem.getMortgageInfo(), "Mortgage Display", 1);
		i++;
	}
				
	//Asking end user to run the program again
	if (JOptionPane.showConfirmDialog(null, "Should program Re run?") == JOptionPane.NO_OPTION)
					flag = false;

	} catch (Exception e) {
	JOptionPane.showMessageDialog(null, " Enter a valid interest rate", "Error", 0);
			}
		}
		

	JOptionPane.showMessageDialog(null, "Thank you");
	}

}
