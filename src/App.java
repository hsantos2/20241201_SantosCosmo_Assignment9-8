public class App {
    public static void main(String[] args) throws Exception {
        //Initialize fan speeds
        final int slow= 1;
        final int med= 2;
        final int fast=3;

        //Create fan objects
        Fan fan1= new Fan();
        Fan fan2= new Fan();

        //Assign maximum speed, radius 10, color yellow, and turn it on to the first object.
        fan1.setSpeed(fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnOn();

        //Assign medium speed, radius 5, color blue, and turn it off to the second object.
        fan2.setSpeed(med);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.turnOff();

        //Display the objects by invoking their toString method.
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
