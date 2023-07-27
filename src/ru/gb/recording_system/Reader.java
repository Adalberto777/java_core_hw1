package ru.gb.recording_system;

import java.util.Scanner;

public class Reader {
    public static String readMessage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter message: ");
        String msg = scanner.nextLine();

        while (!checkString(msg)) {
            return  readMessage();
        }
        return msg;
    }

    /**
     *  the method checks the string for correctness
     *
     * @param msg string for checking
     *
     * @return boolean
     */
    public static boolean checkString(String msg){
        if (msg == null) {
            System.out.println("Invalid input. The message cannot be null.");
            return false;
        }
        return true;
    }
}
