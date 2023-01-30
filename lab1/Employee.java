import java.util.Scanner;

public class lab1{
    //displaying imployee name,regno,class,email,age,gender,state,company
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();

        System.out.print("Enter Employee Regno: ");
        String Regno = input.nextLine();

        System.out.print("Enter Employee Class: ");
        String Class = input.nextLine();

        System.out.print("Enter Employee Email: ");
        String Email = input.nextLine();
    
        System.out.print("Enter Employee Age: ");
        int age = input.nextInt();
    
        System.out.print("Enter Employee Gender (m/f): ");
        char gender = input.next().charAt(0);
    
        System.out.print("Enter Employee State: ");
        input.nextLine();
        String state = input.nextLine();
    
        System.out.print("Enter Employee Company: ");
        String company = input.nextLine();

        //display details of the employee
    
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Regno: " + Regno);
        System.out.println("Class: " + Class);
        System.out.println("Email: " + Email);


        if (gender == 'm') {
            System.out.println("Gender: MALE");
          } else if (gender == 'f') {
            System.out.println("Gender: FEMALE");
          }
      // check for southern state of India u
          if (state.equalsIgnoreCase("Andhra Pradesh") || state.equalsIgnoreCase("Karnataka")
              || state.equalsIgnoreCase("Kerala") || state.equalsIgnoreCase("Tamil Nadu")
              || state.equalsIgnoreCase("Telangana")) {
            System.out.println("The Employee is from the southern states of India; Preferable work location is in " + state);

            // check for top MNC Companies Using switch case:
            switch (company.toLowerCase()) {
                case "facebook":
                case "google":
                case "microsoft":
                case "samsung":
                case "ibm":
                case "apple":
                  System.out.println("The employee is working in Top MNC Companies");
                  break;
                default:
                  break;
            }
         }  

    }
    
}
