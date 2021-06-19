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
import javax.swing.JOptionPane;
public class GameMain {
     public static void main (String [] args)
    {
        int userChoice = 0;
        String userName;
        boolean status;
        String userStatus = "";
       
do{
     userChoice = Integer.parseInt(JOptionPane.showInputDialog("Enter the option number: "+"\n1. Full-Time Game Tester\n2. OR Part-Time Game Tester"));
        userName = JOptionPane.showInputDialog("Enter Game Tester Name: ");
        if (userChoice == 1){
            status = true;

            // Variable Declaration and Initialization
            FullTimeGameTester Tester1 = new FullTimeGameTester(userName, status);

            // Get Status of Student
            if (Tester1.getStatus())
                userStatus = "Full-Time";

            // Display the information
            JOptionPane.showMessageDialog(null,"Game Tester Name: "+Tester1.getName()+"\nStatus: "+userStatus+"\nTuition Total: "
                    + ""+ Tester1.determineSalary(),"Game Tester Information",JOptionPane.INFORMATION_MESSAGE);
        } else if (userChoice == 2){
            status = true;

            // Gather User Information for Hours taken for Part-Time Game Tester only
            int hours = Integer.parseInt(JOptionPane.showInputDialog("Enter the total amount of  Hours: "));

            // Variable Declaration and Initialization
            PartTimeGameTester Tester2 = new PartTimeGameTester(userName, status);

            // Get Status of Game Tester
            if (!Tester2.getStatus())
                userStatus = "Part-Time";
            Tester2.setPartTimeSalary(hours);
            // Display the information
            JOptionPane.showMessageDialog(null,"Game Tester Name: "+ Tester2.getName()+"\nStatus: "+ userStatus + "= Part-Time" 
                    +"\nSalary Total: "+ Tester2.getPartTimeSalary(),"Game Tester Information",JOptionPane.INFORMATION_MESSAGE);
        }


    }while(userChoice == 1 || userChoice == 2);
}
}
