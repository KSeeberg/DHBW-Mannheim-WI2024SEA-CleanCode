package solid.dip.exercise;

public class BasicHands implements Hands {
	@Override
    public void grab(Object o) {
        System.out.println("Grabbing " + o.toString());
    }
}
