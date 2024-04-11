import java.util.Scanner;
public class incredit{
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);
        System.out. print("Enter Your Sallary :");
        int salary=input.nextInt();

       int hint= salary/5000;
       System.out.println("5000 Notes:" + hint);
       salary=salary%5000;
       
       hint=salary/2000;
       System.out.println("2000 Notes:" + hint);
       salary=salary%2000;

       hint=salary/1000;
       System.out.println("1000 Notes:" + hint);
       salary=salary%1000;

       
        hint=salary/500;
       System.out.println("500 Notes:" + hint);
       salary=salary%500;

        hint=salary/100;
       System.out.println("100 Notes:" + hint);
       salary=salary%100;


        hint=salary/50;
       System.out.println("50 Notes:" + hint);
       salary=salary%50;



       hint=salary/20;
       System.out.println("20 Notes:" + hint);
       salary=salary%20;

       hint=salary/10;
       System.out.println("10 Coins:" + hint);
       salary=salary%10;

       hint=salary/5;
       System.out.println("5 Coins:" + hint);
       salary=salary%5;

       hint=salary/2;
       System.out.println("2 Coins:" + hint);
       salary=salary%2;

       hint=salary/1;
       System.out.println("1 Coins:" + hint);
       salary=salary%1;

 







    }

}