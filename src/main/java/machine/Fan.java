package machine;

public class Fan extends Machine{
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    public int speed = SLOW;
    public String color = "blue";
    public int radius = 5;

    public Fan () {}

    public Fan (int speed, int radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString () {
        if (this.on == true) {
            return "fan is on" + " speed " + this.speed + " color " + this.color
                   + " radius " + this.radius;
        } else return "fan is off" + " color " + this.color + " radius " + this.radius;
    }
}
