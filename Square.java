
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square implements Shape 
{
    private int length;
    private String color;
    
    public Square(int length, String color) {
        this.length = length;
        this.color = color;
    }
    
    public double getArea() {
        return this.length*this.length;
    }

    public double  getPerimeter() {
        return 4*this.length;
    }

    public String getColor()
    {
        return this.color;
    }
}
