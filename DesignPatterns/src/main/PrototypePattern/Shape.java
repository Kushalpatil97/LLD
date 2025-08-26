package main.PrototypePattern;

abstract class Shape implements Prototype {
    protected String type;
    protected String color;
    protected int x,y;

    public Shape(){};

    //copy constructor for cloning
    public Shape (Shape source)
    {
        if(source != null)
        {
            this.color =source.color;
            this.type = source.type;
            this.x = source.x;
            this.y = source.y;
        }
    }

    public abstract Shape clone();

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
