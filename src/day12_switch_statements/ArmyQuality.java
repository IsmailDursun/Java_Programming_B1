package day12_switch_statements;
import java.util.Scanner;
public class ArmyQuality {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        boolean hasCitizenship,
                isResident,
                hasDiploma;
        int age;

        System.out.println("Are you a citizen?");
        hasCitizenship = input.nextBoolean();

        System.out.println("Are you a resident?");
        isResident = input.nextBoolean();

        System.out.println("Has diploma?");
        hasDiploma = input.nextBoolean();

        System.out.println("How old are you?");
        age = input.nextInt();

        if(hasCitizenship){
            if(isResident){
                if(hasDiploma){
                    if(age>=18 && age <= 35){
                        System.out.println("You are qualified!");
                    }else{
                        System.out.println("You must be between the ages of 18 and 35");
                    }
                }else{
                    System.out.println("You must have a diploma");
                }
            }else{
                System.out.println("You must be a resident");
            }
        }else{
            System.out.println("Must be citizen");
        }

    }
}
