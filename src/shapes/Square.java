package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length){
        this.length = length;
        this.width = width;
    }
    @Override
    public void setWidth(double width){
        this.width = width;
        this.length = length;
    }



    @Override
    public double getArea(){
        System.out.println("Square getArea");
        return Math.pow(this.width, 2);
    }

    @Override
    public double getPerimeter() {
        System.out.println("Square getPerimeter");
        return 4 * this.length;
    }
}


