public class CircleArea {

    public CircleArea (double diameter){
        double result = Math.PI * Math.pow(diameter / 2, 2);
        System.out.printf("Area of circle is %f", result);
    }
}