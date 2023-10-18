public class Rectangle implements GeometricFigure{
    protected int a;
    protected int b;
    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public int calculateArea() {
        return a * b;
    }

}
