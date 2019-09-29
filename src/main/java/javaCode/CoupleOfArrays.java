package javaCode;

public class CoupleOfArrays {

    public static void main(String[] args) {

        String[] someNames;
        someNames = new String[5]; //in this array will be 5 items

        int[] numbers = {5, 6, 10, 11, 12, 13, 14, 15, 16, 25 }; //in this array will be 10 numbers

        someNames[0] = "Ivan";
        someNames[1] = "Masha";

        System.out.println(someNames[0]);
        System.out.println(numbers[1]);

        for (int i =0; i <10; i++){
            System.out.println(numbers[i]);
        }

    }
}
