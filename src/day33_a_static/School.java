package day33_a_static;


import day33_b_encapsulation.LoopAcademyStudent;

public class School {
    public static void main(String[] args) {


        LoopAcademyStudent emre = new LoopAcademyStudent("Emre", 5);
        System.out.println(emre);

        System.out.println();
        LoopAcademyStudent.printInfo();

        System.out.println();
        emre.printInfo();

        System.out.println();

        System.out.println(LoopAcademyStudent.instructors[0]);

        System.out.println();
        for(String each : LoopAcademyStudent.instructors){
            System.out.println(each);
        }

    }
}
