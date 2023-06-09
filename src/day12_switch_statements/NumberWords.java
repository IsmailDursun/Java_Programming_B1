package day12_switch_statements;

public class NumberWords {
    public static void main(String[] args) {
        int number = 1;
        if (number >= 1 && number <= 5) {
            if (number == 1) {
                System.out.println("One");
            } else if (number == 2) {
                System.out.println("Two");
            } else if (number == 3) {
                System.out.println("Three");
            } else if (number == 4) {
                System.out.println("Four");
            } else if (number == 5) {
                System.out.println("Five");
            } else {
                System.out.println("Pick a number between 1 and 5");
            }
        }
        System.out.println("-------------------------------------");

        switch (number){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number");
        }
        System.out.println("Number picked: "+number);
    }
}