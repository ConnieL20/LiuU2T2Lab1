public class Point {

    //instance variables
    private int x;
    private int y;

    //constructor that accepts x and y
    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    //constructor that accepts one value
    public Point(int value) {
        x = value;
        y = value;
    }

    //constructor that accepts no value
    public Point() {
        x = 0;
        y = 0;
    }

    //getter methods
    public int getX() {
        return x;
    }

    public int getY(){
        return y;
    }

    //setter methods
    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    //method that returns the coordinate
    public String coordinate(){
        return  "(" + x + ", " + y + ")";
    }

    //method that returns the quadrant
    public String quadrant() {
        if (x > 0 && y > 0 ) {
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else if (x < 0 && y < 0){
            return "III";
        } else if (x == 0 && y == 0) {
            return "origin";
        } else {
            return "on an axis";
        }
    }

}
