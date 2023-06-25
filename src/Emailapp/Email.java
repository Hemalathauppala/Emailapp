package Emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String alternateEmail;
    private String password;
    private int capacity = 500;
    private String email;
    private String companySuffix = "Azcompany.com";

    // Constructor for firstName and lastName


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
       // System.out.println("Department is:" + department);
        this.password = randomPassword(8);
       // System.out.println("random password:" + password);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() +"." + companySuffix;
        //System.out.println("Generated email:" + email);
    }

    //Set the department name
    private String setDepartment(){
        System.out.println("Department codes \n1.Sales \n2.Develpoment \n3.Accounting \n0.None \n Enter department number:");
        Scanner scanner = new Scanner(System.in);
        int deptChoice = scanner.nextInt();
        if (deptChoice == 1)
            return "sales";
        else if ( deptChoice == 2)
            return "dev";
        else if ( deptChoice == 3)
            return "account";
        else
            return " ";

        }

        // Generate a random password
        private String randomPassword(int length){
            String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz012345678910#&*";
            char[] password = new char[length];
            for(int i=0;i<length;i++){
                int rand = (int) (Math.random() * passwordset.length());
                password[i] = passwordset.charAt(rand);
            }
            return new String(password);
        }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    public void changePassword(String password){
        this.password = password;
        }

    public int getCapacity() {
        return capacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }
    public void showInfo(){
        System.out.println("New employees first name:" + firstName + "\nEmail address:" + email + "\nPassword:" + password);
    }
}
