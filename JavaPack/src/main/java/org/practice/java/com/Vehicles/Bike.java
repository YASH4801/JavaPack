package org.practice.java.com.Vehicles;

public class Bike implements Vehicle{
    private int speed;
    private int gear;

    public Bike(){
        speed=0;
        gear=0;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void brakes(){
        this.speed=0;
    }
    public int getGear(){
        return this.gear;
    }
    public void gearUp(){
        if(this.gear>4) return;
        this.gear+=1;
    }
    public void gearDown(){
        if(this.gear<0) return;
        this.gear-=1;
    }
    public void incSpeed(int speed){
        this.speed+=speed;
    }
    public static void main(String[] args) {
        Bike splendor=new Bike();
        splendor.incSpeed(30);
        System.out.println(splendor.getSpeed()+" km/h");
    }
}
