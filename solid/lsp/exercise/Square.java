package solid.lsp.exercise;

public class Square implements Shape{
    private double side;

    public Square(){
        super();
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public double calculateArea(){
        return side * side;
    }
}
