import java.lang.Math;

public class Perimeter {

    private final float PI = 3.14f;
    public double calculatePerimeter (float diameter){
        float radius = diameter / 2;
        double perimeter = 2 * Math.PI * radius;

        return perimeter;

    }
}
