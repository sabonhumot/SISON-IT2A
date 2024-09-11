package sison.it.pkg2a;

import java.util.Scanner;

public class Execution {
    
    public void promptUser () {
        
        Scanner input = new Scanner(System.in);
        Implementor[] imp = new Implementor[100];
        
        System.out.print("Enter no of applicants: ");
        int noOfApplic = input.nextInt();
        
        for (int x = 0; x < noOfApplic; x++) {
            System.out.printf("Enter details of application %d:\n", x + 1);
            
            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine();
            
            System.out.print("Name: ");
            String name = input.nextLine();
            
            System.out.print("Age: ");
            int age = input.nextInt();
            
            System.out.print("BMI: ");
            double bmi = input.nextDouble();
            input.nextLine();
            
            System.out.print("Fitness Goals: \n");
            String fg = input.nextLine();
            
            imp[x] = new Implementor();
            imp[x].addDetails(id, name, age, bmi, fg);
                      
        }
        
        for (int x = 0; x < noOfApplic; x++) {
            imp[x].viewDetails();
        }
        
    }

}
