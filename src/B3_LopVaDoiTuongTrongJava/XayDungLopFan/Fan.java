package B3_LopVaDoiTuongTrongJava.XayDungLopFan;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = SLOW + 1;
    static final int FAST = MEDIUM + 1;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String tostring() {
        if (isOn()) {
            return getSpeed() + " " + getColor() + " " + " " + getRadius() + " fan is on";
        }
        return getColor() + " " + " " + getRadius() + " fan is off";
    }
}
