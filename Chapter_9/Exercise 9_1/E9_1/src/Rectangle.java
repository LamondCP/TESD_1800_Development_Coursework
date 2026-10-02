
public class Rectangle {

   
    double width = 1.0;
    double height = 1.0;
    Rectangle() {
    }
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    double getArea() {
        return width * height * Math.PI;
    }
    double getPerimeter() {
        return 2 * (width + height) * Math.PI;
    }
    void setDimensions(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;

    }
}