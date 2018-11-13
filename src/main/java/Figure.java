public class Figure {
    public static double squereArea(double a) {
        return Math.pow(a, 2);
    }
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }
    public static double triangleArea(double base,double hight){
        return base*hight/2;
    }
}
