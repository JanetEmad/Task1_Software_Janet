/*Name: Janet Emad Samir Fahmy
ID: 20190151
Group: 10
 */
public class Square extends Shape {
    private double side_;

    Square (double side,int color){
        super(color);
        side_= side;

    };

    public void setSide_(double side_) {
        this.side_ = side_;
    }

    public double getSide_() {
        return side_;
    }

    @Override
    public double getArea() {
        return side_ * side_;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side_=" + side_ + ", color =" + getColor()+
                '}';
    }
}
