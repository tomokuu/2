package org.tomoku.edu;

public class Main {
    public static void main(String[] args) {
        String helloMessage = "hello!"; // assign string to variable
        int number = 10; // assign number to variable
        System.out.println(helloMessage); // print out the first variable
        System.out.println(number); // print out the second variable

        for (int i = 0; i <10; i++) { // do the iteriation loop from 0 to 10
            String messageWithNumber = "number is " + i;
            System.out.println(messageWithNumber);
        }

        boolean isFinished = false;
        // do the while loop
        while (!isFinished) { // while isFinished is not true
            System.out.println("Is finished? " + isFinished);
            isFinished = true;
            System.out.println("Is finished. " + isFinished);
        }
        Twójstarypijany.test();
    }
}
