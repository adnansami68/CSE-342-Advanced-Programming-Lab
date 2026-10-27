package lab4.practice;

public class Application {
    public static void main(String[] args){
        Plane p1 = new Plane("Bangladesh Airlines", "AS101");

        FighterPlane f1 = new FighterPlane("Indian Fighter Plane", "AS101","Missile");

        p1.fly();
        f1.fly();
        f1.attack();
    }
}
