import java.awt.*;

public class Rectangle extends Figure {
    //Attributes
    protected int length;
    protected int width;

    //constructor
    public Rectangle(Point p) {
        super(p);
    }

    public Rectangle(Point p, Color col) {
        super(p, col);
    }

    public Rectangle(int px, int py) {

        super(new Point());
        this.width = px;
        this.length = py;
    }

    public Rectangle(int px, int py, Color c) {
        super(new Point(px, py), c);
        this.length = px;
        this.width = py;

    }

    //method

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public int getSurface() {
        return this.length * this.width;
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.width = widthBB;
        this.length = heightBB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public void draw(Graphics g) {
        int realPx, realPy;

        if (length < 0) {
            realPx = origin.getX() + length;
        } else {
            realPx = origin.getX();
        }

        if (width < 0) {
            realPy = origin.getY() + width;
        } else {
            realPy = origin.getY();
        }

        g.setColor(c);
        g.fillRect(realPx, realPy, Math.abs(length), Math.abs(width));


    }


}
