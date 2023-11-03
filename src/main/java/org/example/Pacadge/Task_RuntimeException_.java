package org.example.Pacadge;

public class Task_RuntimeException_ {
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Task_RuntimeException_(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int a;
    private int b;
    public static int divo (int a, int b){
        if (b == 0);
        throw new RuntimeException("parametr error"); //бросаем исключение
//        return a/b;

    }
}
