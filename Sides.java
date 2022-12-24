
/**
 * Write a description of class Sides here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sides implements Shape
{
    private int height;
    private int base;
    private int sides;
    private String color;
    
    public Sides(int sides, int base, int height, String color) {
        this.height = height;
        this.base = base;
        this.sides = sides;
        this.color = color;
    }
    
    public double getArea() {
        return this.sides/2*this.height*this.base;
    }

    public double  getPerimeter() {
        return this.base*this.sides;
    }

    public String getColor()
    {
        return this.color;
    }
}
