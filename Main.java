import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String Mini;
        String sudan;
        System.out.println ("Enter your basic details for booking cab");
        System.out.println ("Enter your name:");
        String name = sc.nextLine ();
        System.out.println ("Enter your location :");
        String add = sc.nextLine ();
        System.out.println ("Enter your destination:");
        String des = sc.nextLine ();
        System.out.println("Here are our service van:");
        System.out.println ("chhose Servive van:");
        String chhose = sc.nextLine ();
        System.out.println("Mini");
        System.out.println("Sudan");
        System.out.println("BMW");
        System.out.println("Enter the distance :");
        Float dis = sc.nextFloat();
        if (dis < 10) {
            float total_fair = 10* dis;
            System.out.println("Your total_fair is:"+total_fair);
        } else if (dis >= 10 && dis<= 300 ) {
            float total_fairs = 5* dis;
            System.out.println("Your total_fair is:"+total_fairs);
        }
        else{
            float total_dis = 8*dis;
            System.out.println("Your total Fair is : "+total_dis);
        }
        System.out.println ("Your name is:"+name);
        System.out.println ("Your Current location  is:"+add);
        System.out.println ("Your destination is:"+des);
        System.out.println ("Your total distance cover by the cab is :"+ dis);
        System.out.println ("Thank you "+name);
        System.out.println ("Have a Nice Day");

    }
}