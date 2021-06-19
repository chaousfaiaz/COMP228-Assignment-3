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

    public abstract class Student {

    //student name
    private final String name;

    //full time part time status
    private boolean status;

    //Constructor
    public Student(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    //Getter methods
    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }


    //Abstract methods
    public abstract double calculateTuition();
    public abstract String displayInfo();
}

