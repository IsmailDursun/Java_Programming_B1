package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your browser: ");
        String browser = input.next();

        System.out.println("Enter URL: ");
        String url = input.next();

        switch (browser){
            case "chrome":
            case "Chrome":
            case "CHROME":
                System.out.println("Go into the "+url+" in Chrome browser");
                break;
            case "edge":
                System.out.println("Go into the "+url+" in "+browser+" browser");
                break;
            case "safari":
                System.out.println("Go into the "+url+" in "+browser+" browser");
                break;
            case "firefox":
                System.out.println("Go into the "+url+" in "+browser+" browser");
                break;
            default:
                System.out.println(browser+" is invalid browser");
        }

    }
}
