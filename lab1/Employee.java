
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Enter the Employee's Details :- ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Name :");
        String ename = sc.nextLine();
        System.out.println("Enter the Employee age :");
        int eage = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the State");
        String region = sc.nextLine();
        System.out.println("Enter your Company Name: ");
        String company = sc.nextLine();
        System.out.println("Enter the Employee gender ('m' or 'f'):");
        char gender = sc.next().charAt(0);
        
        
        System.out.println("***** DETAILS ******");
        System.out.println("Name of Employee: " + ename);
        System.out.println("Age of Employee: " + eage);

        if (gender == 'm') {
            System.out.println("Male");

        } else if (gender == 'f') {
            System.out.println("Female");

        }
        switch(region){
            case "Andhra Pradesh":
            case "Kerala":
            case "Karnatak":
            case "Tamil Nadu":
            case "Telengana" :
            System.out.println("The employee is from sourthen part of india");
                break;
            case "West Bengal":
            case "Bihar":
            case "Jharkhand":
            case "Arunanchal Pradesh":
            case "Odisha":
                System.out.println(" The employee is from eastern part of India"); 
                break;
            case "Uttar Pradesh":
            case "Uttarakhand":
            case "Punjab":
            case "Delhi":
            case "Rajasthan":
            case "Harayana":
            case "Himachal Pradesh":
                System.out.println("The Employee is from Northen part of India");
                break;
            case "Madhya Pradesh":
            case "Maharastha":
            case "Goa":
            case "Gujrat":
            case " Rajasthan ":
                System.out.println(" The Employee is from Western part of India");
                break;
            default :
                System.out.println("Please enter the right state!!");
        } 

        
        if(company.equals("Facebook") || company.equals("Google") || company.equals("Microsoft") ||company.equals("Samsung") || company.equals("Ibm") || company.equals("Apple")){
            System.out.println("The employee is working in Top MNC Companies.");
        }

    }
}


