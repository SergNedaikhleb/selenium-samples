package javaCode;

public class GamesWithString {
    public static void main(String[] args) {

        String name1 = "Jack";
        String name2 = "Edward";
        String name3 = "Avraam";
        String name4 = "Jack";



        String car = "bmv";
        String myCar = "BMV";

        String kitchen = "table, plate, dishes!!";

        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name4));
        System.out.println(name3.toUpperCase());

        System.out.println("\n"+myCar.toLowerCase().equals(car));

        System.out.println(kitchen.contains("table"));
        System.out.println(name1.length());

        if(kitchen.endsWith("!")) System.out.println("Go to kitchen!");
        else System.out.println(name3+" Buy "+myCar);

        String st = "Hello! My name is %s, and I am %d years old";
        int age = 25;
        String myName = "Kolya";

        System.out.println("\n"+String.format(st, myName, age));
        System.out.println("\n"+String.format(st, name3, 15));


        String someAge = "30";
        int a = Integer.parseInt(someAge);

        System.out.println(a * 2);

        String textTooLong = "It's very long story about something";
        System.out.println("***\n"+textTooLong.substring(10, 20)+"\n***");

    }
}