package solid.dip.exercise;

public class BasicLegs implements Legs {
	
	@Override
    public void walk(int steps) {
        System.out.println("Walking " + steps + " steps forward.");
    }
   
    @Override
    public void turn(int degree) {
        System.out.println("Turning " + degree + " degrees.");
    }
   
    @Override
    public void turnLeft() {
        turn(270);
    }
   
    @Override
    public void turnRight() {
        turn(90);
    }
   
    @Override
    public void turnAround() {
        turn(180);
    }
}
