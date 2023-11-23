package lab7;

import java.util.Scanner;
public class lab7 {
    public static void main(String[] args) {
        System.out.println("//1");
        new Plane().thisPlane();
    }
}

class Plane{
    int weightWing;
    Wing wing = new Wing();
    void thisPlane() {
        wing.infWing();
    }
    void infPlane() {
        System.out.println("weight wing: " + weightWing);
    }
    class Wing {
        void infWing() {
            Plane plane = new Plane();
            System.out.print("input  weight wing for plane1: ");
            Scanner scanner1 = new Scanner(System.in);
            plane.weightWing = scanner1.nextInt();
            plane.infPlane();
            Plane plane2 = new Plane();
            System.out.print("input  weight wing for plane2: ");
            Scanner scanner2 = new Scanner(System.in);
            plane2.weightWing = scanner2.nextInt();
            plane2.infPlane();
        }
    }
}