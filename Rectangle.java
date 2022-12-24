
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle implements Shape 
{
    private int length;
    private int width;
    private String color;
    
    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }
    
    public double getArea() {
        return this.length*this.width;
    }

    public double  getPerimeter() {
        return 2*(this.width+this.length);
    }

    public String getColor()
    {
        return this.color;
    }
}
