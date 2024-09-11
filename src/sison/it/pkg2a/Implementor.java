package sison.it.pkg2a;

public class Implementor {

    int id, age;
    double bmi;
    String name, fg;

    public void addDetails(int uid, String uname, int uage, double ubmi, String ufg) {

        this.id = uid;
        this.name = uname;
        this.age = uage;
        this.bmi = ubmi;
        this.fg = ufg;
    }

    public void viewDetails() {

        String eligibility = (this.age < 18 || this.age > 65 && this.bmi < 18.5 || this.bmi > 30.0) ? "Eligible" : "Not Eligible";

        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-10s %-10s %-20s %-20s", "ID", "Name", "Age", "BMI", "Fitness Goal", "Eligibility");
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.printf("%-10d %-15s %-10d %-10.1f %-20s %-20s", this.id, this.name, this.age, this.bmi, this.fg, eligibility);

    }

}
