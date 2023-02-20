import java.util.Scanner;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class Lab04 {
    static int acc_no = 22122015;
    
    static String hname = "Ladli Bhagat";
    static double bal = 76000.00;
    

    // static void init(){
    //     System.out.println("Welcome "+hname+" your account available bal: "+bal);
        
    // }
    
    static String[] trans(String [] trans,int count){
        System.out.println("Transction details are: ");
        for (int i = 0; i < count; i++) {
            System.out.println(trans[i]);
        }
        return trans;
    }
    static double deposit(double bal,int count,String []trans){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit the money: ");

        double temp = sc.nextDouble();
        double prev= bal;
        bal += temp;
        trans[count]="Money deposit : "+temp+" Time "+java.time.LocalTime.now()+" Previous bal: "+prev+" New bal"+bal;
        // count++;

        return bal;
    }
    static double with(double bal,int count,String[] trans){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw the money: ");
        double temp = sc.nextDouble();
        double prev= bal;
        bal -= temp;
        trans[count]="Money Withdraw : "+temp+" Time "+java.time.LocalTime.now()+" Previous bal: "+prev+" New bal"+bal;
        // count++;
        return bal;

    }
    static void summary(){
        System.out.println("welcome "+hname);
        System.out.println("Current Login Time: "+java.time.LocalTime.now());
        System.out.println(" Your Account number is "+acc_no);
        System.out.println("Yout total account balance is :"+bal);

    }

    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        String [] trans = new String[200];
        int count=0;

        do {
            
        System.out.println("************* MENU ***************");
        // System.out.println("## 1 . Initialize the money");
        System.out.println("## 2. Deposit Money ");
        System.out.println("## 3. Withdraw Money");
        System.out.println("## 4. Print All the transctions. ");
        System.out.println("## 5. Print Account Summary. ");
        System.out.println("## 6. Logout.");
        
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            // case 1:
            //     init();
            //     break;
            case 2:
                bal=deposit(bal,count,trans);
                count++;
                break;
            case 3:
                bal=with(bal,count,trans);
                count++;
                break;
            case 4:
                trans=trans(trans,count);

                break;
            case 5:
                summary();
                break;
            case 6:
                System.out.println("Thanks for using our bank.");
                flag=false;
                break;
        }
        } while (flag);
        
    }
}
