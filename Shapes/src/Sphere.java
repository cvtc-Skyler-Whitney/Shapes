
import javax.swing.*;
import java.awt.*;

public class Sphere extends Shape {

    float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Sphere(float radius) {
        this.radius = radius;
    }


    @Override
    public float surfaceArea() {
        float surfaceArea = (float) (4.0 * Math.PI * (radius * radius));
        return surfaceArea;
    }

    @Override
    public float volume() {
        float volume = (float) ((4.0/3.0) * Math.PI * (radius * radius * radius));
        return volume;
    }

    @Override
    public void render() {

        JOptionPane.showMessageDialog(null, "Sphere\n" + "Radius: " + radius + "\nSurfaceArea: " + surfaceArea() + "\nVolume: " + volume());

    }
}
