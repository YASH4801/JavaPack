package org.practice.java.com.Vehicles;

public class Bike implements Vehicles{
    @Override
    public void show() {
        System.out.println("My name is " + this.getClass().getName());
    }
}
