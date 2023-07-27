package ru.gb.recording_system;

public class Main {
    public static void main(String[] args) {
        String msg = Reader.readMessage();
        Writer.data_writer(msg);
    }
}
