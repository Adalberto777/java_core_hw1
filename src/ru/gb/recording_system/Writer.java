package ru.gb.recording_system;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Writer {
    /**
     *  the method writes a message to a file
     *
     * @param msg the person whose data needs to be recorded
     *
     * @return creating file
     */
    public static void data_writer(String msg){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("msg-logger.txt", true));
            Date date = new Date();
            writer.write("<" + date.toString() + ">");
            writer.write("<" + msg + ">");

            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file!" + e);
        }
    }
}
