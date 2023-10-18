public class Square extends Rectangle{

    public Square(int a, int b) {
        super(a, b);
    }

    public int calculateDiameter(){
        return 2*(a * b);
    };
}
