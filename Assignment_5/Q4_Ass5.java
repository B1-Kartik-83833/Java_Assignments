/*
Q4) Write an enum type TrafficLight, whose constants (RED,
GREEN, YELLOW) take one parameter—the duration of the
light.Write a program to test the TrafficLight enum so that it
displays the enum constants and their durations.
 */

import java.util.Scanner;

enum TrafficLight{
    RED("RED",120),GREEN("GREEN",30),YELLOW("YELLOW",5);
    String name;
    double duration;
    TrafficLight(String name,double duration){
        this.name=name;
        this.duration=duration;

    }

    @Override
    public String toString() {
        return "TrafficLight =====> " +
                "name : " + name + '\t' +
                " duration : " + duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
public class A5_Q4 {
    public static void main(String[] args) {
        TrafficLight larr[]=TrafficLight.values();
        Scanner sc =new Scanner(System.in);
        System.out.println("Select your choice : ");
        System.out.println("0. RED ");
        System.out.println("1. GREEN ");
        System.out.println("2. YELLOW ");
        System.out.println("Enter your choice : ");




        int i=sc.nextInt();
        switch (larr[i]) {
            case RED:
                TrafficLight t1 = TrafficLight.RED;
                System.out.println(t1);
                break;
            case GREEN:
                TrafficLight t2 = TrafficLight.GREEN;
                System.out.println(t2);
                break;
            case YELLOW:
                TrafficLight t3 = TrafficLight.YELLOW;
                System.out.println(t3);
                break;
            default:
                System.exit(0);





        }

    }
}
