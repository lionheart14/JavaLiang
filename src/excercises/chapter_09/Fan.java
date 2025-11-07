package excercises.chapter_09;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
        
    }

    @Override
    public String toString() {
        String s;
        if(on) {
            s = String.format("Fan speed is %d with the color %s and the radius %f", getSpeed(), getColor(), getRadius());
        } else {
            s = String.format("Fan is off with the color %s and the radius %f", getColor(), getRadius());
        }
        return s;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
