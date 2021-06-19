/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228lab3Exercise2;

/**
 *
 * @author faiaz
 */

    // Full Time Game Tester class that's an extension of the abstract Game Tester class
public class FullTimeGameTester extends GameTester {
    private double fulltimesalary;
    // Constructor of FullTimeGame Tester
    public FullTimeGameTester(String name, boolean status){
        // Activates the constructor of the super class GameTester, sets Full-Time to true
        super(name, true);
        
        this.fulltimesalary = 3000;
    } // End of Constructor
 // Getter method
    public Double getFullTimeSalary(){ return this.fulltimesalary; }

    // Setter method
    public void setFullTimeSalary (Double salary) { this.fulltimesalary = salary; }

    // Calculate salary
    public double determineSalary()
    {
        return this.getFullTimeSalary();
    }

      
    // Overridden method of setFullTimeSalary, which returns 3000.00
    @Override
   

    // Overridden method of toString which overrides the Student toString method
    // Returns the super.toString, and the tuition
   
    public String toString() {
        return String.format("%s%nSalary   : $%.2f%n",
                toString(),determineSalary());
        
    } // End of toString method
    

    
} // End of class

