package org.example;

public class Main {
    public static void main(String[] args) {
        int s=20000;
        int hours=s/3600;
        System.out.println("Осталось " + s + " секунд.");
        if (hours>0){
            System.out.println("Осталось " + hours + " часов.");}
        else{
            System.out.println("Осталось менее часа.");}

    }
    }
