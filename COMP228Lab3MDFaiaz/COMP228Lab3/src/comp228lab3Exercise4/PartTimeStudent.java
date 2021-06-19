/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228lab3Exercise4;

/**
 *
 * @author faiaz
 */
public class PartTimeStudent extends Student {

    private int creditHours; //Variable to store creditHours
    private final int HourPrice = 100; //Constant that contains the credits for hour price

    public PartTimeStudent(String name, boolean status, int creditHours) {
        super(name, status);
        this.creditHours = creditHours;
        if(creditHours < 1) //Validating creditHours
        throw new IllegalArgumentException("Credit hours must be greater than 0\n");
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getHourPrice() {
        return HourPrice;
    }
    //Overridden method calculateTuition

    @Override
    public double calculateTuition() {

        return this.getCreditHours() * getHourPrice();
    }

    //Overridden method displayStudentInfo that returns a formatted string

    @Override
    public String displayInfo() {

        return String.format("%s: %s%n%s: %s%n%s: %.2f%n", "Student's Name", super.getName(),
                "Full Time Student", super.isStatus(),"Tuition Calculated", calculateTuition());

    }
}