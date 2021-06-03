/*Name: Janet Emad Samir Fahmy
ID: 20190151
Group: 10
 */
public class Rectangle extends Shape {
    private double length_, width_;

    Rectangle(double length, double width, int color) {
        super(color);
        length_ = length;
        width_ = width;
    }

    public void setLength_(double length_) {
        this.length_ = length_;
    }

    public void setWidth_(double width_) {
        this.width_ = width_;
    }

    public double getLength_() {
        return length_;
    }

    public double getWidth_() {
        return width_;
    }

    public double getArea() {
        return length_ * width_;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length_=" + length_ +
                ", width_=" + width_ +
                ", color =" + getColor()+
                '}';
    }
}