package main.PrototypePattern;

public class Circle  extends Shape{

    private int radius;
  public Circle(){

  }
    public Circle(Circle source)
    {
        super(source);
        if(source != null)
        {
            this.radius = source.radius;
        }
    }
    /**
     * @return
     */
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }

    @Override
    public String toString() {
        return String.format("Circle[color=%s, x=%d, y=%d, radius=%d]",
                color, x, y, radius);
    }
}
