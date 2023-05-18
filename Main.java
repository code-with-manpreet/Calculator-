/*import java.util.*;
public class Main{
    public static void main(String[]args){
        while(true){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st Num");
        int a=sc.nextInt();
       System.out.println("Select From -,+,/,*,%");
        //String Symbol = sc.next();
            int Symbol = sc.nextInt();
        System.out.println("Select 2nd Num");
        int b= sc.nextInt();
        switch(Symbol){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
           // int c= a-b;
            System.out.println(a-b);
            break;
            case 3:
           // int c=a*b;
            System.out.println(a*b);
            break;
            case 4:
          //  int c=a/b;
            System.out.println(a/b);
            break;
            case 5:
          //  int c = a%b;
            System.out.println(a%b);
            break;
            default:
            System.out.println("Select Correct Sysbols");
        }
        }
    }
}*/
            
            
            
            
            
            import java.util.*;
            public class Main{
                public static void main(String[]args){
                    Scanner sc =new Scanner(System.in);
                    
                        System.out.println("Enter first number");
                        int a = sc.nextInt();
                        System.out.println("select symbol from +,-,*,/,%");
                       String symbol=sc.next() ;
                        System .out.println(" enter second number");
                        int b= sc.nextInt();
                        if(symbol== "+"){
                            System.out.println(a+b);
                        }
                        else if(symbol=="-"){
                                System.out.print(a-b);
                            }
                        }
                    }
                
            