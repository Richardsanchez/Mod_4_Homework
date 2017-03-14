/**
 * Created by richarddev on 3/2/17.
 */
public abstract class GeometricObject {
    private String color = "while";
    private boolean bool;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean bool) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.bool = bool;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + bool;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
