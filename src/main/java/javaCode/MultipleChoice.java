package javaCode;

import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {

        Scanner scanIt = new Scanner(System.in);

        System.out.println("Какова Ваша оценка?");
        int grade = scanIt.nextInt();

        String noGrade = ("Оценки не выставлены");

        switch(grade) {
            case 5 :
                System.out.println("Отлично!"); break;
            case 4 :
                System.out.println("Хорошо"); break;
            case 3 :
                System.out.println("Удовлетворительно"); break;
            case 2 :
                System.out.println("Плохо"); break;
            case 1 :
                System.out.println("На второй год"); break;
            default :
                System.out.println(noGrade);
        }
        System.out.println("\nРезультат: " + grade);
    }
}

