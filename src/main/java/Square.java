public class Square {

    private int sideLength;

    public Square(int side) {
        sideLength = side;
    }

    public int getPerimeter() {
        return sideLength * 4;
    }
}
