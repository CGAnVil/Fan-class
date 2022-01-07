package com.codegym;

public class Main {

    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setSpeed(Fan1.FAST);
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        Fan1.setOn(true);
        System.out.println(Fan1);

        Fan Fan2 = new Fan();
        Fan2.setSpeed(Fan1.MEDIUM);
        System.out.println(Fan2);
    }
}
