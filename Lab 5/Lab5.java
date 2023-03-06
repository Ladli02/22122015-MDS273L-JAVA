import java.util.*;
class lab5{

    static String encrypt(String s){
        String temp="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                temp=temp+ch;

            }
            else{
                int a=(int)ch;
                //System.out.println(a);
                if(a<=67){
                    a=(a-2)+25;
                }
                else {a=a-3;}
                temp=temp + (char)(a);
            }

           
    }

    return temp;}

    static String decrypt(String s){
        String temp="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                temp=temp+ch;

            }
            else{
                int a=(int)ch;
                //System.out.println(a);
                if(a>=88){
                    a=a-23;
                }
                else {a=a+3;}
                temp=temp + (char)(a);
            }

           
    }

    return temp;}




    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n;
        boolean flag=false;
        do{
            System.out.println("1.Encrypt a message");
            System.out.println("2.Decrypt a message");
            System.out.print("Enter your choice: ");
            n=Integer.parseInt(sc.nextLine());
            if (n==1){
                flag=true;
                System.out.println("Enter a string: ");
                String s=sc.nextLine();
                String str= encrypt(s);
                System.out.println(str);

            }
            if(n==2){
                    flag=true;
                    System.out.println("Enter a string: ");
                    String s=sc.nextLine();
                    String str= decrypt(s);
                    System.out.println(str);
    
                }
            else flag=false;


        
    }while(flag ==true);
}}
