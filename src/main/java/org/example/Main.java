package org.example;

import org.example.Pacadge.Task_Try_catch_ArithmeticException_;
import org.example.Pacadge.Task_Try_catch_tow_NullPointerException;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Task_RuntimeException_ pound = new Task_RuntimeException_(5,6);
//        Task_RuntimeException_.divo();
//        Task_Try_catch_ pound1 = new Task_Try_catch_(0,10/0);
//    }

        Task_Try_catch_tow_NullPointerException print = new Task_Try_catch_tow_NullPointerException();
        List<String> list = Arrays.asList("first step", null, "second step");

        for (String s : list) {
            try {
                print.print(s);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues");
            } finally {
                System.out.println("Inside bloсk finally");
            }
            System.out.println("Go program....");
            System.out.println("-----------------");
        }
        Task_Try_catch_ArithmeticException_ division = new Task_Try_catch_ArithmeticException_(); //деление на 0 с ArithmeticException
        try {
            division.division(0);
            System.out.println("Это сообщение не будет выведено в консоль");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        System.out.println("Завершение работы");
    }
    }