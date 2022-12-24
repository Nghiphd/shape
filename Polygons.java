public class Polygons implements Shape
{
    private double length;
    private double sides;
    private String color;
    
    public Polygons(double sides, double length, String color) {
        this.length = length;
        this.sides = sides;
        this.color = color;
    }
    
    public double getArea() {
        return (this.length*this.length*this.sides)/(4*Math.tan(Math.toRadians(180/this.sides)));
    }
    
    public double  getPerimeter() {
        return this.length*this.sides;
    }

    public String getColor()
    {
        return this.color;
    }
}
