/*Name: Janet Emad Samir Fahmy
ID: 20190151
Group: 10
 */
public class Circle extends Shape {
    private double radius_;
    protected static double PI = 3.14;

    Circle (double radius, int color) {
        super (color);
        radius_ = radius;
    }

    public void setRadius_(double radius_) {
        this.radius_ = radius_;
    }

    public double getRadius_() {
        return radius_;
    }

    public double getArea () {
        return PI * radius_ * radius_;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius_=" + radius_
                + ", color =" + getColor() + '}';
    }
}
