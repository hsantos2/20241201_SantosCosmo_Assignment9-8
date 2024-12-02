public class Fan{
    final static int slow=1;
    final static int med=2;
    final static int fast=3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    //Default fan
    Fan(){
        speed=slow;
        on=false;
        radius=5;
        color="blue";
    }

    //set speed
    public void setSpeed(int newSpeed){
        speed=newSpeed;
    }

    //set fan on
    public void turnOn(){
        on=true;
    }

    //set fan off
    public void turnOff(){
        on=false;
    }

    //set color
    public void setColor(String newColor){
        color= newColor;
    }

    //set radius
    public void setRadius(double newRadius){
        radius=newRadius;
    }

    //return speed
    public String getSpeed(){
        String s = "";
        switch (speed){
            case slow: s = "SLOW"; break;
			case med: s = "MEDIUM"; break;
			case fast: s = "FAST";
		}
		return s;
	}

	public boolean isOn() {
		return on;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}
    
	public String toString() {
		if (on == true) {
			return "\nFan speed: " + getSpeed() + ", color: " + color + 
					 ", radius: " + radius + "\n";
		}
		else{
			return "\nFan color: " + color + ", radius: " + radius +
					 "\nfan is off\n";
        }
    }

}