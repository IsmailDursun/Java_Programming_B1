package day12_switch_statements;
/*
    Given a day number, find and print the day related to the number

    1- Monday
    2- Tuesday

    6- Saturday
    7- Sunday

    any other number: Not a day
 */
public class DaysInWeek {
    public static void main(String[] args) {
       int dayNumber = 5;

       switch (dayNumber){
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
           case 7:
               System.out.println("It is weekend");
               break;
           default:
               System.out.println(dayNumber+" Not a day");

       }
    }
}
