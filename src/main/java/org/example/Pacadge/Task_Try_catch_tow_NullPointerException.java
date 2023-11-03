package org.example.Pacadge;

public class Task_Try_catch_tow_NullPointerException {
    public void print(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }
}
